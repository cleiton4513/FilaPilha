package com.mycompany.trabalhofilapilhaexer03;

import java.util.ArrayList;

/**
 *
 * @author cleit
 */

public class Biblioteca {
       
    private ArrayList<String> pilhaDeLivros;

    public Biblioteca() {
        this.pilhaDeLivros = new ArrayList<>();
    }

    public void adicionarLivro(String livro) {
        pilhaDeLivros.add(livro);
        System.out.println("Livro \"" + livro + "\" adicionado à pilha.");
    }

    public void listarLivros() {
        if (pilhaDeLivros.isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("Livros na pilha:");
            for (int i = pilhaDeLivros.size() - 1; i >= 0; i--) {
                System.out.println(pilhaDeLivros.get(i));
            }
        }
    }

    public void retirarLivro() {
        if (pilhaDeLivros.isEmpty()) {
            System.out.println("A pilha está vazia. Nenhum livro para retirar.");
        } else {
            String livroRemovido = pilhaDeLivros.remove(pilhaDeLivros.size() - 1);
            System.out.println("Livro \"" + livroRemovido + "\" foi removido da pilha.");
        }
    }
    
   
}