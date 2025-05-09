package cl.api.buho.demo.models;

import jakarta.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "cliente")
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;

    private String ruc;

    @OneToOne
    @JoinColumn(name = "id_persona")
    private Personas persona;
}
