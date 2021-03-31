package projetinhojavapoo;

public class Video implements AcoesVideo{
    //Atributos
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    //Métodos
    //Métodos especiais
    public Video(String ti) {
        this.titulo = ti;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
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
        this.avaliacao = avaliacao;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public boolean isReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    //Métodos Interface
    @Override
    public void play() {
        this.setReproduzindo(true);
    }
    @Override
    public void pause() {
        this.setReproduzindo(false);
    }
    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas()+ 1);
    }
    @Override 
    public String toString(){
        return "\nTitulo: "+this.getTitulo()+"\nAvaliacao: "+this.getAvaliacao()
                +"\nViews: "+this.getViews()+"\nCurtidas: "+this.getCurtidas()
                +"\nReproduzindo: "+this.isReproduzindo()+"\n";
    }
}
