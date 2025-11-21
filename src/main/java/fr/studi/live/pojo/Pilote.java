package fr.studi.live.pojo;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pilote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long piloteId;

    private String nom;

    private String prenom;

    private Integer numero;

    private String pays;
}
