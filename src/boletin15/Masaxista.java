/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class Masaxista extends Personas {
      String titulacion;
    int anosExperiencia;

    public Masaxista(String titulacion, int anosExperiencia) {
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

   

    @Override
    public String toString() {
        return "masaxista{" + "titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia + '}';
    }
    @Override
    public void viaxar(){
        JOptionPane.showMessageDialog(null,"Viaxan os masaxistas");
    }
}