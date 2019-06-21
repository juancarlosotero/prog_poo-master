package Taller2_problema5;

import java.util.Scanner;
public class problema5 {

    public void ejecutar() {

        Scanner entrada = new Scanner(System.in);
        int opcion;

            System.out.println();
            System.out.println("- - - - - - - - - - - - - - ");
            System.out.println("    Bienvenido a la UIP");
            System.out.println("- - - - - - - - - - - - - - ");
            System.out.println();
            System.out.println("Menu de Facultades");
            System.out.println("1. Facultad de Ingenieria");
            System.out.println("2. Facultad de Medicina");
            System.out.println("3. Facultad Economia");
            System.out.println("4. Facultad de Derecho");
            System.out.println("");
            System.out.println("Seleccione una Opcion: ");

            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Usted Ingreso a la Facultad de Ingenieria.");
                    System.out.println("Esta facultad tiene 4 Carreras.");

                    break;

                case 2:
                    System.out.println("Usted Ingreso a la Facultad de Medicina.");
                    System.out.println("Esta facultad tiene 3 Carreras.");
                    break;

                case 3:
                    System.out.println("Usted Ingreso a la Facultad de Economia.");
                    System.out.println("Esta facultad tiene 2 Carreras.");
                    break;
                case 4:
                    System.out.println("Usted Ingreso a la Facultad de Derecho.");
                    System.out.println("Esta facultad tiene 1 Carrera.");
                    break;
                default:
                    System.out.println("");
                    System.out.println("- - - - - - - - - - - - - - ");
                    System.out.println(" - Saliendo del sistema -");
                    System.out.println("- - - - - - - - - - - - - - ");
                    System.out.println("");
                    System.exit(0);
                    break;
            }

    }
}
