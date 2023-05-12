package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AppRoleDTO;
import com.example.demo.entity.AppRole;
import com.example.demo.mapper.MyMapper;
import com.example.demo.repositorie.AppRoleRepository;

import lombok.extern.slf4j.Slf4j;

@Transactional
@Slf4j
@Service

public class AppRoleService {
	@Autowired
	  private  AppRoleRepository appRoleRepository;

	
	@Autowired
	  private  MyMapper myMapper;

////////Affichage Role ////////////////
public List<AppRoleDTO> GetRoles(){
List<AppRole> appRole =   appRoleRepository.findAll();
try {

return     appRole.stream().map(myMapper::toAppRoleDTO).collect(Collectors.toList());
} catch (Exception e) {
log.trace("  la methode AppRoleDTO"+appRole);
System.out.println("GetAppRoleDTO methode exception"+e);
return null;

}
}
}
