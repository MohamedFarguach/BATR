package com.example.demo.config;

import java.util.Optional;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.data.domain.AuditorAware;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class AuditorAwareImpl implements AuditorAware<String>{

	@Override
	public Optional<String> getCurrentAuditor() {
		 String currentUserName = null;
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			if (!(authentication instanceof AnonymousAuthenticationToken)) {
			     currentUserName = authentication.getName();
							    
	               
			}
			log.info("Optional<String> getCurrentAuditor()");
			return  Optional.of(currentUserName);
			

		}

}
