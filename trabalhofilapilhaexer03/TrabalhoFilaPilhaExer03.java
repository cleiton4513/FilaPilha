package com.mycompany.trabalhofilapilhaexer03;

//Desenvolva um algoritmo para controlar uma pilha de livros de uma biblioteca.
//Deverá conter um método para adicionar o livro a pilha, Um método para listar
//os livros da pilha, um método para retirar o livro da pilha, nesse último
//método deverá ser exibido qual livro está sendo removido. Crie um menu para 
//exibir as opções.

import java.util.Scanner;


/**
 *
 * @author cleit
 */
public class TrabalhoFilaPilhaExer03 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar livro à pilha");
            System.out.println("2. Listar livros da pilha");
            System.out.println("3. Retirar livro da pilha");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do livro: ");
                    String livro = scanner.nextLine();
                    biblioteca.adicionarLivro(livro);
                    break;
                case 2:
                    biblioteca.listarLivros();
                    break;
                case 3:
                    biblioteca.retirarLivro();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
        
}


        


