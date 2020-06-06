
package cvideo2b;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //------------------------------------------------------- CONSTRUCTOR
    
    Livro(String t, String a, int tp, Pessoa l){
        
        this.setTitulo(t);
        this.setAutor(a);
        this.setTotPaginas(tp);
        this.setLeitor(l);
        this.setPagAtual(0);
        this.setAberto(false);
        
    }
    
    //---------------------------------------------------- GETTERS AND SETTERS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public float getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    //------------------------------------------------------ METHODS

    public String detalhes() {
        return "----------------- Livro ----------------\n" + " Titulo = " + titulo + 
                "\n Autor = " + autor + "\n TotPaginas = " + totPaginas + 
                "\n PagAtual = " + pagAtual + "\n Aberto = " + aberto + 
                "\n Leitor = " + leitor.getNome() + "\n Idade = " + leitor.getIdade() + 
                "\n Sexo = " + leitor.getSexo();
    }
    

    

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(p <= this.getTotPaginas()){
            this.setPagAtual(p);
        }
        else{
            System.out.println("Impossivel folhear para essa pagina");
        }
    }

    @Override
    public void avancaPag() {
        this.setPagAtual((int) (this.getPagAtual() + 1));
    }

    @Override
    public void voltarPag() {
        this.setPagAtual((int) (this.getPagAtual() - 1));
    }
    
    
}
