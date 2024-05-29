package com.mycompany.trabalhofilapilhaexer02;

//Um banco necessita de uma sistema para controlar a fila de pagamentos no 
//caixa.Para o atendimento é obedecido a lei de prioridade, onde a cada 2
//clientes prioritários, um cliente normal é atendido. Desenvolva um algoritmo
//para controlar a fila de atendimento, para isso deverá ser criado 2 filas,
//uma de atendimento prioritário e outra de atendimento normal. Na fila será
//cadastrado os seguintes dados do cliente:
//Cliente
//- int senha;
//- String nome;
//- int anoNascimento;
//Deverá ser determinado pela a idade qual fila será inserido o cliente, acima
//de 65 anos fila prioritária, os demais na fila normal. Crie um menu com uma 
//opção para adicionar o cliente, e outra para chamar o cliente. Lembre-se
//deverá seguir a regra de ao ser atendido 2 clientes prioritários será 
//atendido um cliente normal.


import com.mycompany.trabalhofilapilhaexer02.ClienteBanco.FilaClientes;
import java.util.Scanner;

/**
 *
 * @author cleit
 */
public class TrabalhoFilaPilhaExer02 {
    
    private static int senhaAtual = 1;
    private static final int ANO_ATUAL = 2024;

    public static void main(String[] args) {
        
        FilaClientes filaClientes = new FilaClientes();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Chamar Cliente");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Ano de Nascimento: ");
                    int anoNascimento = scanner.nextInt();
                    
                    ClienteBanco clienteBanco = new ClienteBanco(senhaAtual++, nome, anoNascimento);
                    filaClientes.adicionarClientes(clienteBanco, ANO_ATUAL);
                    break;

                case 2:
                    ClienteBanco clienteAtendido = filaClientes.chamarCliente();
                    if (clienteAtendido != null) {
                        System.out.println("Cliente a ser atendido: " + clienteAtendido);
                    } else {
                        System.out.println("Nenhum cliente na fila.");
                    }
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Opção inválida.");
            }
        }

    }
}
