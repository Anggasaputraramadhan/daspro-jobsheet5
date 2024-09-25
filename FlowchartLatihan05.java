import java.util.Scanner;

public class FlowchartLatihan05 {

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        int usia;
        System.out.print("Masukan Usia Anda : ");
        usia = sc.nextInt();

        if (usia < 0) {
            System.out.println("Usia tidak boleh negatif");
        } else if (usia < 13) {
            System.out.println("Anak");
        } else if (usia < 20) {
            System.out.println("Remaja");
        } else if (usia < 65) {
            System.out.println("Dewasa");
        } else {
            System.out.println("Lansia");
        }
    }
}
