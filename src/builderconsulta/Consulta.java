
package builderconsulta;

public class Consulta {
    
    private String data;
    private String horario;
    private Medico medico;
    private Paciente paciente;
    
    public void agendarConsulta(Paciente pac, Medico med, String data, String horario){
        this.paciente = pac;
        this.medico = med;
        this.data = data;
        this.horario = horario;
    }
    
    public void emitirAgendamento(){
        System.out.println("Data da Consulta: " + this.data);
        System.out.println("Horário: "+this.horario);
        
        System.out.println("Paciente ------- "+ this.paciente);
        System.out.println("Médico ------ "+this.medico);
        
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
    
}
