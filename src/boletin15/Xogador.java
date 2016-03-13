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
public class Xogador extends Personas {
       int dorsal;
    String demarcacion;

public Xogador(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
@Override
public void viaxar(){
    JOptionPane.showMessageDialog(null,"Viaxan os xogadores");
}
public void xogarPartido(){}
public void entrenar(){}


}
