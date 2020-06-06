package cvideo2b;

public class ContaBanco {
    
    //--------------------------------------------------------------- VARIABLES
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
   //-------------------------------------------------------------------- PRINT
    
    void printStatus(){
        System.out.println("Account nr: " + this.getNumConta() + "\nType: " + this.getTipo() + "\nOwner: " + this.getDono() + "\nAmmount: " + this.getSaldo() + "\nOpen: " + this.getStatus());
        System.out.println("-------------------------------------------------------------");
    }
    
   //-------------------------------------------------------------- CONSTRUCTOR   

    ContaBanco(int num, String d){
        this.setNumConta(num);
        this.setDono(d);
        this.setStatus(false);
        this.setSaldo(0);
        return;
    }
    
   //------------------------------------------------------ GETTERS AND SETTERS 
    
    public int getNumConta(){
        return this.numConta;
    } 
    
    public void setNumConta(int nc){
        this.numConta = nc;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String t){
        if(t == "cc" || t == "cp"){
            this.tipo = t;
        }
        else{
            System.out.println("ERRO - Tipo de conta invalida!");
            return;
        }
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setDono(String d){
        this.dono = d;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(float s){
        this.saldo = s;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public void setStatus(boolean st){
        this.status = st;
    }
    
    //----------------------------------------------------------------- METHODS
    
    public void abrirConta(String tipo){
        if(tipo == "cc" || tipo == "cp"){
            this.setTipo(tipo);
            this.setStatus(true);
            
            if(tipo == "cc"){
                this.depositar(50);
            }
            else if(tipo == "cp"){
                this.depositar(150);
            }
        }
        else{
            System.out.println("ERRO - Tipo de conta invalida!");
            return;
        }
        
    }
    
    public void fecharConta(){
        if(this.getSaldo() == 0){
            this.setStatus(false);
        }
        else{
            System.out.println("ERRO - A conta nao pode ser fechada");
           return;
        }
    }
    
    public void depositar(int val){
        if(this.getStatus() == true){
            this.setSaldo(this.getSaldo() + val);
        }
        else{
            System.out.println("ERRO - Operacao invalida");
            return;
        }
    }
    
    public void sacar(float val){
        if(this.getStatus() == true && val <= this.getSaldo()){
            this.setSaldo(this.getSaldo() - val);
        }
        else{
            System.out.println("ERRO - Operacao invalida");
            return;
        }
    }
    
    public void pagarMensal(){
        if(this.getTipo() == "cc"){
            this.setSaldo(this.getSaldo() - 12);
        }
        if(this.getTipo() == "cp"){
            this.setSaldo(this.getSaldo() - 20);
        }
        else{
           System.out.println("ERRO - Operacao invalida");
          return; 
        }
    }
}
