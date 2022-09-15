package aluno.gabriel.treino006.model;

public class Usuario {
    private Integer id;
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha){
        this.setNome(nome);
        this.setEmail(email);
        this.setSenha(senha);
    }

    public String getNome(){
        return nome;
    } public String getEmail(){
        return email;
    } public String getSenha(){
        return senha;
    } public Integer getId(){
        return id;
    }

    public void setNome(String nome){
        this.nome = nome;
    } public void setEmail(String email){
        this.email = email;
    } public void setSenha(String senha){
        this.senha = senha;
    } public void setId(Integer id){
        this.id = id;
    }
}
