
package cvideo2b;

public class Reptil extends Animal {
    
    private String corEscama;

    //---------------------------------------------------- GETTERS AND SETTERS

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    //--------------------------------------------------- METHODS
    
    @Override
    public void locomover() {
        System.out.println("Reptil Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Reptil Comenso Vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Reptil");
    }
    
    
    
}
