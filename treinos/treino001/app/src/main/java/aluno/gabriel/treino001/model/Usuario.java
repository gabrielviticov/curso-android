package aluno.gabriel.treino001.model;

public class Usuario {
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha){
        this.setNome(nome);
        this.setEmail(email);
        this.setSenha(senha);
    }

    public String getNome(){
        return this.nome;
    } public String getEmail(){
        return this.email;
    } public String getSenha(){
        return this.senha;
    }

    public void setNome(String nome){
        this.nome = nome;
    } public void setEmail(String email){
        this.email = email;
    } public void setSenha(String senha){
        this.senha = senha;
    }
}
