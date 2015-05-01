/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpa;
/**
 *
 * @author ²
 */
public class Mapa {

    public String[] continente = new String[8];
    public String[] pais = new String[7];
    public String[] estado = new String[7];
    
    public Mapa(){
                pais[0] = "Brasil";
                pais[1] = "Chile";
                pais[2] = "Argentina";
                pais[3] = "Espanha";
                pais[4] = "Uruguai";
                pais[5] = "China";
                pais[6] = "Rússia";
                
                continente[0] = "África";
                continente[1] = "Antártida";
                continente[2] = "Europa";
                continente[3] = "Ásia";
                continente[4] = "América do sul";
                continente[5] = "América do norte";
                continente[6] = "América central";
                continente[7] = "Oceania";
                
                estado[0] = "Rio de Janeiro";
                estado[1] = "Minas Gerais";
                estado[2] = "São Paulo";
                estado[3] = "Rio Grande do Sul";
                estado[4] = "Bahia";
                estado[5] = "Paraiba";
                estado[6] = "Roraima";
    }
}
