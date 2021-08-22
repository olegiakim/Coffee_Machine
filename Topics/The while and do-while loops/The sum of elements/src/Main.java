import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNext()) {
            int value = scanner.nextInt();
            if (value == 0) {
                System.out.println(sum);
                System.exit(0);
            }
            sum += value;      
        }

    }
}
