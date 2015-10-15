/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Jenova
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        verificarForçaSenha forcaSenha = new verificarForçaSenha("l2Baaa32aaaaaa(");
        
        if(forcaSenha.AnalisadorSenha())
            System.out.println("A senha é forte");
        else
            System.out.println("A senha é fraca");
        
    }
    
}
