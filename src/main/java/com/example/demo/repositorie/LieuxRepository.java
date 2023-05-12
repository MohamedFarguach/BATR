package com.example.demo.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entity.Lieux;
@CrossOrigin(origins="*")
@Repository
public interface LieuxRepository extends JpaRepository<Lieux, Long> {

}
