package tn.esprit.examen.ZammaliYassmine4SIM3Springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examen.ZammaliYassmine4SIM3Springboot.entities.Portefeuille;

public interface PortefeuilleRepository extends JpaRepository<Portefeuille, Long> {
    Portefeuille findByReference(long reference);
}
