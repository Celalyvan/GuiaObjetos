package dominio;

import java.util.Scanner;

public class Banco {
    private static int idClass;
    private int idAccount;
    private String name;
    private double balance;

    public Banco(String name, double balance) {
        this.name = name;
        this.balance= balance;
        this.idAccount = ++idClass;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Numero de cuenta ");
        sb.append("N° - ").append(idAccount);
        sb.append(", Titular: '").append(name).append('\'');
        sb.append(", Balance= $").append(balance).append(".");
        return sb.toString();
    }

    public void credito(){
        Scanner input = new Scanner(System.in);
        double deposit;

        do {
            System.out.println("Cuanto dinero desea depositar?");
            deposit= input.nextDouble();

            if (deposit<1){
                System.out.println("monto no valido");
            }
        }while (deposit<1); //esta hecho adrede :)  // enviar al main

        updateBalance(deposit);

    }

    public void debito(){
        Scanner input = new Scanner(System.in);
        double debit;

        do {
            System.out.println("Cuanto dinero desea retirar? Presione 0 para salir");
            debit= input.nextDouble();

            if (debit<0){
                System.out.println("monto no valido");
            }

            if (this.balance<debit){
                System.out.println("fondos insuficientes: $"+ this.balance);
            }

        }while (debit<0 || this.balance<debit); // enviar al main

        if (debit!=0)
            updateBalance(-1*debit);

    }

    private void updateBalance(double newBalance){

        this.balance+=newBalance;

        System.out.println("Monto final: $" + balance);
    }

}
