
package cvideo2b;

public class Gafanhoto extends Pessoaa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);               // super - means that Gafanhoto class needs to inherit the constructor from the super class Pessoaa    }
        this.login = login;
        this.totAssistido = 0;
    }
    //----------------------------------------------------- GETTERS AND SETTERS

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    //--------------------------------------------------------- METHODS
    
    public void viuMaisUm(){
        
    }
    
    //----------------------------------------------------------- PRINT
/* 
    @Override
    public String toString() {
        return "Gafanhoto: " + "Nome = " + nome + ", Idade = " + idade + ", Sexo = " + sexo + ", Experiencia = " + experiencia + ", Login = " + login + ", TotAssistido = " + totAssistido;
    }
*/
    @Override
    public String toString() {
        return "Gafanhoto | " + super.toString() + ", Login=" + login + ", TotAssistido=" + totAssistido;
    }       // the "super" part means that it brings the "toString" from the superclass and then I just add what is necessary for the Gafanhoto class
    
    
}
