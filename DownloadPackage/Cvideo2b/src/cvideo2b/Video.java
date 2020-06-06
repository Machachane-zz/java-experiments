
package cvideo2b;

public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int likes;
    private boolean reproduzindo;
    
    //------------------------------------------------------------- CONSTRUCTOR

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.likes = 0;
        this.reproduzindo = false;
    }
    
    //----------------------------------------------------- GETTERS AND SETTERS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int)(this.avaliacao + avaliacao)/this.views;
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    //----------------------------------------------------------------- METHODS
    
    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.likes++;
    }
    
    //------------------------------------------------------- PRINT

    
    @Override
    public String toString() {
        return "Video | " + "Titulo = " + titulo + ", Avaliacao = " + avaliacao + ", Views = " + views + ", Likes = " + likes + ", Reproduzindo = " + reproduzindo;
    }
    
    
}
