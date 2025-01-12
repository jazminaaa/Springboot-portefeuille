package tn.esprit.examen.ZammaliYassmine4SIM3Springboot.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.examen.ZammaliYassmine4SIM3Springboot.entities.Action;
import tn.esprit.examen.ZammaliYassmine4SIM3Springboot.entities.Ordre;
import tn.esprit.examen.ZammaliYassmine4SIM3Springboot.entities.Portefeuille;
import tn.esprit.examen.ZammaliYassmine4SIM3Springboot.repositories.ActionRepository;
import tn.esprit.examen.ZammaliYassmine4SIM3Springboot.repositories.OrdreRepository;
import tn.esprit.examen.ZammaliYassmine4SIM3Springboot.repositories.PortefeuilleRepository;

@Slf4j
@RequiredArgsConstructor
@Service
public class OrdreService implements IOrdreService{
    @Autowired
    private OrdreRepository ordreRepo;

    @Autowired
    private ActionRepository actionRepo;

    @Autowired
    private PortefeuilleRepository portefeuilleRepo;

    @Override
    public Ordre addOrderAndAffectToActionAndPortefeuille(Ordre ordre, String symbole, long reference) {
        // Fetch Action by symbole
        Action action = actionRepo.findBySymbole(symbole);
        if (action == null) {
            throw new RuntimeException("Action with symbole " + symbole + " not found");
        }

        // Fetch Portefeuille by reference
        Portefeuille portefeuille = portefeuilleRepo.findByReference(reference);
        if (portefeuille == null) {
            throw new RuntimeException("Portefeuille with reference " + reference + " not found");
        }

        // Set the associations
        ordre.setAction(action);
        ordre.setPortefeuille(portefeuille);

        // Save the order
        return ordreRepo.save(ordre);
    }
}
