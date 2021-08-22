package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int water = 400;
        int milk = 540;
        int beans = 120;
        int emptyCups = 9;
        int money = 550;

        // Supply at beginning
        System.out.println("The coffee machine has:\n" +
                water + " ml of water\n" +
                milk + " ml of milk\n" +
                beans + " g of coffee beans\n" +
                emptyCups + " disposable cups\n" +
                "$" + money + " of money");
        System.out.println();

        // Action to choose
        System.out.println("Write action (buy, fill, take): ");
        switch (scanner.next()) {
            // buy
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                switch (scanner.nextInt()) {
                    case 1:
                        water -= 250;
                        beans -= 16;
                        emptyCups -= 1;
                        money += 4;
                        break;

                    case 2:
                        water -= 350;
                        milk -= 75;
                        beans -= 20;
                        emptyCups -= 1;
                        money += 7;
                        break;

                    case 3:
                        water -= 200;
                        milk -= 100;
                        beans -= 12;
                        emptyCups -= 1;
                        money += 6;
                        break;

                    default: {
                        System.out.println("Wrong coffee option");
                    }
                }
                break;
            // buy
            case "fill":
                System.out.println("Write how many ml of water you want to add:");
                water += scanner.nextInt();
                System.out.println("Write how many ml of milk you want to add:");
                milk += scanner.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add:");
                beans += scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee you want to add:");
                emptyCups += scanner.nextInt();
                break;
            // take
            case "take":
                System.out.println("I gave you $" + money);
                money = 0;
                break;
            //
            default:
                System.out.println("Wrong option. Please select next time: 1 - espresso, 2 - latte, 3 - cappuccino ");
        }


        // Supply at the end
        System.out.println();
        System.out.println("The coffee machine has:\n" +
                water + " ml of water\n" +
                milk + " ml of milk\n" +
                beans + " g of coffee beans\n" +
                emptyCups + " disposable cups\n" +
                "$" + money + " of money");
    }

}


