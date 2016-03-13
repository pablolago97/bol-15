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
public class Entrenador extends Personas {
 
    String idFederacion;

    public Entrenador(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirixirPartido(){}
    
    public void dirixirAdestramento(){}

    @Override
    public String toString() {
        return "entrenador{" + "idFederacion=" + idFederacion + '}';
    }
    @Override
    public void viaxar(){
        JOptionPane.showMessageDialog(null,"Viaxa o adestrador");
    }
}