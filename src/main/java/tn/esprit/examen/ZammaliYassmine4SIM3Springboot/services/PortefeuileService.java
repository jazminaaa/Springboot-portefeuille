package tn.esprit.examen.ZammaliYassmine4SIM3Springboot.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.examen.ZammaliYassmine4SIM3Springboot.entities.Portefeuille;
import tn.esprit.examen.ZammaliYassmine4SIM3Springboot.repositories.PortefeuilleRepository;

@Slf4j
@RequiredArgsConstructor
@Service
public class PortefeuileService implements IPortefeuileService{
    @Autowired
    private PortefeuilleRepository portefeuilleRepo;

    @Override
    public Portefeuille addPortefeuille(Portefeuille portefeuille) {
        return portefeuilleRepo.save(portefeuille);
    }
}
