package tn.esprit.examen.ZammaliYassmine4SIM3Springboot.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class ElementPortfeuille {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idElement;
    String Symbole;
    long nombreActions;
    float prixAchat;

    public void setIdElement(Long idElement) {
        this.idElement = idElement;
    }

    public void setSymbole(String symbole) {
        Symbole = symbole;
    }

    public void setNombreActions(long nombreActions) {
        this.nombreActions = nombreActions;
    }

    public void setPrixAchat(float prixAchat) {
        this.prixAchat = prixAchat;
    }

    public Long getIdElement() {
        return idElement;
    }

    public String getSymbole() {
        return Symbole;
    }

    public long getNombreActions() {
        return nombreActions;
    }

    public float getPrixAchat() {
        return prixAchat;
    }

    @ManyToOne
    Portefeuille portefeuille;
}
