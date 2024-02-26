import java.util.Scanner;

public class nomer3 {
    public static void main(String[] args) {
        boolean persegi14 = true;
        Scanner sc = new Scanner(System.in);
        while (persegi14) {
            
            System.out.print("Masukkan nilai :");
            int angka = sc.nextInt();

            if (angka >= 3) {
                for (int i = 0; i < angka; i++) {
                    for (int j = 0; j < angka; j++) {
                        if (i == 0 || i == angka - 1) {
                            System.out.print(angka);
                        }
                        else if (j == 0 || j == angka - 1) {
                            System.out.print(angka);
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                System.out.println();
                }
            } else {
                System.out.println("Nomor yang anda masukkan kurang dari 3 ");
                continue;
            }
            persegi14 = false;
        }
    }
}
        