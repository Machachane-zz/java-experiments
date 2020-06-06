
package cvideo2b;

public abstract class Pessoa {
    
    private String nome;
    private int idade;
    private String sexo;
    
  //---------------------------------------------------------------- COSTRUCTOR  
    /*
    Pessoa(String n, int i, String s){
        this.nome = n;
        this.idade = i;
        this.sexo = s;
    }
    
    */
 //-------------------------------------------------------------------- METHODS   
    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }
//--------------------------------------------------------- GETTERS AND SETTERS
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
    
    //------------------------------------------------------------------- PRINT

    @Override
    public String toString() {
        return "Pessoa: " + "Nome = " + nome + ", Idade = " + idade + ", Sexo = " + sexo;
    }
    
    
    
}
