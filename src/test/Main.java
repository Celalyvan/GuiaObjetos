package test;

import dominio.Employee;
import dominio.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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

        Employee arrayEmployee[] ={new Employee("Carlos","Guitierrez", 25000.0, 23456345),
                new Employee("Ana", "Sánchez", 27500.0, 34234123)};
        int opcion;

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

    public static void menu(){
        System.out.println("1.mostrar empleados");
        System.out.println("2.modificar salarios");
        System.out.println("\n\t0.salir");

    }

    public static void printArrayEmployees(Employee array[]){
       /* for (Employee local :
                array) {
            System.out.println(local.toString());
        }*/
        for (int i =0; i< array.length; i++)
            System.out.println(array[i].toString());
    }

    public static void modifySalary(Employee employees[]){
        System.out.println("DNI del empleado: ");

        Scanner input = new Scanner(System.in);
        long localDNI= input.nextLong();

        Employee localEmployee = null;

        int i=0;
        while ( i< employees.length){

            if (employees[i].getDni()==localDNI)
                localEmployee =employees[i];

            i++;
        }

        if (localEmployee!=null){
            System.out.println("ingrese el porcentaje del salario");
            updateySalary(localEmployee, input.nextFloat());
        }

    }

    public static void updateySalary(Employee employee, float percentage){ //no deberia de estar en la clase empleado, no?
        double localSalary=employee.getSalary()+ employee.getSalary() * (percentage/100);

        employee.setSalary(localSalary);
    }
}
