import java.util.Scanner;
public class pratik5 {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("dairenin yari capini giriniz:");
        r = input.nextInt();

        double alan = pi * r*r;
        double cevre = 2*r*r;

        System.out.println("dairenin alani:" +alan);
        System.out.println("dairenin cevresi:" +cevre);

    }
}
