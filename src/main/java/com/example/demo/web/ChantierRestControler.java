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

import com.example.demo.dto.ChantierDTO;
import com.example.demo.service.ChantierService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins="*")
//@EnableJpaRepositories 
@Slf4j
public class ChantierRestControler {
	
	@Autowired
	private ChantierService serviceChantier;
	

	
////////Affichage  Chantier ////////////////
@GetMapping(path="/GetChantier")
@ResponseStatus(code = HttpStatus.ACCEPTED)
public List<ChantierDTO> GetChantier(){
	log.trace(" RestControlerChantier la methode GetChantier");

return   serviceChantier.GetChantier();
}

///////////////////////////   deletet  Chantier  ///////////////////////////////

@DeleteMapping(path="/deletChantier/{id}")
@ResponseStatus(code = HttpStatus.ACCEPTED)
public void DeleteChantierDTO(@PathVariable long id ) {
	log.trace(" RestControlerChantier la methode DeleteChantierDTO");

	serviceChantier.DeleteChantier(id);

}
///////////Modefier chantierDTO////////////////////////////
@PutMapping(path="/PutChantier/{id}")
@ResponseStatus(code = HttpStatus.CREATED)

public void ModefierChantiern(@RequestBody ChantierDTO chantierDTO, @PathVariable long id ) {
	log.trace(" RestControlerChantier la methode ModefierChantiern");

	serviceChantier.ModefierChantier(chantierDTO,id);

}
/////////////////  AjouteChantier /////////////////

@PostMapping(path="/AjouteChantier")
@ResponseStatus(code = HttpStatus.CREATED)

public ChantierDTO AjouteChantier(@RequestBody ChantierDTO chantierDTO){
	log.trace(" RestControlerChantier la methode AjouteChantier");

return  serviceChantier.AjouteInfoChantier(chantierDTO);
}




}
