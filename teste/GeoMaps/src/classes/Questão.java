/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author alexsander
 */
public class Questão extends Rodada {

    int answer1, answer2, answer3, answer4, answer5, Resposta;
    public ArrayList<Integer> MyList = new ArrayList<Integer>();
    public ArrayList<String> MyListErros = new ArrayList<String>();
    int acertos, erros;
    
    public int AnswerRandInt(int min, int max) {
        java.util.Random rand = new java.util.Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;

        while (!VerificaMyList(randomNum)) {
            randomNum = rand.nextInt((max - min) + 1) + min;
        }
        SetList(randomNum);
        return randomNum;
    }

    public Questão(int acertou, int errou) {
        this.acertos = acertou;
        this.erros = errou;
    }
    
    public void SetListaErros(String estado){
        MyListErros.add(estado);
    }
    
    public void GetListaErros(){
        System.out.println("Errados: "+ MyListErros);
    }
    
    public int GetAcertos(){
        return acertos;
    }
    
    public void SetAcertos(int valor){
        this.acertos = valor;
    }
    
    public void SetErros(int val){
        this.erros = val;
    }
    
    public int GetErros(){
        return erros;
    }

    public boolean VerificaMyList(int averigua) {
        if (MyList.contains(averigua)) {
            return false;
        } else {
            return true;
        }
    }

    public void ClearMyList() {
        MyList.clear();
    }

    public void SetList(int val) {
        MyList.add(val);
    }

//MODO 1
    public int questaoMod1(boolean resposta) {
        if (resposta) {
            return acertosMod1++;
        } else {
            return errosMod1++;
        }
    }
//MODO 2

    public int questaoMod2(boolean resposta) {
        if (resposta) {
            return acertosMod2++;
        } else {
            return errosMod2++;
        }
    }
//MODO 3    

    public int questaoMod3(boolean resposta) {
        if (resposta) {
            return acertosMod3++;
        } else {
            return errosMod3++;
        }
    }
}
