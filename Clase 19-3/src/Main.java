import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int integer;
        Scanner input = new Scanner(System.in);

        /**
         *
         * Programa Java que declare una variable A de tipo entero, asignarle un valor. A
         * continuación mostrar un mensaje indicando si A es par o impar.
         *
         **/
   /*     do {
            System.out.println("inserte numero : ");
            integer=input.nextInt();
            if (pair(integer)){
                System.out.println("numero par");
            }else{
                System.out.println("numero impar");
            }
        }while(integer!=999);
*/

       /**
        *
        * Programa que lee por teclado el valor del radio de una circunferencia, calcula y
        * muestra por pantalla la longitud y el área de la circunferencia.
        *
       **/
        System.out.println("radio: ");
        double radio= input.nextDouble();

        System.out.println("Radio: " + circleRadius(radio)+"cm");
        System.out.println("Radio: " + circlePerimetre(radio)+"cm");

        


    }

    private static Boolean pair(int numero){
        Boolean flag=false;

        if(numero%2==0){
            flag=true;
        }

        return flag;
    }

    private static double circleRadius(double numero){
        return 3.14 * numero * numero;
    }

    private static double circlePerimetre(double numero){
        return 3.14 * 2 * numero;
    }

}
