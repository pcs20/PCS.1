/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import geomaps.*;
import java.awt.Image;

    /**
     * Creates new form form
     */
/**
 *
 * @author alexsander
 */
public class MapaMundiOceanos {
    private String nome;
    private Image map;
    
    public MapaMundiOceanos(String nome, Image map){
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
