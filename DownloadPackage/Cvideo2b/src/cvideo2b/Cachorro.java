
package cvideo2b;

public class Cachorro extends Lobo{
    @Override
    public void locomover(){
        System.out.println("Cachorro Andando");
    }
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au!");
    }    
    
    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Abanar");
        }
        else if(hora >= 18){
            System.out.println("Ignorar");
        }
        else{
            System.out.println("Abanar e latir");
        }
        
    }
    
    public void reagir(boolean dono){
        if(dono == true){
            System.out.println("Abanar");
        }
        else{
            System.out.println("Rosnar e latir");
        }
        
    }
    
    public void reagir(int idade, float peso){
        if(idade < 5){
            if(peso < 10){
                System.out.println("Abanar");
            }
            else{
            System.out.println("Latir");
            }
        }
        else{
            if(peso < 10){
                System.out.println("Rosnar");
            }
            else{
                System.out.println("Ignorar");
            }
        }
    }
    
    public void reagir(String frase){
        if(frase == "Ola" || frase == "Comida"){
            System.out.println("Abanar e latir");
        }
        else{
            System.out.println("Rosnar");
        }
    }
}
