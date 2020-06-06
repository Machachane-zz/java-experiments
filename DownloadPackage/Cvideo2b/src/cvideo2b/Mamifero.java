
package cvideo2b;

public class Mamifero extends Animal {
    
    protected String corPelo;
    
    //----------------------------------------------------- GETTERS AND SETTERS

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    //----------------------------------------------------- METHODS
    
    @Override
    public void locomover(){
        System.out.println("Mamifero Correndo");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Mamifero Mamando");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de Mamifero");
    }
    
}
