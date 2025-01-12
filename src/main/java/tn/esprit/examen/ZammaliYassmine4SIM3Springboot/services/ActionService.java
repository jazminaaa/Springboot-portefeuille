package tn.esprit.examen.ZammaliYassmine4SIM3Springboot.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.examen.ZammaliYassmine4SIM3Springboot.entities.Action;
import tn.esprit.examen.ZammaliYassmine4SIM3Springboot.repositories.ActionRepository;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class ActionService implements IActionService{
    @Autowired
    private ActionRepository actionRepo;

    @Override
    public List<Action> addActions(List<Action> listeActions) {
        return actionRepo.saveAll(listeActions);
    }
}
