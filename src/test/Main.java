package test;

import dominio.*;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int opcion;
// asd asd
/*      //EJERCICIO 1


        System.out.println("Cargue su rectangulo");

        Rectangle newRectangle= new Rectangle();

        System.out.println("Ancho: ");
        newRectangle.setWidth(input.nextDouble());

        System.out.println("Largo: ");
        newRectangle.setHight(input.nextDouble());

        System.out.println("newRectangle = " + newRectangle);

        System.out.println("Area: " + newRectangle.calculateArea());

        System.out.println("Perimetro: " + newRectangle.calculatePerimeter(newRectangle.getWidth(),
                newRectangle.getHight()));

        Rectangle rectangulusPedorrus = new Rectangle();

        System.out.println("rectangulusPedorrus = " + rectangulusPedorrus);
*/
/*      Ejercicio 2
        Employee arrayEmployee[] ={new Employee("Carlos","Guitierrez", 25000.0, 23456345),
                new Employee("Ana", "Sánchez", 27500.0, 34234123)};


        menu();

        do {

        opcion = input.nextInt();

            switch (opcion){
                case 1:
                    printArrayEmployees(arrayEmployee);
                    break;

                case 2:
                    modifySalary(arrayEmployee);
                    break;

                default:
                    System.out.println("opcion no valida");
                    break;
            }
        }while (opcion!=0);


    }

*/
/*      //Ejercicio 3     //preguntar como aplicariamos impuestos al total
        Item arrayItems[] = {new Item("coca", 12, 85.0),
                new Item("papas 45g", 40, 65.35), new Item("DRF", 8, 25)};

        System.out.println("");
        for (Item local :
                arrayItems) {
            System.out.println(local.toString());
        }
*/

/*        //Ejercicio 4
        System.out.println("\n\n\t\tBienvenido a bancos Tesacolaplata");

        System.out.println("\nCreando nueva cuenta");
        System.out.println("\n\ningrese su nombre");
        String localName = input.nextLine();

        System.out.println("\ningrese un monto de apertura");
        double localBalance = input.nextDouble();

        Banco cuentaLocal = new Banco(localName, localBalance);
        System.out.println("\nCuenta creada, ¡bienvenido a Tesacolaplata! :)");

        do {
            menu2();
            System.out.println("\n Que operacion desea realizar?");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    cuentaLocal.credito();
                    break;

                case 2:
                    cuentaLocal.debito();
                    break;

                default:
                    if (opcion!=0)
                    System.out.println("opcion no valida");
                    break;
            }
        } while (opcion != 0);
*/

        //Ejercicio 5

        Hora relos= new Hora(14,4,22);

        for (int i = 0; i < 3600; i++) {
            relos=relos.increase1Second(relos);
            System.out.println(relos.toString());

            Thread.sleep(1000);
        }




    }


    public static void printArrayEmployees(Employee array[]) {
        for (Employee local :
                array) {
            System.out.println(local.toString());
        }
    }

    public static void modifySalary(Employee employees[]) {
        System.out.println("DNI del empleado: ");

        Scanner input = new Scanner(System.in);
        long localDNI = input.nextLong();

        Employee localEmployee = null;

        int i = 0;
        while (i < employees.length) {

            if (employees[i].getDni() == localDNI)
                localEmployee = employees[i];

            i++;
        }

        if (localEmployee != null) {
            System.out.println("ingrese el porcentaje del salario");
            updateySalary(localEmployee, input.nextFloat());
        }

    }

    public static void updateySalary(Employee employee, float percentage) { //no deberia de estar en la clase empleado, no?
        double localSalary = employee.getSalary() + employee.getSalary() * (percentage / 100);

        employee.setSalary(localSalary);
    }

    public static void menu() {
        System.out.println("1.mostrar empleados");
        System.out.println("2.modificar salarios");
        System.out.println("\n\t0.salir");
    }

    public static void menu2() {
        System.out.println("1.Operacion de Credito");
        System.out.println("2.Operacion de Debito");
        System.out.println("\n\t0.Salir");
    }


}
