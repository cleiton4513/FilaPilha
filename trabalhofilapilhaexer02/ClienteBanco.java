package com.mycompany.trabalhofilapilhaexer02;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author cleit
 */
public class ClienteBanco {
    
    private int senha;
    private String nome;
    private int anoNasc;

    public ClienteBanco(int senha, String nome, int anoNasc) {
        this.senha = senha;
        this.nome = nome;
        this.anoNasc = anoNasc;
    }
    
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
    
    public int getIdade(int anoAtual){
        return 2024 - anoNasc;
    }

    @Override
    public String toString() {
        return "Cliente = " + " senha = " + senha + 
                             " nome = " + nome + 
                             " anoNasc = " + anoNasc;
    }
    
    
    public class FilaClientes{
        
        private Queue<ClienteBanco> senhaPrioridade;
        private Queue<ClienteBanco> senhaNormal;
        private int contador;

        public FilaClientes() {
            this.senhaPrioridade = new LinkedList<>();
            this.senhaNormal = new LinkedList<>();
            this.contador = 0;
        }
        
        public void adicionarClientes(ClienteBanco clienteBanco, int anoAtual){
            if (clienteBanco.getIdade(anoAtual) > 65) {
                senhaPrioridade.add(clienteBanco);
            } else {
                senhaNormal.add(clienteBanco);
            }
        }
        
        public ClienteBanco chamarCliente() {
        if (contador < 2) {
            if (!senhaPrioridade.isEmpty()) {
                contador++;
                return senhaPrioridade.poll();
            } else if (!senhaNormal.isEmpty()) {
                return senhaNormal.poll();
            }
        } else {
            contador = 0;
            if (!senhaNormal.isEmpty()) {
                return senhaNormal.poll();
            } else if (!senhaPrioridade.isEmpty()) {
                contador++;
                return senhaPrioridade.poll();
            }
        }
        return null;
        }
        
    }
}
