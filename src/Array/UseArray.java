package Array;
import java.util.Scanner;

public class UseArray {

    public static void main(String[] args) {
        int [] stID = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<stID.length; i++) {
            System.out.println("Plz enter number: ");
            int value = sc.nextInt();
            stID[i] = value;
        }

        System.out.println("Let's read the array numbers");
        for(int i=0; i<stID.length; i++) {
            System.out.println(stID[i]);
        }
    }
}
