package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AppRoleDTO;
import com.example.demo.service.AppRoleService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins="*")
//@EnableJpaRepositories 
@Slf4j
public class AppRoleRestController {
	@Autowired
	  private AppRoleService appRoleService;
	

////////Affichage  AppRole ////////////////
@GetMapping(path="/GetRole")
@ResponseStatus(code = HttpStatus.ACCEPTED)
public List<AppRoleDTO> GetApprole(){
log.trace(" RestControlerAppRole la methode GetRole");

return   appRoleService.GetRoles();
}
}
