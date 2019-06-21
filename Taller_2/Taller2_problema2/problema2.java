package Taller2_problema2;

import java.util.Scanner;

public class problema2 {

    // Vector transacciones = new Vector();
    float [] transaccion = new float[10];
    String nombreCliente = null;
    String apellidoCliente = null;
    float capital =0;
    float temp = 0;
    Double interes=0.02;
    double saldo = 0;
    double total=0;

    //crear metodo ejecutar

    public void ejecutar(){


        Scanner entrada = new Scanner(System.in);
        System.out.println("Problema #2");

        System.out.print("Ingrese el Nombre del cliente: ");
        nombreCliente = entrada.next();
        System.out.print("Ingrese el Apellido del cliente: ");
        apellidoCliente = entrada.next();
        System.out.println("Ingrese el Capital a Invertir: ");
        capital = entrada.nextFloat();

        System.out.println("Monto #1 -> ");
        transaccion[0] = entrada.nextFloat();

        System.out.println("Monto #2 -> ");
        transaccion[1] = entrada.nextFloat();

        System.out.println("Monto #3 -> ");
        transaccion[2] = entrada.nextFloat();

        System.out.println("Monto #4 -> ");
        transaccion[3] = entrada.nextFloat();

        System.out.println("Monto #5 -> ");
        transaccion[4] = entrada.nextFloat();

        System.out.println("Monto #6 -> ");
        transaccion[5] = entrada.nextFloat();

        System.out.println("Monto #7 -> ");
        transaccion[6] = entrada.nextFloat();

        System.out.println("Monto #8 -> ");
        transaccion[7] = entrada.nextFloat();

        System.out.println("Monto #9 -> ");
        transaccion[8] = entrada.nextFloat();

        System.out.println("Monto #10 -> ");
        transaccion[9] = entrada.nextFloat();


        //TODO: implementar con for

        // la logica
        temp =(transaccion[0] + transaccion[1] + transaccion[2] + transaccion[3] + transaccion[4] + transaccion[5] + transaccion[6] + transaccion[7] + transaccion[8] + transaccion[9]);
        saldo = capital + temp;

        if(saldo>=10000) {
            //incrementar la variable interes +=
            interes += 0.05;
        }
        else if (saldo>=500){
            interes += 0.03;
        }
        else if (saldo>=100){
            interes+=0.01;
        }
        else{
            System.out.println("No aplica");
        }
        total=saldo+(saldo*interes);

        System.out.println("Su total del mes es de:  ->"+total);

    }



}




