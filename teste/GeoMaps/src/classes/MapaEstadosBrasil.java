/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import classes.Estados;
import geomaps.*;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author alexsander
 */
public class MapaEstadosBrasil{
    public Image[] map = new Image[255];
    MapaEstadosBrasil[] MapEstadosBrasil;
    private String nome;
    //private Image map;


    public MapaEstadosBrasil() {
        try {
            map[0] = ImageIO.read(Mapa.class.getResource("/Imagens/brasil/acre.png"));
            map[1] = ImageIO.read(Mapa.class.getResource("/Imagens/brasil/alagoas.png"));
            map[2] = ImageIO.read(Mapa.class.getResource("/Imagens/brasil/amapa.png"));
            map[3] = ImageIO.read(Mapa.class.getResource("/Imagens/brasil/amazonas.png"));
            map[4] = ImageIO.read(Mapa.class.getResource("/Imagens/brasil/bahia.png"));
            map[5] = ImageIO.read(Mapa.class.getResource("/Imagens/brasil/ceará.png"));
            map[6] = ImageIO.read(Mapa.class.getResource("/Imagens/brasil/distritoFederal.png"));
            map[7] = ImageIO.read(Mapa.class.getResource("/Imagens/brasil/espiritoSanto.png"));
            map[8] = ImageIO.read(Mapa.class.getResource("/Imagens/brasil/goias.png"));
            map[9] = ImageIO.read(Mapa.class.getResource("/Imagens/brasil/rioDeJaneiro.png"));
} catch (IOException ex) {
            Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
        }    
        }
    
    public String getNome() {
        return this.nome;
    }
    
    public Image getMap(int i) {
        return this.map[i];
    }    
}
