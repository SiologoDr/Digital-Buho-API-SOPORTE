package cl.api.buho.demo.models;

import jakarta.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "desarrollador")
public class Desarrolladores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_desarrollador;

    private String area;

    @OneToOne
    @JoinColumn(name = "id_persona")
    private Personas persona;
}
