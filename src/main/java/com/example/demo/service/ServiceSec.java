package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AppRole;
import com.example.demo.entity.Users;

@Service
@Transactional
public interface ServiceSec {
	
	Users addNewUser(Users appUser);
	AppRole addNewRole(AppRole appRole);
     Users loadUserByUsername(String username) throws UsernameNotFoundException;
 	List<Users> listUsers();
 	
	
}
