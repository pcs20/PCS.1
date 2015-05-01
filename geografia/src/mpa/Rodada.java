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
    MapBrasil br = new MapBrasil();
    MapMundi mundi = new MapMundi();

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
    
    public void SelecionarModo(int mod){
        this.ModoGame = mod;
        if(ModoGame == 1){
            br.ComeçaJogo();
        }
        else
            if(ModoGame == 2){
                mundi.ComeçaJogoMod2();
            }
        else
                if(ModoGame == 3){
                    mundi.ComeçaJogoMod3();
                }
    }
    
    public void imprime(){
        System.out.println("Acertos: "+acertos);
        System.out.println("Erros: "+erros);
    }
}
