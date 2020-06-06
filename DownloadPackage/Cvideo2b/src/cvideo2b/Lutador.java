
package cvideo2b;

public class Lutador {
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //--------------------------------------------------- CONSTRUCTOR
    
    Lutador(String no, String na, int i, float al, float pe, int vi, int de, int em){
        
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(i);
        this.setIdade(i);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
        
    }
    
    //--------------------------------------------------- GETTERS AND SETTERS
    
    String getNome(){
        return this.nome;
    }
    void setNome(String n){
        this.nome = n;
    }
    
    String getNacionalidade(){
        return this.nacionalidade;
    }
    void setNacionalidade(String n){
        this.nacionalidade = n;
    }
    
    int getIdade(){
        return this.idade;
    }
    void setIdade(int i){
        this.idade = i;
    }
    
    float getAltura(){
        return this.altura;
    }
    void setAltura(float a){
        this.altura = a;
    }
    
    float getPeso(){
        return this.peso;
    }
    void setPeso(float p){
        this.peso = p;
        
        if(p < 52.2){
            this.setCategoria("Invalido");
        }
        else if(p <= 70.3){
            this.setCategoria("Leve");
        }
        else if(p <= 83.9){
            this.setCategoria("Medio");
        }
        else if(p <= 120.2){
            this.setCategoria("Pesado");
        }
        else{
            this.setCategoria("Invalido");
        }
    }
    
    String getCategoria(){
        return this.categoria;
    }
    private void setCategoria(String c){
        this.categoria = c;
    }
    
    int getVitorias(){
        return this.vitorias;
    }
    void setVitorias(int v){
        this.vitorias = v;
    }
    
    int getDerrotas(){
        return this.derrotas;
    }
    void setDerrotas(int d){
        this.derrotas = d;
    }
    
    int getEmpates(){
        return this.empates;
    }
    void setEmpates(int e){
        this.empates = e;
    }
    
    //------------------------------------------------------- METHODSJJ
    
    public void apresentar(){
        
        System.out.println("------------------- APRESENTACAO -----------------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso() + "m");
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }
    
    public void status(){
        
        System.out.println("------------------------ ESTADO ------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    
}
