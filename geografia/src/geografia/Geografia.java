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
    private static Rodada rodada = new Rodada(0, 0);
    private static MapBrasil mapBR = new MapBrasil();
    private static MapMundi mapMUNDI = new MapMundi();

    public static void SelecionaModo(int mod) {
        if (mod == 1) {
            mapBR.ComeçaJogo();
            rodada.ContaAcertos(mapBR.GetAcertos());
            rodada.ContaErros(mapBR.GetErros());
            rodada.Tempo(mapBR.Tinicio(), mapBR.Ttermino());
        } else if (mod == 2) {
            mapMUNDI.ComeçaJogoMod2();
            rodada.ContaAcertos(mapMUNDI.GetAcertos());
            rodada.ContaErros(mapMUNDI.GetErros());
            rodada.Tempo(mapMUNDI.Tinicio(), mapMUNDI.Ttermino());
        } else if (mod == 3) {
            mapMUNDI.ComeçaJogoMod3();
            rodada.ContaAcertos(mapMUNDI.GetAcertos());
            rodada.ContaErros(mapMUNDI.GetErros());
            rodada.Tempo(mapMUNDI.Tinicio(), mapMUNDI.Ttermino());
        }
    }

    public static void main(String[] args) {
        int seleciona;
        System.out.println("Selecione um modo de jogo(modo1 modo2 modo3)");
        Scanner entrada = new Scanner(System.in);
        seleciona = entrada.nextInt();
        SelecionaModo(seleciona);
        rodada.imprime();
    }

}
