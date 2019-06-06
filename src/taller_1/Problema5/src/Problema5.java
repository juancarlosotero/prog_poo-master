import java.util.Scanner;
public class Problema5 {

    //Declarando variables

    int codigoArticulo;
    String descripcionArticulo;
    double precioCosto, precioVenta;

    //Instancia de entrada creada

    Scanner entrada= new Scanner(System.in);

    public void mostrar(){

        System.out.println("Bienvenido al programa 5");
        System.out.println("Calcularemos el precio de venta de un articulo con una ganancia del 30%");
        System.out.println("Ingrese la descripcion del articulo:");

        //entrada de datos

        descripcionArticulo = entrada.nextLine();
        System.out.println("Ingrese el codigo del articulo:");

        //entrada de datos

        codigoArticulo = entrada.nextInt();
        System.out.println("Ingrese el precio de costo del articulo: ");

        //entrada de datos

        precioCosto = entrada.nextDouble();

        //calculo de precio de venta

        precioVenta = (precioCosto*0.30)+ precioCosto;

        System.out.println("El articulo: "+descripcionArticulo+", con codigo: "+codigoArticulo+", tendra un precio de venta de : $"+precioVenta);



    }


}
