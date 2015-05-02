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
public class Rodada {

    private LocalTime inicio;
    private LocalTime termino;
    private int acertos;
    private int erros;
    private int ModoGame;

    public Rodada(int qntAcertos, int qntErros) {
        this.acertos = qntAcertos;
        this.erros = qntErros;
    }
    
    public void ContaAcertos(int val){ 
        this.acertos=val;
    }
    
    public void ContaErros(int val){
        this.erros = val;
    }
    
    public void Tempo(LocalTime first, LocalTime end){
        this.inicio = first;
        this.termino = end;
    }
    
    public void imprime(){
        System.out.println("Acertos: "+acertos);
        System.out.println("Erros: "+erros);
        System.out.println("Começou: "+inicio);
        System.out.println("Terminou: "+termino);
    }
}
