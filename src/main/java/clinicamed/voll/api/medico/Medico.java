package clinicamed.voll.api.medico;

import clinicamed.voll.api.endereco.Endereco;
import jakarta.persistence.*;

@Table(name = "medicos")
@Entity(name = "Medico")
public class Medico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String nome;
    private  String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @Embedded
    private Endereco endereco;


}
