package com.mycompany.trabalhofilapilhaexer01;

//Uma clínica precisa de um sistema para organizar a fila de pacientes, para 
//cada dia é disponibilizado 20 senhas para consulta. Eles necessitam de um 
//sistema onde é informado o nome do paciente em ordem de chegada e uma opção
//para chamar o próximo paciente. Desenvolva um algoritmo de Fila, contendo 
//um menu com as opções: 1 - Adicionar paciente, 2 - Chamar próximo paciente.
//A opção 1 deverá exibir um campo para informar o nome do paciente assim que
//ele chega no consultório, e aopção 2, ao selecionar deverá exibir o nome do
//próximo paciente na fila.

import java.util.Scanner;

/**
 *
 * @author cleit
 */
public class FilaPilhaExer01 {

    public static void main(String[] args) {
        
        Paciente paciente = new Paciente();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n1 - Adicionar paciente");
            System.out.println("2 - Chamar próximo paciente");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcao) {
                case 1:
                    System.out.print("Informe o nome do paciente: ");
                    String nome = scanner.nextLine();
                    paciente.adicionarPaciente(nome);
                    break;
                case 2:
                    paciente.chamarProximoPaciente();
                    break;
                case 3:
                    System.out.println("Saindo do sistema.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

    
