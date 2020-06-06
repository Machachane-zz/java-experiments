/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvideo2b;

/**
 *
 * @author Machachane
 */
public class Peixe extends Animal{
    
    private String corEscama;
    
    //---------------------------------------------------- GETTERS AND SETTERS

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    //---------------------------------------------------- METHODS
    
    public void soltarBolha(){
        System.out.println("Peixe Soltou Uma Bolha");
    }
    
    @Override
    public void locomover() {
        System.out.println("Peixe Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Peixe Comendo Substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som");
    }
    
}
