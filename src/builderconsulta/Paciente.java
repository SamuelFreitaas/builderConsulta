
package builderconsulta;


public class Paciente {
    
    private String nome;
    private String data_nascimento;
    private String telefone;
    private String endereço;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nData de nascimento: " + data_nascimento + "\nTelefone: " + telefone + "\nEndereço: " + endereço;
    }
    
    
    
}
