/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author Jenova
 */
public class verificarForçaSenha {
    public String senha;
    //armazena todas as senhas consideradas simples
    public ArrayList<String> dicionarioSenhasSimples = new ArrayList<String>();
    //meu construtor inicializando um valor para String e armazena valores ao meu dicionário
    public verificarForçaSenha(String senhaPassada){
        this.senha = senhaPassada;
        //alimento o meu dicionário
        dicionarioSenhasSimples.add("Senha-01"); dicionarioSenhasSimples.add("Eu<3PModular"); 
        dicionarioSenhasSimples.add("MinhaSenha123"); dicionarioSenhasSimples.add("123456789@A"); 
        dicionarioSenhasSimples.add("NaMoRaDa@1"); dicionarioSenhasSimples.add("Pot34-|R"); 
        dicionarioSenhasSimples.add("Passw@rD"); dicionarioSenhasSimples.add("Qwertyu123!@#");
    }
    
    public boolean AnalisadorSenha(){
        
        if(senha.length() < 8)
            return false;
        else 
        if(AnalisarSenhasTipicas())
            return false;
        else
        if(AnalisarCaracterNumerico() &&  AnalisarCaracterminusculo()
                && AnalisarCaracterMaiusculo() && AnalisarCaracterpontuacao())
            return true;
        else
            return false;   
    }
    
    public boolean Refracao(char minimo, char maximo){
        
    for(int i = 0 ; i < senha.length(); i++){
            if(senha.charAt(i) >= minimo && senha.charAt(i) <= maximo)
                return true;
        }
        return false;
    }
    
    public boolean AnalisarCaracterNumerico(){
        
        if(Refracao('0', '9'))
            return true;
        else
            return false;        
    }
    
    public boolean AnalisarCaracterminusculo(){
        
        if(Refracao('a', 'z'))
            return true;
        else
            return false;        
    }
    
    public boolean AnalisarCaracterMaiusculo(){
        
        if(Refracao('A', 'Z'))
            return true;
        else
            return false;        
    }
    
    public boolean AnalisarCaracterpontuacao(){
        
    for(int i = 0 ; i < senha.length(); i++){
            if(senha.matches("[A-Za-z0-9]+"))
                return false;
        }
        return true;
    }
    
    public boolean AnalisarSenhasTipicas(){
        
        if(dicionarioSenhasSimples.contains(senha))
            return true;
        else
            return false;
    }
}
