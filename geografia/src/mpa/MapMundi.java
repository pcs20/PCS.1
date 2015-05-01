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
public class MapMundi extends Mapa{
    private int acertos = 0;
    private int erros = 0;
    int selecionar;
    Rodada rodada = new Rodada(0, 0);
    Scanner entrada = new Scanner(System.in);
    
    public MapMundi(){
    }
    
    public void ComeçaJogoMod2(){
        System.out.println("O continente...Selecione uma resposta");
        System.out.println("1- "+ continente[0]);
        System.out.println("2- "+ continente[1]);
        System.out.println("3- "+ continente[2]);
        System.out.println("4- "+ continente[3]);
        System.out.println("5- "+ continente[4]);
        selecionar  = entrada.nextInt();
        if(selecionar==3){
            acertos++;
        }
        else
            erros++;
        
        System.out.println("O continente...Selecione uma resposta");
        System.out.println("1- "+ continente[0]);
        System.out.println("2- "+ continente[3]);
        System.out.println("3- "+ continente[5]);
        System.out.println("4- "+ continente[6]);
        System.out.println("5- "+ continente[1]);
        selecionar  = entrada.nextInt();
        if(selecionar==5){
            acertos++;
        }
        else
            erros++;
        
        System.out.println("O continente...Selecione uma resposta");
        System.out.println("1- "+ continente[2]);
        System.out.println("2- "+ continente[5]);
        System.out.println("3- "+ continente[3]);
        System.out.println("4- "+ continente[6]);
        System.out.println("5- "+ continente[4]);
        selecionar  = entrada.nextInt();
        if(selecionar==2){
            acertos++;
        }
        else
            erros++;
        
    }
    
    public void ComeçaJogoMod3(){
        System.out.println("O país...Selecione uma resposta");
        System.out.println("1- "+ pais[0]);
        System.out.println("2- "+ pais[1]);
        System.out.println("3- "+ pais[2]);
        System.out.println("4- "+ pais[3]);
        System.out.println("5- "+ pais[4]);
        selecionar  = entrada.nextInt();
        if(selecionar==3){
            acertos++;
        }
        else
            erros++;
        
        System.out.println("O país...Selecione uma resposta");
        System.out.println("1- "+ pais[6]);
        System.out.println("2- "+ pais[5]);
        System.out.println("3- "+ pais[4]);
        System.out.println("4- "+ pais[3]);
        System.out.println("5- "+ pais[2]);
        selecionar  = entrada.nextInt();
        if(selecionar==1){
            acertos++;
        }
        else
            erros++;
        
        System.out.println("O país...Selecione uma resposta");
        System.out.println("1- "+ pais[1]);
        System.out.println("2- "+ pais[0]);
        System.out.println("3- "+ pais[6]);
        System.out.println("4- "+ pais[5]);
        System.out.println("5- "+ pais[4]);
        selecionar  = entrada.nextInt();
        if(selecionar==4){
            acertos++;
        }
        else
            erros++;
    }    
}
