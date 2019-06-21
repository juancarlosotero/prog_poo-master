package Taller2_problema3;

import java.util.Scanner;


public class problema3 {



    public void ejecutar(){


        char dato;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una letra:");
        dato=entrada.next().charAt(0);

            if (dato == 'a'||dato =='e'||dato=='i'||dato=='o'||dato=='u')
            {
                System.out.println("La letra ingresada corresponde a una vocal."+"\n"+"La  Vocal es la : "+dato);
            } else
                System.out.println("La letra ingresada no es una vocal.");

        }
    }