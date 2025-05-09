package cl.api.buho.demo.models;

import jakarta.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "notificacion_cliente")
public class NotificacionesClientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_notificacion_cliente;

    private String observacion;

    @ManyToOne
    @JoinColumn(name = "id_solicitud")
    private Solicitudes solicitud;
}
