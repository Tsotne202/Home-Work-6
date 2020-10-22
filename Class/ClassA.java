package Class;

import Interface.InterfaceA;

import java.util.Scanner;
public class ClassA implements InterfaceA {
    double USD = 1.7710;
    double EUR = 2.2700;
    double GBP = 2.8950;

    @Override
    public void method1() {
        System.out.println("USD: " + USD + " GEL\n" + "EUR: " + EUR + " GEL\n" + "GBP: " + GBP + " GEL\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("How much GEL do you want to convert: \n");
        double input = sc.nextDouble();
        USD = input / USD;
        EUR = input / EUR;
        GBP = input / GBP;
        System.out.println(input + " GEL is: \n\n" + USD + " USD\n" + EUR + " EUR\n" + GBP + " GBP");
    }

    @Override
    public void method2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to change the course? \n");
        String input1 = sc.nextLine();
        if (input1.equals("yes")) {
            System.out.println("USD ");
            USD = sc.nextDouble();
            System.out.println("EUR ");
            EUR = sc.nextDouble();
            System.out.println("GBP ");
            GBP = sc.nextDouble();
            System.out.println("USD: " + USD + " GEL\n" + "EUR: " + EUR + " GEL\n" + "GBP: " + GBP + " GEL\n");
        }
        else
            System.out.println("Thank You ");
    }

    @Override
    public void method3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to convert again?: \n");
        String input2 = sc.nextLine();
        if (input2.equals("yes")) {
            System.out.println("How much GEL do you want to convert: \n");
            double input = sc.nextDouble();
            USD = input / USD;
            EUR = input / EUR;
            GBP = input / GBP;
            System.out.println(input + " GEL is: \n\n" + USD + " USD\n" + EUR + " EUR\n" + GBP + " GBP");
        }
        else
            System.out.println("Thank You ");
    }
}

