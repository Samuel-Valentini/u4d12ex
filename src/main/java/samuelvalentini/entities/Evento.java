package samuelvalentini.entities;

import jakarta.persistence.*;
import samuelvalentini.TipoEvento;

import java.time.LocalDate;

@Entity
@Table(name = "eventi")

public class Evento {
    @Id
    private long id;
    @Column(name = "nome_evento")
    private String titolo;
    @Column(name = "data")
    private LocalDate dataEvento;
    private String descrizione;
    @Column(name = "tipo", length = 30)
    @Enumerated(EnumType.STRING)
    private TipoEvento tipoEvento;
    @Column(name = "numero_max_partecipanti")
    private int numeroMassimoPartecipanti;


}
