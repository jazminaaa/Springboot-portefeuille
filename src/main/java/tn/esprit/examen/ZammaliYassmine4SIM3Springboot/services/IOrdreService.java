package tn.esprit.examen.ZammaliYassmine4SIM3Springboot.services;

import tn.esprit.examen.ZammaliYassmine4SIM3Springboot.entities.Ordre;

public interface IOrdreService {
    Ordre addOrderAndAffectToActionAndPortefeuille(Ordre ordre,String symbole,long reference);
}
