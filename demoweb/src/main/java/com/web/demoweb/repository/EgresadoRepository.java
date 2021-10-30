package com.web.demoweb.repository;

import java.util.List;

import com.web.demoweb.model.Egresado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface EgresadoRepository extends JpaRepository<Egresado, Integer>{
   
}
