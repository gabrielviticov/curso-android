package aluno.gabriel.treino025.model;

public class Aluno {
    private Integer id;
    private String nome;
    private String rgm;
    private String senha;

    public Aluno(){}
    public Aluno(String nome, String rgm, String senha){
        this.setNome(nome);
        this.setRgm(rgm);
        this.setSenha(senha);
    }

    public Integer getId(){
        return id;
    } public String getNome(){
        return nome;
    } public String getRgm(){
        return rgm;
    } public String getSenha(){
        return senha;
    }

    public void setId(Integer id){
        this.id = id;
    } public void setNome(String nome){
        this.nome = nome;
    } public void setRgm(String rgm){
        this.rgm = rgm;
    } public void setSenha(String senha){
        this.senha = senha;
    }
}
