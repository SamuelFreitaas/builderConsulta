
package builderconsulta;


public class Diretor {
    
    private ConcreteConsultaBuilder b;
    
    public Diretor(ConcreteConsultaBuilder b){
        this.b = b;
    }
    
    public void realizarConsulta(String nomePac, String dtNasPac, String telPac, String endPac, String nomeMed, String regMed, String espMed){
        b.cadastrarPaciente(nomePac, dtNasPac, telPac, endPac);
        b.cadastrarMedico(nomeMed, regMed, espMed);  
    }
    
    public void marcarHorarioEData(String data, String horario){
        b.ajustarData(data, horario);
    }
    
   
    
}
