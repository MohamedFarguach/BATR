package com.example.demo.service;

import java.io.IOException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Filelivraison;
import com.example.demo.repositorie.FilelivraisonRepository;

import lombok.extern.slf4j.Slf4j;

@Transactional
@Slf4j
@Service
public class FileService {
	@Autowired
	private FilelivraisonRepository filelivraisonRepository;
	


////////delete File //////////////

public  void DeleteFile(Long id) {	
log.trace("  la methode DeleteLigneLivraison");
filelivraisonRepository.deleteById(id);
}
/////////////////////Get File /////////////////

public byte[] getFileFromTable(Long id) throws IOException {
	Filelivraison entity = filelivraisonRepository.findById(id).orElseThrow(() -> new RuntimeException("Pas trouve file"));
	log.trace("  la methode getFileFromTable(Long id)");
    return  entity.getData();
}
}
