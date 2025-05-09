package cl.api.buho.demo.models;

import jakarta.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "tecnico")
public class Tecnicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tecnico;

    private String especialidad;

    @OneToOne
    @JoinColumn(name = "id_persona")
    private Personas persona;
}
