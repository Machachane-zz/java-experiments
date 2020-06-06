package cvideo2b;

public class Aluno extends Pessoa{
    
    private int matr;
    private String currso;
    
    //-------------------------------------------- CONSTRUCTOR
    
    Aluno(){
        
    }
    
    //-------------------------------------------- GETTERS AND SETTERS

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurrso() {
        return currso;
    }

    public void setCurrso(String currso) {
        this.currso = currso;
    }
    
    //------------------------------------------ METHODS
    
    public void cancelarMatr(){
        
    }
    
    public void pagarMensalidade(){
        
    }
    
    @Override
    public String toString() {
        return "Aluno: " + "Nome = " + this.getNome() + ", Idade = " + this.getIdade() + ", Sexo = " + this.getSexo() + ", Curso = " + this.getCurrso() + ", Matricula = " + this.getMatr();
    }
}
