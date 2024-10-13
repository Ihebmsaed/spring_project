package com.example.foyerprojectspring.Controllers;

import com.example.foyerprojectspring.Entities.Chambre;
import com.example.foyerprojectspring.Services.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/chambre")

public class ChambreController  {
    IChambreService chambreService;
    @PostMapping("addchambre")
    public Chambre ajoutChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }

    @GetMapping("getchambre/{idChambre}")
    public Chambre getChambre(@PathVariable("idChambre") long idChambre) {
        return chambreService.getChambreById(idChambre);
    }

    @DeleteMapping("deletechambre")
    public void deleteChambre(@RequestBody Chambre chambre) {
        chambreService.deleteChambre(chambre);
    }

    @PutMapping("updatechambre")
    public Chambre modifierChambre(@RequestBody Chambre chambre) {
        return chambreService.updateChambre(chambre);
    }

    @GetMapping("getallchambre")
    public List<Chambre> getAllChambre() {
        return chambreService.getAllChambre();
    }

}