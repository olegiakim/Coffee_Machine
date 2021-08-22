import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);


        int sum = 0;

        while (input.hasNext()) {

            int value = input.nextInt();

            sum += value;

            if (value >= 1000) {
                System.out.println(value - 1000);
                System.exit(0);
            }

            if (value == 0) {
                System.out.println(sum);
                System.exit(0);
            }


            if (sum >= 1000) {
                System.out.println(sum - 1000);
                System.exit(0);
            }

            }

        }
    }
