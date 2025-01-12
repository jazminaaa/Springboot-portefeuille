package tn.esprit.examen.ZammaliYassmine4SIM3Springboot.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Action {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idAction;
    float prixAchatActuel;
    float prixVenteActuel;
    long volume;
    LocalDate dateEmission;
    String symbole;


    public void setIdAction(Long idAction) {
        this.idAction = idAction;
    }

    public void setPrixAchatActuel(float prixAchatActuel) {
        this.prixAchatActuel = prixAchatActuel;
    }

    public void setPrixVenteActuel(float prixVenteActuel) {
        this.prixVenteActuel = prixVenteActuel;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public void setDateEmission(LocalDate dateEmission) {
        this.dateEmission = dateEmission;
    }

    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }

    public Long getIdAction() {
        return idAction;
    }

    public float getPrixAchatActuel() {
        return prixAchatActuel;
    }

    public float getPrixVenteActuel() {
        return prixVenteActuel;
    }

    public long getVolume() {
        return volume;
    }

    public LocalDate getDateEmission() {
        return dateEmission;
    }

    public String getSymbole() {
        return symbole;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy="action")
    private Set<Ordre> Ordres;
}
