/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucas.regraseverificacoes;

/**
 *
 * @author HOME
 */
public class Velha {
    
    private char[][] casas;
    
    public Velha(){
        this.casas = new char[3][3];
    }
    
    public boolean verificarJogada(int linha, int coluna){
        if(this.casas[linha][coluna] == 'X' || this.casas[linha][coluna] == 'O'){
            return true;
        }
        return false;
    }
    
    public void adicionarElemento(int linha, int coluna, char jogador){
        this.casas[linha][coluna] = jogador;
    }
    
    public int verificarVencedor(int linha, int coluna, char jogador){
        if(this.casas[0][0] == jogador && this.casas[0][1] == jogador && this.casas[0][2] == jogador ||
            this.casas[1][0] == jogador && this.casas[1][1] == jogador && this.casas[1][2] == jogador ||
            this.casas[2][0] == jogador && this.casas[2][1] == jogador && this.casas[2][2] == jogador ||
            this.casas[0][0] == jogador && this.casas[1][0] == jogador && this.casas[2][0] == jogador ||
            this.casas[0][1] == jogador && this.casas[1][1] == jogador && this.casas[2][1] == jogador ||
            this.casas[0][2] == jogador && this.casas[1][2] == jogador && this.casas[2][2] == jogador ||
            this.casas[0][0] == jogador && this.casas[1][1] == jogador && this.casas[2][2] == jogador ||
            this.casas[2][0] == jogador && this.casas[1][1] == jogador && this.casas[0][2] == jogador){
            if(jogador == 'X'){
                return 1;
            }else if(jogador == 'O'){
                return 2;
            }
        }
        return 0;
    }
    
    public String toString(){
        StringBuilder s = new StringBuilder();
        for( int i = 0; i < this.casas.length; i++){
            for( int j = 0; j < this.casas[i].length; j++){
                s.append(this.casas[i][j] + " | ");
            }
            s.append("\n");
        }
        return s.toString();
    }
    
}
