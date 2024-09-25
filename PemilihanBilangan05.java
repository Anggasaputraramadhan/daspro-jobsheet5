import java.util.Scanner;

public class PemilihanBilangan05 {

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan sebuah angka: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0)
        {
            System.out.println("Angka " + angka + " termasuk bilangan genap");
        }
        else
        {
            System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        }
        
        String hasil = (angka % 2 == 0) ? "Angka " + angka + " termasuk bilangan genap"
                : "Angka " + angka + " termasuk bilangan ganjil";

        System.out.println(hasil);
    }

}