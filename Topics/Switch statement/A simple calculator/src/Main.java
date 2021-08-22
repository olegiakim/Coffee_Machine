import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);

        long firstNumber = input.nextLong();
        String operation = input.next();
        long secondNumber = input.nextLong();

        switch (operation) {
            case "+" :
                System.out.println(firstNumber + secondNumber);
                break;
            case "-" :
                System.out.println(firstNumber - secondNumber);
                break;
            case "/" :
                if (secondNumber == 0) {
                    System.out.println("Division by 0!");
                    break;
                }
                System.out.println(firstNumber / secondNumber);
                break;
            case "*" :
                System.out.println(firstNumber * secondNumber);
                break;
            default:
                System.out.println("Unknown operator");
        }
    }
}