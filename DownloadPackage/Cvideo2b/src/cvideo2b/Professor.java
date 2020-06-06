
package cvideo2b;

public class Professor extends Pessoa {
    private String especialidadde;
    private float salario;
    
    //---------------------------------------------------- CONSTRUCTOR

    public Professor() {
    }
    
    //------------------------------------------------------ GETTERS AND SETTERS

    public String getEspecialidadde() {
        return especialidadde;
    }

    public void setEspecialidadde(String especialidadde) {
        this.especialidadde = especialidadde;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    //--------------------------------------------------------- METHODS
    
    public void receberAum(){
        
    }
    
    @Override
    public String toString() {
        return "Professor: " + "Nome = " + this.getNome() + ", Idade = " + this.getIdade() + ", Sexo = " + this.getSexo() + ", Especialidade = " + this.getEspecialidadde() +", Salario = " + this.getSalario();
    }
}
