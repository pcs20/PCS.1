/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geografia;
import java.util.Scanner;
import mpa.MapBrasil;
import mpa.MapMundi;
import mpa.Mapa;
import mpa.Rodada;

/**
 *
 * @author ²
 */
public class Geografia {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int seleciona;
        
        System.out.println("Selecione um modo de jogo(modo1 modo2 modo3)");
        Scanner entrada = new Scanner(System.in);
        seleciona = entrada.nextInt();
        Rodada rodada = new Rodada(0, 0);
        rodada.SelecionarModo(seleciona);
        rodada.imprime();
    }    
}
