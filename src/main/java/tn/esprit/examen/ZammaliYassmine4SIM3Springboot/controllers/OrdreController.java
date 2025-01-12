package tn.esprit.examen.ZammaliYassmine4SIM3Springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.ZammaliYassmine4SIM3Springboot.entities.Ordre;
import tn.esprit.examen.ZammaliYassmine4SIM3Springboot.services.OrdreService;

@RestController
@RequestMapping("/ordre")
public class  OrdreController {

    @Autowired
    private OrdreService ordreService;

    @PostMapping("/add")
    public Ordre addOrder(@RequestBody Ordre ordre,
                          @RequestParam String symbole,
                          @RequestParam long reference) {
        return ordreService.addOrderAndAffectToActionAndPortefeuille(ordre, symbole, reference);
    }
}
