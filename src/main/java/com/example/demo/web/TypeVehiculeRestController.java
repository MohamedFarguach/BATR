package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TypeVehiculeDTO;
import com.example.demo.service.TypeVehiculeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin(origins="*")

//@EnableJpaRepositories 
@Slf4j
public class TypeVehiculeRestController {
       
	@Autowired
	private TypeVehiculeService typeVehiculeService;

///////////Ajoute MarqueDTO/////////////////////////// 
	
@PostMapping(path="/AjouteTypeVehicule")
@ResponseStatus(code = HttpStatus.CREATED)

public TypeVehiculeDTO AjouteTypeVehicule(@RequestBody TypeVehiculeDTO typevehiculeDTO){
log.trace(" RestControlerTypeVehiculeDTO la methode TypeVehiculeDTO");
return  typeVehiculeService.AjouteTypeVehicule(typevehiculeDTO);
}
///////////Modefier MraqueDTO///////////////////////////
@PutMapping(path="/PutTypeVehicule/{id}")
@ResponseStatus(code = HttpStatus.ACCEPTED)

public void ModefieTypeVehicule(@RequestBody TypeVehiculeDTO typevehiculeDTO, @PathVariable long id ) {
log.trace(" RestControlerTypeVehiculela methode ModefieTypeVehicule");

typeVehiculeService.ModefierTypeLieux(typevehiculeDTO,id);
}
///////////////////////////   delete marque  ///////////////////////////////

@DeleteMapping(path="/deleteTypeVehicule/{id}")
@ResponseStatus(code = HttpStatus.ACCEPTED)

public void DeleteTypeVehiculeDTO(@PathVariable long id ) {
log.trace(" RestControlerTypeVehiculeDTO la methode DeleteTypeVehiculeDTO");

typeVehiculeService.DeletetypeVehicule(id);
}

/////////Affichage  Marque ////////////////
@GetMapping(path="/GetTypeVehicule")
@ResponseStatus(code = HttpStatus.ACCEPTED)

public List<TypeVehiculeDTO> GetMarque(){
log.trace(" RestControlerVehicule la methode GetVehicule");

return   typeVehiculeService.GetTypeVehicule();
}
////////Find  Marque ////////////////
@GetMapping(path="/afficheTypeVehicule/{id}")
@ResponseStatus(code = HttpStatus.ACCEPTED)

public TypeVehiculeDTO findMarque( @PathVariable Long id){
log.trace(" RestControlerTypeVehiculeDTO la methode TypeVehiculeDTO");

return   typeVehiculeService.FindtypeVehicule(id);
}
}
