
package cvideo2b;

public abstract class Pessoaa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;
    
    //------------------------------------------------------------- CONSTRUCTOR

    public Pessoaa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    
    //----------------------------------------------------- GETTERS AND SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }
    
    //--------------------------------------------------------- METHODS
    
    protected void ganharExp(){
        
    }
    
    //---------------------------------------------------------- PRINT

    @Override
    public String toString() {
        return "Pessoaa: " + "Nome = " + nome + ", Idade = " + idade + ", Sexo = " + sexo + ", Experiencia = " + experiencia;
    }
    
    
}
