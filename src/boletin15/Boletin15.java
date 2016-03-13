/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

/**
 *
 * @author Pablo
 */
public class Boletin15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Xogador delantero = new Xogador(5,"Selecion");
        Masaxista masaxista1 = new Masaxista("Graduada",5);
        Entrenador entrenador1 = new Entrenador("2");
        delantero.concentrarse();
        masaxista1.concentrarse();
        entrenador1.concentrarse();
        delantero.viaxar();
        masaxista1.viaxar();
        entrenador1.viaxar();
    }
    
}
