package projetinhojavapoo;

public class Video {
    //Atributos
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    //Métodos
    //Métodos especiais
    public Video(String ti, int av, int vi, int c, boolean re) {
        this.titulo = ti;
        this.avaliacao = av;
        this.views = vi;
        this.curtidas = c;
        this.reproduzindo = re;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String ti) {
        this.titulo = ti;
    }
    public int getAvaliacao() {
        return this.avaliacao;
    }
    public void setAvaliacao(int av) {
        this.avaliacao = av;
    }
    public int getViews() {
        return this.views;
    }
    public void setViews(int vi) {
        this.views = vi;
    }
    public int getCurtidas() {
        return this.curtidas;
    }
    public void setCurtidas(int c) {
        this.curtidas = c;
    }
    public boolean isReproduzindo() {
        return this.reproduzindo;
    }
    public void setReproduzindo(boolean re) {
        this.reproduzindo = re;
    }
}
