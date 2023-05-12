package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ResponsableChargeDTO;
import com.example.demo.entity.ResponsableCharge;
import com.example.demo.mapper.MyMapper;
import com.example.demo.repositorie.ResponsableChargeRepository;

import lombok.extern.slf4j.Slf4j;
@Transactional
@Slf4j
@Service
public class ResponsableChargeService {
 ///
	@Autowired
    private ResponsableChargeRepository responsableChargeRepository;
	@Autowired
	 private ModelMapper modelMapper; 
	@Autowired
	  private  MyMapper myMapper;

///////Ajoute Info  Responsable ///////////////////
	
public ResponsableChargeDTO AjouteInfoResponsableChargeDTO(ResponsableChargeDTO responsableChargeDTO){
	ResponsableCharge  responsableCharge  = modelMapper.map(responsableChargeDTO, ResponsableCharge.class);
try {
	responsableChargeRepository.save(responsableCharge);
	responsableChargeDTO.setId(responsableCharge.getId());

return  responsableChargeDTO;

} catch (Exception e) {
log.trace(" la methode AjouteInforesponsableChargeDTO"+responsableChargeDTO);

System.out.println("Ajoute Info responsableChargeDTO exception   n "+e);
}
return  null;

}

//////////////////Modefier ResponsableCharge //////////////////////

public ResponsableChargeDTO  ModefierResponsableCharge(ResponsableChargeDTO  responsableChargeDTO,long id){
 ResponsableCharge  responsableCharge = modelMapper.map(responsableChargeDTO, ResponsableCharge.class);
try {
	responsableCharge.setId(id);
	responsableChargeRepository.save(responsableCharge);
 responsableChargeDTO.setId(responsableCharge.getId());

return  responsableChargeDTO;

} catch (Exception e) {
//TODO: handle exception
log.trace("  la methode ModefierresponsableChargeDTO"+responsableChargeDTO);

System.out.println("Modefier responsableChargeDTO "+e);
}
return  null;


} 

///////// Affichage ResponsableChargeDTO ////////////////
public List<ResponsableChargeDTO> GetResponsableChargeDTO(){
List<ResponsableCharge> responsableCharge =   responsableChargeRepository.findAll();
try {

return     responsableCharge.stream().map(myMapper::toResponsableChargDTO).collect(Collectors.toList());
} catch (Exception e) {
log.trace("  la methode responsableCharge"+responsableCharge);
System.out.println("GetresponsableCharge methode exception"+e);
return null;

}

}

////////delete ResponsableChargeDTO //////////////::
public  void DeleteResponsableCharge(Long id) {	
log.trace("  la methode DeleteResponsableCharge");
responsableChargeRepository.deleteById(id);
}
/////////////  FindResponsableChargeDTOBYID///////////////
public ResponsableChargeDTO FindResponsableCharge(Long id){
Optional<ResponsableCharge> responsableCharge =   responsableChargeRepository.findById(id);
ResponsableChargeDTO responsableChargeDTO  = myMapper.toResponsableChargeDTO(responsableCharge);
try {
return responsableChargeDTO;
} catch (Exception e) {
log.trace("  la methode GetresponsableChargeDTO"+responsableChargeDTO);
System.out.println("GetresponsableChargeDTO methode exception"+e);
return null;

}
}




}
