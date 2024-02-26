import java.util.Scanner;

public class nomer4 {
    public static void main(String[] args) {
        boolean persegi = true;
        Scanner sc = new Scanner(System.in);
        while (persegi) {
            
            System.out.print("Masukkan nilai :");
            int angka = sc.nextInt();

            if (angka>= 3) {
                for (int i = 1; i <= angka; i++) {
                    if (i % 2 != 0) {
                       
                        for (int j = 1; j <= angka; j++) {
                            System.out.print(j);
                        }
                    } else {
                        
                        for (int j = angka; j >= 1; j--) {
                            System.out.print(j);
                        }
                    }
                System.out.println();
                }
            } else {
                System.out.println("Nomor yang anda masukkan kurang dari 5 ");
                continue;
            }
             persegi = false;
        }
    }
}
        