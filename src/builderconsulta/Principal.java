
package builderconsulta;

public class Principal {

    
    public static void main(String[] args) {
        
        ConcreteConsultaBuilder consultaBuilder = new ConcreteConsultaBuilder();
        Diretor dir = new Diretor(consultaBuilder);
        dir.realizarConsulta("Fulana de Tal", "18/10/2003", "4002-8922", "Rua das Mil Noites nº 442", "Greysa Natomi", "7489/09", "Otorrinolaringologia");
        dir.marcarHorarioEData("27/06/2020", "14h20");
        Consulta consulta = consultaBuilder.cadastrarConsulta();
        consulta.emitirAgendamento();
        
    }
    
}
