import java.util.Scanner;

public class Day1_ques1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] rotatedArray = rotateArray(arr, k);
        for(int i=0; i<n; i++)
        {
            System.out.print(rotatedArray[i] + " ");
        }
    }

    public static int[] rotateArray(int[] arr, int k)
    {
        int len = arr.length;
        k = k % len;
        int[] temp = new int[len];
        for(int i=0; i<k; i++)
        {
            temp[i] = arr[len-k+i];
        }
        for(int i=k; i<len; i++)
        {
            temp[i] = arr[i-k];
        }
        return temp;
    }
}
