package tn.esprit.examen.ZammaliYassmine4SIM3Springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examen.ZammaliYassmine4SIM3Springboot.entities.Action;

public interface ActionRepository extends JpaRepository<Action, Long> {
    Action findBySymbole(String symbole);
}
