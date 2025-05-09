    package cl.api.buho.demo.models;

    import jakarta.persistence.*;

    import lombok.*;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Table (name = "persona")
    public class Personas {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id_persona;

        private String nombre;
        private String correo;
        private String telefono;

        @OneToOne
        @JoinColumn(name = "id_usuario")
        private Usuarios usuario;
    }
