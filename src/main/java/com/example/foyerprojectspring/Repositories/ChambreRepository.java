package com.example.foyerprojectspring.Repositories;

import com.example.foyerprojectspring.Entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
}