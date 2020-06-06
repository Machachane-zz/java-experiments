
package cvideo2b;

public class Ave extends Animal {
    private String corPena;
    
    //----------------------------------------------------- GETTERS AND SETTERS

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    //------------------------------------------------------- METHODS
    
    @Override
    public void locomover(){
        System.out.println("Ave Voando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Ave Comendo Frutas");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som Da Ave");
    }
    
    public void fazerNinho(){
        System.out.println("Construiu Um Ninho");
    }
}
