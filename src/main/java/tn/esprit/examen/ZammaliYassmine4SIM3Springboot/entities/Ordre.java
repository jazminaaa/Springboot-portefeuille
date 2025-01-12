package tn.esprit.examen.ZammaliYassmine4SIM3Springboot.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Ordre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrdre;
    private long volume;
    private LocalDate dateCreation;
    private LocalDate dateExecution;
    private float montant;
    @Enumerated(EnumType.STRING)
    private Statut statut;
    @Enumerated(EnumType.STRING)
    private TypeOrdre typeOrdre;


    public void setIdOrdre(Long idOrdre) {
        this.idOrdre = idOrdre;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setDateExecution(LocalDate dateExecution) {
        this.dateExecution = dateExecution;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public void setTypeOrdre(TypeOrdre typeOrdre) {
        this.typeOrdre = typeOrdre;
    }

    public Long getIdOrdre() {
        return idOrdre;
    }

    public long getVolume() {
        return volume;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public LocalDate getDateExecution() {
        return dateExecution;
    }

    public float getMontant() {
        return montant;
    }

    public Statut getStatut() {
        return statut;
    }

    public TypeOrdre getTypeOrdre() {
        return typeOrdre;
    }

    @ManyToOne
    Portefeuille portefeuille;
    @ManyToOne
    Action action;
}
