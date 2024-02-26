import java.util.Scanner;
public class ForKelipatan1C14 {
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        int kelipatan;
        double jumlah=0;
        int counter=0;
        double rata;

        System.out.print("Masukkan bilangan kelipatan (1-9):");
        kelipatan = scan.nextInt();

        for (int i=1; i <= 50; i++){
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }
         rata = jumlah/counter;
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %.1f\n", kelipatan, jumlah);
        System.out.printf("Rata rata dari seluruh bilangan %d kelipatan yang ditemukan adalah %.1f\n", kelipatan, rata);
    }
}