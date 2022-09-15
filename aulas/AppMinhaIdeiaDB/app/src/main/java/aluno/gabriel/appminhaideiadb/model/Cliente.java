package aluno.gabriel.appminhaideiadb.model;

import java.util.List;

import aluno.gabriel.appminhaideiadb.controller.ICrud;

public class Cliente {

    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private String sexo;
    private Integer idade;

    public Cliente(){}

    public Cliente(String nome, String email, String telefone, Integer idade, String sexo){
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    public Integer getId(){
        return id;
    } public void setId(Integer id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

}
