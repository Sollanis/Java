/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;
/*
 * @author jose.avelino
 */
public class Calculadora {

    public static void main(String[] args) {
        
        float A, B, sum, sub, mult, div, raiz;
        int opt;
        Scanner val = new Scanner(System.in);
        
        do {    
            
            System.out.println("=============================");
             //get values
             System.out.print("Digite um valor: ");
                 A = val.nextInt();
             System.out.print("Digite outro valor: ");
                 B = val.nextInt();

             //menu
             System.out.println("O que gostaria de fazer?");
             System.out.println("1 - SOMAR");
             System.out.println("2 - DIMINUIR");
             System.out.println("3 - MULTIPLICAR");
             System.out.println("4 - DIVIDIR");
             System.out.println("5 - RAIZ");
             System.out.println("0 - SAIR");
                 opt = val.nextInt();

             switch (opt) {
                 case 1:
                     sum = A+B;
                     System.out.println("O resultado da SOMA é: "+ sum);
                     break;
                 case 2:
                     sub = A-B;
                     System.out.println("O resultado da SUTRAÇÃO é: "+ sub);
                     break;
                 case 3:
                     mult = A*B;
                     System.out.println("O resultado da MULTIPLICAÇÃO é: "+ mult);
                     break;
                 case 4:
                     div = A/B;
                     System.out.println("O resultado da DIVISÃO: "+ div);
                     break;
                 case 5:
                     raiz = A+B;
                     System.out.println("O resultado da RAIZ QUADRADA é: "+ raiz);
                     break;
                 case 0:
                     
                     break;
                 default:
                     throw new AssertionError("FAVOR ESCOLHER UM VALOR VÁLIDO!");
             } 
        } while (opt != 0);
        System.out.println("SAINDO...");
                
    }
    
}
