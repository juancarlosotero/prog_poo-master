import java.util.Scanner;
public class Problema4 {

    String name;
    double totalCompra, totalPagar;

    //Instancia entrada creada

    Scanner entrada = new Scanner(System.in);

    public void mostrar(){

        System.out.println("Bienvenido al programa #4");
        System.out.println("Calcularemos el monto a pagar incluyendo el ITBMS");
        System.out.println("Ingrese el nombre del cliente: ");

        //captura de dato

        name = entrada.nextLine();

        System.out.println("Ingrese el total de la compra: ");

        //captura de dato

        totalCompra= entrada.nextDouble();

        //calculo ITBMS

        totalPagar= (totalCompra*0.07)+totalCompra;

        System.out.println("Estimado cliente: " + name+ ", el monto a pagar incluyendo el ITBMS es de : $" +totalPagar);
    }


}
