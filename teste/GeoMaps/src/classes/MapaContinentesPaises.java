/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Image;

/**
 *
 * @author alexsander
 */
public class MapaContinentesPaises {
    private String nome;
    private Image map;
    
    public MapaContinentesPaises(String nome, Image map){
        this.nome = nome;
        this.map = map;        
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public Image getMap() {
        return this.map;
    }        
}
