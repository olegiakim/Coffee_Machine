package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int cupsOfCoffee = scanner.nextInt();

        if(cupsOfCoffee == 0){
            System.out.println("Yes, I can make that amount of coffee");
            System.exit(0);
        }

        int portionOfWater = water / 200;
        int portionOfMilk = milk / 50;
        int portionOfBeans = beans / 15;


        int totalCupsOfCoffee = 0;
        if(portionOfWater < portionOfMilk && portionOfWater < portionOfBeans){
            totalCupsOfCoffee = portionOfWater;
        } else if (portionOfMilk < portionOfBeans) {
            totalCupsOfCoffee = portionOfMilk;
        } else {
            totalCupsOfCoffee = portionOfBeans;
        }

        if(cupsOfCoffee == totalCupsOfCoffee){
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cupsOfCoffee <= totalCupsOfCoffee){
            System.out.println("Yes, I can make that amount of coffee (and even " + (totalCupsOfCoffee - cupsOfCoffee ) + " more than that)");
        } else {
            System.out.println("No, I can make only " + (totalCupsOfCoffee) +" cup(s) of coffee");
            }
    }
}
