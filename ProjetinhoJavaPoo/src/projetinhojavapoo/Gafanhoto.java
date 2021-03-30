package projetinhojavapoo;
public class Gafanhoto {
    //Atributos
    private boolean login;
    private int totAssistido;
    //Métodos
    public void viuMaisUm() {
        this.setTotAssistido(this.getTotAssistido()+ 1);
    }
    //Métodos Especiais
    public boolean isLogin() {
        return this.login;
    }
    public void setLogin(boolean lo) {
        this.login = lo;
    }
    public int getTotAssistido() {
        return this.totAssistido;
    }
    public void setTotAssistido(int ta) {
        this.totAssistido = ta;
    }
}
