package projetinhojavapoo;
public class Pessoa {
    //Atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;
    //Métodos
    protected void ganharExp(){
        this.setExperiencia(this.getExperiencia()+1);
    }
    //Métodos Especiais
    public String getNome() {
        return this.nome;
    }
    public void setNome(String no) {
        this.nome = no;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int i) {
        this.idade = i;
    }
    public String getSexo() {
        return this.sexo;
    }
    public void setSexo(String sx) {
        this.sexo = sx;
    }
    public int getExperiencia() {
        return this.experiencia;
    }
    public void setExperiencia(int ex) {
        this.experiencia = ex;
    }
}
