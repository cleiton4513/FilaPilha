package com.mycompany.trabalhofilapilhaexer04;

import java.util.Scanner;
//Uma empresa de transportes precisa controlar o fluxo de produtos no seu 
//depósito. Para auxiliar na organização,as caixas são empilhadas no máximo 
//10 caixas. Quando vão despachar o produto, a empilhadeira sempre retira e
//adiciona caixas em cima da pilha. Eles necessitam que seja exibido no 
//painel quais produtos estão aguardando o despache em ordem, e no momento
//de retirada da caixa, qual produto está sendo despachado.
//Obs: no painel sempre depois de cada ação, mostra a posição atual da pilha,
//ou seja, quais produtos estão na pilha.
//Produto
//- codProduto
//- descricao
//- dataEntrada
//- ufOrigem
//- ufDestino

/**
 *
 * @author cleit
 */
public class TrabalhoFilaPilhaExer04 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Estoque estoque = new Estoque();
        Estoque estoque1 = new Estoque();
        estoque1.setNomeProduto("produto1\n");
        estoque1.setCodProduto(01);
        estoque1.setDescricao("Macarrao");
        estoque1.setDataEntrada("21/03/2024");
        estoque1.setUfOrigem("PR");
        estoque1.setUfDestino("SP");
        
        int opcao;
        
        do{
            System.out.println("\nMenu");
            System.out.println("1-Adicionar Produto: ");
            System.out.println("2-Listar Produto: ");
            System.out.println("3-Retirar Produto");
            System.out.println("0-Sair");
            System.out.print("Escolha uma Opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcao){
                case 1: 
                    System.out.print("Informe o produto:");
                    String produto = scanner.nextLine();
                    estoque.adicionarProduto(produto);
                    estoque.listarProduto();
                    break;
                case 2:
                    estoque.listarProduto();
                    break;
                case 3:
                    estoque.retirarProduto();
                    break;
                case 0:
                    System.out.println("Sair do Sistema.");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
            
        }while(opcao != 0);
        scanner.close();
    }
}
