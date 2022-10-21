package aluno.gabriel.treino027.model;

public class Alunos {
    private Integer id;
    private String registroAluno;
    private String nomeCompleto;
    private Integer cpf;
    private String sexo;
    private String dtaNascimento;
    private String email;
    private Integer telefone;
    private String senha;

    public Alunos(){}
    public Alunos(String registroAluno, String nomeCompleto, Integer cpf, String sexo, String dtaNascimento, String email, Integer telefone, String senha){
        this.setRegistroAluno(registroAluno);
        this.setNomeCompleto(nomeCompleto);
        this.setCpf(cpf);
        this.setSexo(sexo);
        this.setDtaNascimento(dtaNascimento);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setSenha(senha);
    }

    public Integer getId(){
        return id;
    } public String getRegistroAluno(){
        return registroAluno;
    } public String getNomeCompleto(){
        return nomeCompleto;
    } public Integer getCpf(){
        return cpf;
    } public String getSexo(){
        return sexo;
    } public String getDtaNascimento(){
        return dtaNascimento;
    } public String getEmail(){
        return email;
    } public Integer getTelefone(){
        return telefone;
    } public String getSenha(){
        return senha;
    }

    public void setId(Integer id){
        this.id = id;
    } public void setRegistroAluno(String registroAluno){
        this.registroAluno = registroAluno;
    } public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    } public void setCpf(Integer cpf){
        this.cpf = cpf;
    } public void setSexo(String sexo){
        this.sexo = sexo;
    } public void setDtaNascimento(String dtaNascimento){
        this.dtaNascimento = dtaNascimento;
    } public void setEmail(String email){
        this.email = email;
    } public void setTelefone(Integer telefone){
        this.telefone = telefone;
    } public void setSenha(String senha){
        this.senha = senha;
    }
}
