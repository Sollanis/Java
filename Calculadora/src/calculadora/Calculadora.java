package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        
        float A,B,sum, sub, mult, div, raiz;
        int opt, segue;
             
        do {
             
            //menu
            opt = Integer.parseInt(JOptionPane.showInputDialog(
                "=============================\n"+
                "O que gostaria de fazer?\n" + 
                "1 - SOMAR\n" + 
                "2 - DIMINUIR\n" + 
                "3 - MULTIPLICAR\n" + 
                "4 - DIVIDIR\n" + 
                "5 - RAIZ\n"  
                )
            ); 
            
            switch (opt) {
                case 1:
                   A = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor"));
                   B = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor"));
                   sum = A+B;
                   JOptionPane.showMessageDialog(null,"O resultado da SOMA é: "+ sum);
                   break;
                case 2:
                   A = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor"));
                   B = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor"));
                   sub = A-B;
                   JOptionPane.showMessageDialog(null,"O resultado da SUBTRAÇÃO é: "+ sub);
                   break;
                case 3:
                   A = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor"));
                   B = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor"));
                   mult = A*B;
                   JOptionPane.showMessageDialog(null,"O resultado da MULTIPLAÇÃO é: "+ mult);
                   break;
                case 4:
                   A = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor"));
                   B = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor"));       
                   div = A/B;
                   JOptionPane.showMessageDialog(null,"O resultado da DIVISÃO é: "+ div);
                    break;
                case 5:
                   A = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor"));
                   raiz = (float) Math.sqrt(A);
                   JOptionPane.showMessageDialog(null,"O resultado da RAIZ QUADRADA é: "+ raiz);
                   break;
                default:
                    throw new AssertionError("FAVOR ESCOLHER UM VALOR VÁLIDO!");
            } 
            
            segue = Integer.parseInt(JOptionPane.showInputDialog("Gostaria de Continuar?\n"
                    +"Digite [0] para sair\n"
                    +"Digite [1] para continuar\n"
            ));
              
        } while (segue != 0);
            
           
            
        System.out.println("\n SAINDO...");
                
    }
    
}

