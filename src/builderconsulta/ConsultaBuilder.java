
package builderconsulta;

public interface ConsultaBuilder {
    
    void cadastrarPaciente(String nome, String data_nascimento, String telefone, String endereço);
    void cadastrarMedico(String nome,String registroMedico, String especialidade);
    
    Consulta cadastrarConsulta();
    
}
