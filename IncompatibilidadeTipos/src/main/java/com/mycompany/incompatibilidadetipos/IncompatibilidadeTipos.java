package com.mycompany.incompatibilidadetipos;

public class IncompatibilidadeTipos {

    public static void main(String[] args) {
        
/*
    //DE STRING PARA INTEIRO    
        String idade = "alo";
//        String valor = idade; //ocorre erro pois um inteiro não pode ser usado como string no java
//        String valor = (String)idade;//nem mesmo com typecast funciona
        
//        String valor = Integer.toString(idade);// string valor recebe a classe invólucro Integer convertendo(toString)
        System.out.println(valor);
*/

    //DE INTEIRO PARA STRING
       String valor = "30";
       int idade = Integer.parseInt(valor); //parsear (verter) para inteiro
        
    }
}
