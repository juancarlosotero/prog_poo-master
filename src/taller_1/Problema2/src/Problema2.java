import java.util.Scanner;

public class Problema2 {


        String name, lastname;
        int birthYear, age;

        //Instancia de teclado creada

        Scanner entrada = new Scanner(System.in);


        public void mostrar(){

            System.out.println("Bienvenido al problema #2");
            System.out.println("Ingrese su nombre: ");

            //Captura de dato

            name = entrada.next();

            System.out.println("Ingrese su apellido: ");

            //Captura de dato

            lastname = entrada.next();

            System.out.println("Ingrese su año de nacimiento: ");

            //Captura de dato

            birthYear = entrada.nextInt();

            //calculo de la edad

            age = (2019 - birthYear);

            System.out.println("Su nombre completo es: "+name+" "+lastname+ ", y su edad es: " +age + " años.");

        }



    }

