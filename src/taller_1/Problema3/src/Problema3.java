import java.util.Scanner;

public class Problema3 {


    String name;
    int birthYear, age;

    //Instancia de teclado creada

    Scanner entrada = new Scanner(System.in);


    public void mostrar(){

        System.out.println("Bienvenido al problema #3");
        System.out.println("Ingrese su nombre: ");

        //Captura de dato

        name = entrada.next();



        System.out.println("Ingrese su edad: ");

        //Captura de dato

        age = entrada.nextInt();

        //calculo del año de nacimiento

        birthYear = (2019-age);

        System.out.println("Su nombre es: "+name+" "+ ", y el año en que nacio fue: " +birthYear);

    }



}
