/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

import javax.swing.JOptionPane;

/**
 *
 * @author Avelino
 */
public class Aula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HELLO WORLD"); //output 
        JOptionPane.showMessageDialog(null, "HELLO WORLD"); //outputo from console 
        String nome = JOptionPane.showInputDialog("Receba um valor: ");//input data
                
    }
}
