package com.mycompany.trabalhofilapilhaexer01;


/**
 *
 * @author cleit
 */
public class Paciente {
  
    private String[] fila;
    private int tamanho;
    private int inicio;
    private int fim;

    public Paciente() {
        fila = new String[20];
        tamanho = 0;
        inicio = 0;
        fim = 0;
    }

    public void adicionarPaciente(String nome) {
        if (tamanho < fila.length) {
            fila[fim] = nome;
            fim = (fim + 1) % fila.length;
            tamanho++;
            System.out.println("Paciente " + nome + " adicionado à fila. Posição: " + tamanho);
        } else {
            System.out.println("Fila cheia! Não é possível adicionar mais pacientes hoje.");
        }
    }

    public void chamarProximoPaciente() {
        if (tamanho > 0) {
            String paciente = fila[inicio];
            inicio = (inicio + 1) % fila.length;
            tamanho--;
            System.out.println("Chamando próximo paciente: " + paciente);
        } else {
           // if(tamanho == 0){
                System.out.println("Não há pacientes na fila.");
           // }
        }
    }
    
}
