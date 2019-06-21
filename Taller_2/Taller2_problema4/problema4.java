package Taller2_problema4;

import java.util.Scanner;

public class problema4 {



    public void  ejecutar(){

        int experiencia = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido al programa # 4 --->");
        System.out.println("Ingrese los años de experiencia desarrollando : ");
        experiencia = entrada.nextInt();
        if(experiencia>6){
            System.out.println("Usted es un desarollador: ---> LEAD.");
        }
        else if (experiencia >=5 && experiencia <=6)
        {
            System.out.println("Usted es un desarrollador: ---> SENIOR.");
        }
        else if(experiencia>=1 && experiencia <=4){
            System.out.println("Usted es un desarrollador: ---> INTERMEDIO.");
        }
        else {
            System.out.println("Usted es un desarrollador: ---> JUNIOR");
        }



    }

}
