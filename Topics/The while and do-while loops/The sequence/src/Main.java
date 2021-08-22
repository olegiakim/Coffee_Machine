import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);  
        int maxNumber = 0;
        while (scanner.hasNext()) {
            int value = scanner.nextInt();
            if (value % 4 == 0 && value > maxNumber) {
                maxNumber = value;
            }
        }
        System.out.println(maxNumber);
    }
}
