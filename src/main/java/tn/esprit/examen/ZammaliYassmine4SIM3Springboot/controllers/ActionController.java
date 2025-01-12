package tn.esprit.examen.ZammaliYassmine4SIM3Springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.ZammaliYassmine4SIM3Springboot.entities.Action;
import tn.esprit.examen.ZammaliYassmine4SIM3Springboot.services.ActionService;

import java.util.List;

@RestController
@RequestMapping("/actions")
public class ActionController {

    @Autowired
    private ActionService actionService;

    @PostMapping
    public List<Action> addActions(@RequestBody List<Action> listeActions) {
        return actionService.addActions(listeActions);
    }
}
