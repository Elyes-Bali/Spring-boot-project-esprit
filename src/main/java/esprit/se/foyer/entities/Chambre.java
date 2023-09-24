package esprit.se.foyer.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.lang.reflect.Type;

@Entity
@Table( name = "Chambre")
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idChambre")
    private Long numeroChambre; // Clé primaire
    private String Typec;
    private Long Bloc;
}
