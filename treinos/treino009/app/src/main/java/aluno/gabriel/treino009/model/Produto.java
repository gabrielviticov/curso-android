package aluno.gabriel.treino009.model;

public class Produto {
    private Integer id;
    private String nome;
    private String fabricante;
    private Integer quantidade;
    private Double preco;

    public Produto(){}
    public Produto(String nome, String fabricante, Double preco, Integer quantidade){
        this.setNome(nome);
        this.setFabricante(fabricante);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
    }

    public Integer getId(){
        return id;
    } public String getNome(){
        return nome;
    } public String getFabricante(){
        return fabricante;
    } public Integer getQuantidade(){
        return quantidade;
    } public Double getPreco(){
        return preco;
    }

    public void setId(Integer id){
        this.id = id;
    } public void setNome(String nome){
        this.nome = nome;
    } public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    } public void setQuantidade(Integer quantidade){
        this.quantidade = quantidade;
    } public void setPreco(Double preco){
        this.preco = preco;
    }
}
