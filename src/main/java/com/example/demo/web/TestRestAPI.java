package com.example.demo.web;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
@PreAuthorize("hasAuthority('SCOPE_USER')")
public class TestRestAPI {
  
}