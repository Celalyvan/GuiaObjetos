package test;

import dominio.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

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



    }
}
