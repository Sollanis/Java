/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entradasaida;

import java.util.Scanner;

public class EntradaSaida {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in); // isntanciar objeto teclado
    
    System.out.print("Ditige um nome: "); 
    String nome = teclado.nextLine(); //receber nome
    
    System.out.print("Ditige uma nota: "); 
    float nota = teclado.nextFloat(); //receber nota
     System.out.printf("A nota de %s é: %.2f \n", nome, nota); //printf = exibir formatado
    }
    
}
