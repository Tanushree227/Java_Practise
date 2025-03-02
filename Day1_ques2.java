import java.util.Scanner;

public class Day1_ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int l = sc.nextInt();
        int currentWater = c;
        int day = 1;
        while (currentWater > 0) {
            currentWater -= day;
            if(currentWater <= 0) {
                System.out.println("The tank will be emptied on day " + day);
                break;
            }
            currentWater = Math.min(currentWater + l, c);
            day++;
        }
    }
}
