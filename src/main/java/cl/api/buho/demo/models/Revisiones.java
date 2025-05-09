package cl.api.buho.demo.models;

import jakarta.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "revision")
public class Revisiones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_revision;

    private String revision;
    private String descripcion;
}
