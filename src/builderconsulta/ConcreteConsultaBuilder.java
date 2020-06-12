
package builderconsulta;

public class ConcreteConsultaBuilder implements ConsultaBuilder {

    public Consulta consulta;
    
    public ConcreteConsultaBuilder(){
        this.consulta = new Consulta();
    }
    
    @Override
    public void cadastrarPaciente(String nome, String data_nascimento, String telefone, String endereço) {
        Paciente p1 = new Paciente();
        p1.setData_nascimento(data_nascimento);
        p1.setEndereço(endereço);
        p1.setNome(nome);
        p1.setTelefone(telefone);
        this.consulta.setPaciente(p1);
    }

    @Override
    public void cadastrarMedico(String nome, String registroMedico, String especialidade) {
       Medico m1 = new Medico();
       m1.setEspecialidade(especialidade);
       m1.setNome(nome);
       m1.setRegistroMedico(registroMedico);
       this.consulta.setMedico(m1);
    }
    
    public void ajustarData(String data, String horario){
        this.consulta.setData(data);
        this.consulta.setHorario(horario);
    }

    @Override
    public Consulta cadastrarConsulta() {
        return this.consulta;
    }
    
    
    
}
