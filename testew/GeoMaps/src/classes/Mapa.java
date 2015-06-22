/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author alexsander
 */
public class Mapa {
    public Image[] estados = new Image[255];
    public Image[] continente = new Image[255];
    public Image[] oceano = new Image[255];
    public Image[] pais = new Image[255];
    
    public Mapa(){
        try {
            //estados
            estados[0] = ImageIO.read(Mapa.class.getResource("/Imagens/brasil/acre.png"));
            estados[1] = ImageIO.read(Mapa.class.getResource("/Imagens/brasil/alagoas.png"));
            estados[2] = ImageIO.read(Mapa.class.getResource("/Imagens/brasil/amapa.png"));
            estados[3] = ImageIO.read(Mapa.class.getResource("/Imagens/brasil/amazonas.png"));
            estados[4] = ImageIO.read(Mapa.class.getResource("/Imagens/brasil/bahia.png"));
            estados[5] = ImageIO.read(Mapa.class.getResource("/Imagens/brasil/ceará.png"));
            estados[6] = ImageIO.read(Mapa.class.getResource("/Imagens/brasil/distritoFederal.png"));
            estados[7] = ImageIO.read(Mapa.class.getResource("/Imagens/brasil/espiritoSanto.png"));
            estados[8] = ImageIO.read(Mapa.class.getResource("/Imagens/brasil/goias.png"));
            estados[9] = ImageIO.read(Mapa.class.getResource("/Imagens/brasil/rioDeJaneiro.png"));
            //continentes
            continente[0] = ImageIO.read(Mapa.class.getResource("/Imagens/continente/africa.png"));
            continente[1] = ImageIO.read(Mapa.class.getResource("/Imagens/continente/america central.png"));
            continente[2] = ImageIO.read(Mapa.class.getResource("/Imagens/continente/america do norte.png"));
            continente[3] = ImageIO.read(Mapa.class.getResource("/Imagens/continente/america sul.png"));
            continente[4] = ImageIO.read(Mapa.class.getResource("/Imagens/continente/asia.png"));
            continente[5] = ImageIO.read(Mapa.class.getResource("/Imagens/continente/europa.png"));
            continente[6] = ImageIO.read(Mapa.class.getResource("/Imagens/continente/oceania.png"));
            //oceanos
            oceano[0] = ImageIO.read(Mapa.class.getResource("/Imagens/oceano/oceano atlantico.png"));
            oceano[1] = ImageIO.read(Mapa.class.getResource("/Imagens/oceano/oceano glacial antartico.png"));
            oceano[2] = ImageIO.read(Mapa.class.getResource("/Imagens/oceano/oceano glacial artico.png"));
            oceano[3] = ImageIO.read(Mapa.class.getResource("/Imagens/oceano/oceano indico.png"));
            oceano[4] = ImageIO.read(Mapa.class.getResource("/Imagens/oceano/oceano pacifico.png"));
            //países
            pais[0] = ImageIO.read(Mapa.class.getResource("/Imagens/países/alemanha.png"));
            pais[1] = ImageIO.read(Mapa.class.getResource("/Imagens/países/australia.png"));
            pais[2] = ImageIO.read(Mapa.class.getResource("/Imagens/países/brasil.png"));
            pais[3] = ImageIO.read(Mapa.class.getResource("/Imagens/países/camaroes.png"));
            pais[4] = ImageIO.read(Mapa.class.getResource("/Imagens/países/canadá.png"));
            pais[5] = ImageIO.read(Mapa.class.getResource("/Imagens/países/chile.png"));
            pais[6] = ImageIO.read(Mapa.class.getResource("/Imagens/países/estados unidos.png"));
            pais[7] = ImageIO.read(Mapa.class.getResource("/Imagens/países/mexico.png"));
            pais[8] = ImageIO.read(Mapa.class.getResource("/Imagens/países/portugal.png"));
            pais[9] = ImageIO.read(Mapa.class.getResource("/Imagens/países/russia.png"));
        } catch (IOException ex) {
            Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }         
}
