
package cvideo2b;

import static java.sql.DriverManager.println;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    
    //------------------------------------------------- CONSTRUCTOR
    
    Caneta(){
        tampar();
    }
    
    Caneta(String m, String c, float p, int ca){
        tampar();
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.setCarga(ca);
        
    }
    //------------------------------------------------- METGODS
    
    public void status(){
        System.out.println("Caneta: " + this.modelo + "\nCor: " + this.cor + "\nPonta: " + this.ponta + "\nCarga: " + this.carga + "\nTampada: " + this.tampada);
    }
    public void rabiscar(){
        if(this.tampada==true){
            System.out.println("ERRO - Nao posso rabiscar porque a caneta esta tampada.");
        }
        else{
            System.out.println("Rabisco.");
        }
    }
    
    protected void tampar(){
        this.tampada=true;     
    }
    
    protected void destampar(){
        this.tampada = false;
    }
    //----------------------------------------- GETTERS AND SETTERS
    
    String getModelo(){
        return this.modelo;
    }
    
    void setModelo(String m){
        this.modelo = m;
    }
    
    String getCor(){
        return this.cor;
    }
    
    void setCor(String c){
        this.cor = c;
    }
    
    float getPonta(){
        return this.ponta;    
    }
    
    void setPonta (float p){
        this.ponta = p;
    }
    
    int getCarga (){
        return this.carga;
    }
    
    void setCarga(int ca){
        this.carga = ca;
    }
    
    boolean getTampada(){
        return this.tampada;
    }
    
    void setTampada(boolean t){
        this.tampada = t;
    }
    
    //---------------------------------------------------
}
