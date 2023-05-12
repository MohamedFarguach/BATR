package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AppRole;
import com.example.demo.entity.Users;
import com.example.demo.repositorie.AppRoleRepository;
import com.example.demo.repositorie.AppUserRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional

@RequiredArgsConstructor
public class AccountServiceImp implements ServiceSec {
	 
    @Autowired
	private AppRoleRepository appRoleRepositorie;
    @Autowired
     private AppUserRepository appUserRepositorie;
    @Autowired
 	private PasswordEncoder passwordEncoder;
   
     
	@Override
	public Users addNewUser(Users appUser) {
		// TODO Auto-generated method stub
		  String pw=appUser.getPassword();
			  appUser.setPassword(passwordEncoder.encode(pw));
			
		return appUserRepositorie.save(appUser);
	}

	@Override
	public AppRole addNewRole(AppRole appRole) {
		// TODO Auto-generated method stub
		return appRoleRepositorie.save(appRole);
	}

	@Override
	public Users loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return appUserRepositorie.findByUsername(username);
	}

	@Override
	public List<Users> listUsers() {
		// TODO Auto-generated method stub
		return appUserRepositorie.findAll();
	}

	
}
