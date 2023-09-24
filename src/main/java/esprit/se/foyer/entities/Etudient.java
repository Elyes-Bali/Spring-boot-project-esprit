package esprit.se.foyer.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
@Entity
@Table( name = "Etudiant")
public class Etudient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Long idEtudiant; // Clé primaire
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
}
