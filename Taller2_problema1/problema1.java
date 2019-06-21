package Taller2_problema1;

import java.util.Scanner;
public class problema1 {
//Problema 1 - codigo de area panama - eres local

int codigoArea;
String usuario=null;

//metodo ejecutar

public void ejecutar(){
    Scanner entrada = new Scanner(System.in);

   do {
       System.out.println("Ingrese nombre de usuario : ");
       usuario = entrada.next();
       System.out.println("Ingrese el codigo de Area : ");
       codigoArea = entrada.nextInt();

       if (codigoArea == 507) {
           System.out.println("Usuario : " + usuario + " , eres Local.");
       }
       else {
           System.out.println("Usuario : " + usuario + ", No eres Local, Siguelo Intentando.");

       }


       } while (codigoArea != 507);


   }}