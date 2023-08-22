/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inventario_y_stock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Carlos
 */
public class Inventario_Y_Stock {

       public static void main (String[] args) throws IOException{
       InputStreamReader isr = new InputStreamReader (System.in);
       BufferedReader br = new BufferedReader(isr);
       int contador=0;
       
       while(contador<3){
           System.out.println("Ingrese su Usuario: ");
           int usuario = Integer.parseInt(br.readLine());
           System.out.println("Ingrese su Clave: ");
           int clave = Integer.parseInt(br.readLine());
           if (usuario==123 && clave==123){
               System.out.println("Ingreso Correcto!!");
               contador = 3;
               System.out.println("BIENVENIDO!!");
           }
           else{
               System.out.println("INGRESO INCORRECTO");
               contador ++;   
           }
       }
       System.out.println("****************Fin del Programa*****************");
       }
}
