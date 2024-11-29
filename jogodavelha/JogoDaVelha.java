/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucas.jogodavelha;

import com.lucas.regraseverificacoes.Velha;
import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class JogoDaVelha {

    static Scanner scan;
    static Velha velha;

    public static void main(String[] args) {

        scan = new Scanner(System.in);
        velha = new Velha();

        boolean ganhou = false;
        boolean jogadaValida;
        char jogador = 'A';
        int jogada = 0;
        int linha = 0, coluna = 0;

        while (!ganhou) {

            jogadaValida = false;

            while (!jogadaValida) {

                if (jogada % 2 == 0) {
                    System.out.println("Vez do jogador 1");
                    jogador = 'X';
                } else {
                    System.out.println("Vez do jogador 2");
                    jogador = 'O';
                }

                linha = valor("linha");
                coluna = valor("coluna");

                if (velha.verificarJogada(linha, coluna)) {
                    System.out.println("Jogada invalida");
                } else {
                    velha.adicionarElemento(linha, coluna, jogador);
                    jogadaValida = true;
                    jogada++;
                }

            }
            
            System.out.println(velha);
            
            if(velha.verificarVencedor(linha, coluna, jogador) == 1){
                System.out.println("Jogador 1 venceu!!!");
                ganhou = true;
            }else if(velha.verificarVencedor(linha, coluna, jogador) == 2){
                System.out.println("Jogador 2 venceu!!!");
                ganhou = true;
            }else if(jogada > 9){
                System.out.println("Empate!!!");
                ganhou = true;
            }

        }

    }

    public static int valor(String tipoValor) {
        int valor = 0;
        boolean valorValido = false;

        while (!valorValido) {

            System.out.println("Digite o valor da " + tipoValor + ": ");
            valor = scan.nextInt();

            if (valor >= 1 && valor < 4) {
                valorValido = true;
            } else {
                System.out.println("Valor invalido!");
            }

        }

        valor--;

        return valor;
    }

}
