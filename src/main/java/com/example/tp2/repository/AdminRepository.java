package com.example.tp2.repository;

import com.example.tp2.model.admin.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository <Admin, Integer> {
    Optional<Admin> findByMail(String email);
}
