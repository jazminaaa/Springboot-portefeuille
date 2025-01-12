package tn.esprit.examen.ZammaliYassmine4SIM3Springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.ZammaliYassmine4SIM3Springboot.entities.Portefeuille;
import tn.esprit.examen.ZammaliYassmine4SIM3Springboot.services.PortefeuileService;

@RestController
@RequestMapping("/portefeuilles")
public class PortefeuilleController {

    @Autowired
    private PortefeuileService portefeuilleService;

    @PostMapping
    public Portefeuille addPortefeuille(@RequestBody Portefeuille portefeuille) {
        return portefeuilleService.addPortefeuille(portefeuille);
    }
}
