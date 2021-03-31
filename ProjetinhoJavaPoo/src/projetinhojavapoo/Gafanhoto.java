package projetinhojavapoo;
public class Gafanhoto extends Pessoa{
    //Atributos
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    //Métodos
    public void viuMaisUm() {
        this.setTotAssistido(this.getTotAssistido()+ 1);
    }
    //Métodos Especiais
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLogin: " + 
                login + "\nTotal Assistido: " + totAssistido;
    }

}
