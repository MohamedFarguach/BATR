package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ChantierDTO;
import com.example.demo.entity.Chantier;
import com.example.demo.mapper.MyMapper;
import com.example.demo.repositorie.ChantierRepository;

import lombok.extern.slf4j.Slf4j;

@Transactional
@Slf4j
@Service

public class ChantierService {
	////
	@Autowired
	  private  ChantierRepository chantierRepository;

	@Autowired
	 private ModelMapper modelMapper; 
	@Autowired
	  private  MyMapper myMapper;



////////Ajoute Info Chantier ///////////////////

public ChantierDTO AjouteInfoChantier(ChantierDTO chantierDTO){
Chantier  chantier  = modelMapper.map(chantierDTO, Chantier.class);
try {
  chantierRepository.save(chantier);
chantierDTO.setId(chantier.getId());
 
return  chantierDTO;

} catch (Exception e) {
// TODO: handle exception
log.trace(" chantier la methode AjouteInfochantier"+chantier);

System.out.println(" Ajoute Info Chantier  exception   n "+e);
}
return  null;


} 

/*
 * private ChantierDTO chantierDTO(HttpStatus created) { return null; }
 */
//////////////////Modefier Chantier //////////////////////

public ChantierDTO ModefierChantier(ChantierDTO chantierDTO,long id){
Chantier chantier = modelMapper.map(chantierDTO, Chantier.class);
try {
chantier.setId(id);
chantierRepository.save(chantier);
chantierDTO.setId(chantier.getId());

return  chantierDTO;

} catch (Exception e) {
//TODO: handle exception
log.trace("  la methode ModefierchantierDTO"+chantier);
System.out.println("Modefier Chantier "+e);
}
return  null;


} 
////////delete Chantier //////////////::
public  void DeleteChantier(Long id) {	
log.trace("  la methode DeleteChantier");

chantierRepository.deleteById(id);
}
///////// Affichage Chantier ////////////////
public List<ChantierDTO> GetChantier(){
List<Chantier> chantier =   chantierRepository.findAll();
try {

return     chantier.stream().map(myMapper::toChantierDTO).collect(Collectors.toList());
} catch (Exception e) {
log.trace("  la methode GetChantier"+chantier);
System.out.println("GetChantier methode exception"+e);
return null;

}
}
}
