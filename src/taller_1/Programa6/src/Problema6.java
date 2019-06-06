import java.util.Scanner;
public class Problema6 {

    //Declarando variables


    String nombreDeportista;
    double tiempo1, tiempo2, tiempo3, tiempo4, tiempo5, promedioTiempo;

    //Instancia de entrada creada

    Scanner entrada= new Scanner(System.in);

    public void mostrar(){

        System.out.println("Bienvenido al programa 6");
        System.out.println("Calcularemos el promedio de tiempo de un deportista que corre 1 km diariamente por 5 dias");
        System.out.println("Ingrese el nombre del deportista:  ");
        //entrada de datos

        nombreDeportista = entrada.nextLine();

        System.out.println("Ingrese el tiempo del dia 1: ");

        //entrada de datos

        tiempo1 = entrada.nextDouble();

        System.out.println("Ingrese el tiempo del dia 2: ");

        //entrada de datos

        tiempo2 = entrada.nextDouble();

        System.out.println("Ingrese el tiempo del dia 3: ");

        //entrada de datos

        tiempo3 = entrada.nextDouble();

        System.out.println("Ingrese el tiempo del dia 4: ");

        //entrada de datos

        tiempo4 = entrada.nextDouble();

        System.out.println("Ingrese el tiempo del dia 5: ");

        //entrada de datos

        tiempo5 = entrada.nextDouble();

        //calculo de promedio de tiempo

        promedioTiempo = (tiempo1+tiempo2+tiempo3+tiempo4+tiempo5)/ 5;

        System.out.println("El deportista: "+nombreDeportista+", hace en tiempo un promedio de : "+promedioTiempo+", en una distancia de 1km");



    }


}