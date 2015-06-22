/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author alexsander
 */
public class Rodada {
    //int SorteaEstadoPais[] = new int[255];
    public ArrayList<Integer> SorteaEstadoPais = new ArrayList<Integer>();  
    public int randomNum;
    protected int acertosMod1=0;
    protected int errosMod1=0;
    
    protected int acertosMod2=0;
    protected int errosMod2=0;
    
    protected int acertosMod3=0;
    protected int errosMod3=0;
    
    
    public boolean verificaLista(int verifica){
            if(SorteaEstadoPais.contains(verifica))
                return false;
            else
                SetList(verifica);
                return true;
    }     
    public void ClearList(){
    SorteaEstadoPais.clear();
}
    
    public void SetList(int val){
        SorteaEstadoPais.add(val);
    }
    
    public boolean ListaCheia(){
        if(SorteaEstadoPais.size()==10)
        return true;
        else
        return false;
    }
    
     public int QuestRandInt(int min, int max)
    {        
        java.util.Random rand = new java.util.Random();
        randomNum = rand.nextInt((max-min)+1)+min;
        
        while(!verificaLista(randomNum)){
            randomNum = rand.nextInt((max-min)+1)+min;
        }        
        return randomNum;
    }
    
    public int GetAcertosMod1(){
        return acertosMod1;
        }
    
    public int GetErrosMod1(){
        return errosMod1;
        }
    
    public int GetAcertosMod2(){
        return acertosMod2;
        }
    
    public int GetErrosMod2(){
        return errosMod2;
        }
    
    public int GetAcertosMod3(){
        return acertosMod3;
        }
    
    public int GetErrosMod3(){
        return errosMod3;
        }
    
}
