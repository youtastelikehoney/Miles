package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int ticketPrice = 20000;
    int oneMile = 20;
    int bonus = ticketPrice/oneMile;
        System.out.println("Стоимость билета: " + ticketPrice + " руб.");
        System.out.println("Начислено миль: " + bonus);
    }
}