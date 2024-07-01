package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra,Long>{
    
    List<Compra> findByUsuarioId(Long id);

}