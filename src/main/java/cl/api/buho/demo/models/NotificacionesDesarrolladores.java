package cl.api.buho.demo.models;

import jakarta.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "notificacion_desarrollador")
public class NotificacionesDesarrolladores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_notificacion_desarrollador;

    private String observacion;

    @ManyToOne
    @JoinColumn(name = "id_asignacion")
    private Asignaciones asignacion;
}
