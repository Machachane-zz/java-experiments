
package cvideo2b;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;
    
    //------------------------------------------------------- CONSTRUCTOR

    public Funcionario() {
    }
    
    //------------------------------------------------------- GETTERS AND SETTERS

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    //--------------------------------------------------------- METHODS
    
    public void mudarTrabalho(){
        
    }
    
    @Override
    public String toString() {
        return "Funcionario: " + "Nome = " + this.getNome() + ", Idade = " + this.getIdade() + ", Sexo = " + this.getSexo() + ", Sector = " + this.getSetor() + ", Trabalhando = " + this.isTrabalhando();
    }
    
    
}
