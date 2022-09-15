package aluno.gabriel.appminhaideia.model;

public class Cliente {
    private String nome;
    private String email;
    private String telefone;
    private String sexo;
    private Integer idade;

    public Cliente(String nome, String sexo, Integer idade, String email, String telefone){
        this.setNome(nome);
        this.setSexo(sexo);
        this.setIdade(idade);
        this.setEmail(email);
        this.setTelefone(telefone);
    }

    public String getNome(){
        return this.nome;
    } public String getEmail(){
        return this.email;
    } public String getTelefone(){
        return this.telefone;
    } public String getSexo(){
        return this.sexo;
    } public Integer getIdade(){
        return this.idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    } public void setEmail(String email){
        this.email = email;
    } public void setTelefone(String telefone){
        this.telefone = telefone;
    } public void setSexo(String sexo){
        this.sexo = sexo;
    } public void setIdade(Integer idade){
        this.idade = idade;
    }
}
