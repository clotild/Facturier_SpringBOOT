package com.example.tp2.repository;

import com.example.tp2.model.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactureRepository extends JpaRepository <Facture, Integer> {
}
