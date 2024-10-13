package com.example.foyerprojectspring.Entities;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Etudiant {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private  Long cin;
    private String ecole;
    private Date dateNaissance;

    @ManyToMany(mappedBy="etudiants", cascade = CascadeType.ALL)
    private Set<Resevation> reservations;

}
