package tn.esprit.examen.ZammaliYassmine4SIM3Springboot.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Portefeuille {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPortefeuille;
    private long reference;
    private float solde;


    public void setIdPortefeuille(Long idPortefeuille) {
        this.idPortefeuille = idPortefeuille;
    }

    public void setReference(long reference) {
        this.reference = reference;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public Long getIdPortefeuille() {
        return idPortefeuille;
    }

    public long getReference() {
        return reference;
    }

    public float getSolde() {
        return solde;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy="portefeuille")
    private Set<Ordre> ordres = new HashSet<Ordre>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy="portefeuille")
    private Set<ElementPortfeuille> elementPortefeuilles;
}
