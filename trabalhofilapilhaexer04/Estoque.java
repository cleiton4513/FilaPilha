package com.mycompany.trabalhofilapilhaexer04;

import java.util.ArrayList;

/**
 *
 * @author cleit
 */
public class Estoque {
    
    private String nomeProduto;
    private int codProduto;
    private String descricao;
    private String dataEntrada;
    private String ufOrigem;
    private String ufDestino;
      private ArrayList<String> pilhaProduto;
    
    public Estoque(String nomeProduto, int codProduto, String descricao, String dataEntrada, String ufOrigem, String ufDestino) {
        this.codProduto = codProduto;
        this.descricao = descricao;
        this.dataEntrada = dataEntrada;
        this.ufOrigem = ufOrigem;
        this.ufDestino = ufDestino;
        this.nomeProduto = nomeProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    
    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getUfOrigem() {
        return ufOrigem;
    }

    public void setUfOrigem(String ufOrigem) {
        this.ufOrigem = ufOrigem;
    }

    public String getUfDestino() {
        return ufDestino;
    }

    public void setUfDestino(String ufDestino) {
        this.ufDestino = ufDestino;
    }

    @Override
    public String toString() {
        return "Produto =" + 
               "nomeProduto =" + nomeProduto +
               "codProduto  =" + codProduto + 
               "descricao   =" + descricao + 
               "dataEntrada =" + dataEntrada + 
               "ufOrigem    =" + ufOrigem + 
               "ufDestino   =" + ufDestino ;
    }
    
    public Estoque(){
        this.pilhaProduto = new ArrayList<>(10);
    }
    
    public void adicionarProduto(String produto){
       
        pilhaProduto.add(produto);
        System.out.println("Produto: \""+ produto +"\" na pilha");
        
    }
    public void listarProduto(){
        if(pilhaProduto.isEmpty()){
            System.out.println("A pilha esta vazia.");
        }else{
            System.out.println("Produtos na Pilha: ");
            for(int i = pilhaProduto.size()- 1; i >= 0; i--){
                System.out.println(pilhaProduto.get(i));
            }
        }
        
    }
    
    public void retirarProduto(){
        if(pilhaProduto.isEmpty()){
            System.out.println("A pilha esta vazia, nenhum produto para retirar.");
        }else{
            String produtoRemovido = pilhaProduto.remove(pilhaProduto.size()-1);
            System.out.println("Produto: " + produtoRemovido + " foi removido da pilha.");
        }
    }
}
