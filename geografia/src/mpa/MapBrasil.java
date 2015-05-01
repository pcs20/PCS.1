/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpa;

import java.util.Scanner;

/**
 *
 * @author ²
 */
public class MapBrasil extends Mapa {

    public int acertos;
    public int erros;
    int selecionar;
    Rodada rodada;
    Mapa mapa = new Mapa();
    Scanner entrada = new Scanner(System.in);

    public MapBrasil() {
        rodada = new Rodada(0, 0);
    }
//Perguntas testes não aleatórias
    public void ComeçaJogo() {
        System.out.println("O estado se encontra na região sudeste próximo a MG e SP. Selecione uma resposta");
        System.out.println("1- " + mapa.estado[0]);
        System.out.println("2- " + mapa.estado[1]);
        System.out.println("3- " + mapa.estado[2]);
        System.out.println("4- " + mapa.estado[3]);
        System.out.println("5- " + mapa.estado[4]);
        selecionar = entrada.nextInt();
        if (selecionar == 1) {
            acertos=10;
            rodada.ContaAcertos(acertos);
        } else {
            erros++;
            rodada.ContaErros(erros);
        }

        System.out.println("O estado se encontra...Selecione uma resposta");
        System.out.println("1- " + mapa.estado[0]);
        System.out.println("2- " + mapa.estado[2]);
        System.out.println("3- " + mapa.estado[6]);
        System.out.println("4- " + mapa.estado[1]);
        System.out.println("5- " + mapa.estado[5]);
        selecionar = entrada.nextInt();
        if (selecionar == 3) {
            acertos++;
            rodada.ContaAcertos(acertos);
        } else {
            erros++;
            rodada.ContaErros(erros);
        }

        System.out.println("O estado se encontra...Selecione uma resposta");
        System.out.println("1- " + mapa.estado[3]);
        System.out.println("2- " + mapa.estado[1]);
        System.out.println("3- " + mapa.estado[0]);
        System.out.println("4- " + mapa.estado[3]);
        System.out.println("5- " + mapa.estado[5]);
        selecionar = entrada.nextInt();
        if (selecionar == 5) {
            acertos++;
            rodada.ContaAcertos(acertos);
        } else {
            erros++;
            rodada.ContaErros(erros);
            
        }
    }
}
