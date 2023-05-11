package clinicamed.voll.api.controller;

import clinicamed.voll.api.paciente.DadosCadastroPaciente;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacientes")
public class PacienteController {


    public void cadastrar(DadosCadastroPaciente dados){
        System.out.println("Dados recebidos: " + dados);
    }
}
