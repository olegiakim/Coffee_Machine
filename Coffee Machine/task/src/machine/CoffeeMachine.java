package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // in machine from start
        int waterInMachine = 400;
        int milkInMachine = 540;
        int coffeeBeansInMachine = 120;
        int disposableCupsInMachine = 9;
        int moneyInMachine = 550;

        // required portion to make:
        // Espresso
        int requiredOfWaterForEspresso = 250;
        int requiredOfCoffeeBeansForEspresso = 16;
        // Latte
        int requiredOfWaterForLatte = 350;
        int requiredOfMilkForLatte = 75;
        int requiredOfCoffeeBeansForLatte = 20;
        // Cappuccino
        int requiredOfWaterForCappuccino = 350;
        int requiredOfMilkForCappuccino = 75;
        int requiredOfCoffeeBeansForCappuccino = 20;


            while (true) {

                // Action to choose
                System.out.println("Write action (buy, fill, take, remaining, exit): ");
                switch (scanner.next()) {

                    // action to buy
                    case "buy":
                        System.out.println();
                        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                        switch (scanner.next()) {

                            // espresso
                            case "1":
                                if (waterInMachine >= requiredOfWaterForEspresso && coffeeBeansInMachine >= requiredOfCoffeeBeansForEspresso && disposableCupsInMachine >= 1) {
                                    System.out.println("I have enough resources, making you a coffee!");
                                    waterInMachine -= 250;
                                    coffeeBeansInMachine -= 16;
                                    disposableCupsInMachine -= 1;
                                    moneyInMachine += 4;
                                } else if ( waterInMachine < requiredOfWaterForEspresso){
                                    System.out.println("Sorry, not enough water!");
                                } else if ( coffeeBeansInMachine < requiredOfCoffeeBeansForEspresso) {
                                    System.out.println("Sorry, not enough coffee beans!");
                                } else {
                                    System.out.println("Sorry, not disposable cups!");
                                }
                                break;

                            // latte
                            case "2":
                                if (waterInMachine >= requiredOfWaterForLatte && milkInMachine >= requiredOfMilkForLatte && coffeeBeansInMachine >= requiredOfCoffeeBeansForLatte && disposableCupsInMachine >= 1) {
                                    System.out.println("I have enough resources, making you a coffee!");
                                    waterInMachine -= 350;
                                    milkInMachine -= 75;
                                    coffeeBeansInMachine -= 20;
                                    disposableCupsInMachine -= 1;
                                    moneyInMachine += 7;
                                } else if (waterInMachine < requiredOfWaterForLatte) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (milkInMachine < requiredOfMilkForLatte) {
                                    System.out.println("Sorry, not enough milk!");
                                } else if (coffeeBeansInMachine < requiredOfCoffeeBeansForLatte) {
                                    System.out.println("Sorry, not enough coffee beans!");
                                } else {
                                    System.out.println("Sorry, not disposable cups!");
                                }
                                break;

                            // cappuccino
                            case "3":
                                if ( waterInMachine >= requiredOfWaterForCappuccino && milkInMachine >= requiredOfMilkForCappuccino && coffeeBeansInMachine >= requiredOfCoffeeBeansForCappuccino) {
                                    waterInMachine -= 200;
                                    milkInMachine -= 100;
                                    coffeeBeansInMachine -= 12;
                                    disposableCupsInMachine -= 1;
                                    moneyInMachine += 6;
                                } else if (waterInMachine < requiredOfWaterForCappuccino) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (milkInMachine < requiredOfMilkForCappuccino) {
                                    System.out.println("Sorry, not enough milk!");
                                } else if (coffeeBeansInMachine < requiredOfCoffeeBeansForCappuccino) {
                                    System.out.println("Sorry, not enough coffee beans!");
                                } else {
                                    System.out.println("Sorry, not disposable cups!");
                                }
                                break;

                            case "back":
                                break;

                            default: {
                                System.out.println("Incorrect input");
                            }
                        }
                        break;

                    // action to fill
                    case "fill":
                        System.out.println();
                        System.out.println("Write how many ml of water you want to add:");
                        waterInMachine += scanner.nextInt();
                        System.out.println("Write how many ml of milk you want to add:");
                        milkInMachine += scanner.nextInt();
                        System.out.println("Write how many grams of coffee beans you want to add:");
                        coffeeBeansInMachine += scanner.nextInt();
                        System.out.println("Write how many disposable cups of coffee you want to add:");
                        disposableCupsInMachine += scanner.nextInt();
                        break;

                    // action to take
                    case "take":
                        System.out.println();
                        System.out.println("I gave you $" + moneyInMachine);
                        moneyInMachine = 0;
                        break;

                    // action to remaining
                    case "remaining":
                        System.out.println("\n" + "The coffee machine has:\n" +
                                waterInMachine + " ml of water\n" +
                                milkInMachine + " ml of milk\n" +
                                coffeeBeansInMachine + " g of coffee beans\n" +
                                disposableCupsInMachine + " disposable cups\n" +
                                "$" + moneyInMachine + " of money");
                        break;

                    // action to exit
                    case "exit":
                        System.exit(0);
                        
                    default:
                        System.out.println();
                        System.out.println("Incorrect input");
                }
                System.out.println();
            }
    }
}


