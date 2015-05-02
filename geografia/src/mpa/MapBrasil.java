/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpa;

import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author ²
 */
public class MapBrasil extends Mapa {

    private int acertos;
    private int erros;
    private LocalTime inicio;
    private LocalTime termino;
    int selecionar;
    Scanner entrada = new Scanner(System.in);
    
//Perguntas testes não aleatórias

    public void ComeçaJogo() {
        this.inicio = LocalTime.now();
        System.out.println("O estado se encontra na região sudeste próximo a MG e SP. Selecione uma resposta");
        System.out.println("1- " + estado[0]);
        System.out.println("2- " + estado[1]);
        System.out.println("3- " + estado[2]);
        System.out.println("4- " + estado[3]);
        System.out.println("5- " + estado[4]);
        selecionar = entrada.nextInt();
        if (selecionar == 1) {
            acertos++;
        } else {
            erros++;
        }

        System.out.println("O estado se encontra...Selecione uma resposta");
        System.out.println("1- " + estado[0]);
        System.out.println("2- " + estado[2]);
        System.out.println("3- " + estado[6]);
        System.out.println("4- " + estado[1]);
        System.out.println("5- " + estado[5]);
        selecionar = entrada.nextInt();
        if (selecionar == 3) {
            acertos++;
        } else {
            erros++;
        }

        System.out.println("O estado se encontra...Selecione uma resposta");
        System.out.println("1- " + estado[3]);
        System.out.println("2- " + estado[1]);
        System.out.println("3- " + estado[0]);
        System.out.println("4- " + estado[3]);
        System.out.println("5- " + estado[5]);
        selecionar = entrada.nextInt();
        if (selecionar == 5) {
            acertos++;
        } else {
            erros++;
        }
        this.termino = LocalTime.now();
    }

    public int GetErros() {
        return erros;
    }

    public int GetAcertos() {
        return acertos;
    }

    public LocalTime Tinicio() {
        return inicio;
    }

    public LocalTime Ttermino() {
        return termino;
    }
}
