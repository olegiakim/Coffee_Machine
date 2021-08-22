import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int startHour = scanner.nextInt();
        int startMin = scanner.nextInt();
        int startSec = scanner.nextInt();
        int endHour = scanner.nextInt();
        int endMin = scanner.nextInt();
        int endSec = scanner.nextInt();

        int sumStart = startHour * 3600 + startMin * 60 + startSec;

        int sumEnd = endHour * 3600 + endMin * 60 + endSec;

        int result = sumEnd - sumStart;

        System.out.println(result);


    }
}
