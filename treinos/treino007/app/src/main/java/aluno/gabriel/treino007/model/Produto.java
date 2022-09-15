package aluno.gabriel.treino007.model;

public class Produto {

    public Produto(){}
    public Produto(String nome, String fabricante, Double preco, Boolean disponivel){
        this.setNome(nome);
        this.setFabricante(fabricante);
        this.setPreco(preco);
        this.setDisponivel(disponivel);
    }

    private Integer id;
    private String nome;
    private String fabricante;
    private Double preco;
    private Boolean disponivel;

    public Integer getId(){
        return id;
    } public String getNome(){
        return nome;
    } public String getFabricante(){
        return fabricante;
    } public Double getPreco(){
        return preco;
    } public Boolean getDisponivel(){
        return disponivel;
    }

    public void setId(Integer id){
        this.id = id;
    } public void setNome(String nome){
        this.nome = nome;
    } public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    } public void setPreco(Double preco){
        this.preco = preco;
    } public void setDisponivel(Boolean disponivel){
        this.disponivel = disponivel;
    }
}
