/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package Ex13.base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        double principal = myApp.getPrincipal();
        double rate = myApp.getRate();
        double years = myApp.getYears();
        int compounded = myApp.getCompounded();
        double result = myApp.calc(principal, rate, years, compounded);
        myApp.outPut(years, rate, result, compounded, principal);
    }

    private void outPut(double years, double rate, double result, double compounded, double principal) {
        System.out.println("$" + String.format("%.0f", principal) + " invested at " + (rate * 100) + "% for " + String.format("%.0f", years) + " years compounded " + String.format("%.0f", compounded) + " times per year is $" + String.format("%.2f", result) + ".");
    }

    private double calc(double principal, double rate, double years, double compounded) {
        return Math.ceil((principal * (Math.pow((1 + (rate / compounded)),(compounded * years)))) * 100) / 100;

    }

    private double getPrincipal() {
        System.out.print("What is the principal amount? ");
        return Double.parseDouble(in.nextLine());
    }

    private double getRate() {
        System.out.print("What is the rate? ");
        return (Double.parseDouble(in.nextLine())) / 100;
    }

    private double getYears() {
        System.out.print("What is the number of years? ");
        return Double.parseDouble(in.nextLine());
    }

    private int getCompounded() {
        System.out.print("What is the number of times the interest is compounded per year? ");
        return Integer.parseInt(in.nextLine());
    }

}
