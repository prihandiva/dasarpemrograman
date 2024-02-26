import java.util.Scanner;

public class chat {
    public static void main(String[] args) {
        boolean cek = true;
        Scanner fit = new Scanner(System.in);
        Semen[] sm = new Semen[3];
        Bata[] bt = new Bata[3];
        int total[] = { 0, 0, 0 };

        sm[0] = new Semen("Semen Garuda", 5000, 50000);
        sm[1] = new Semen("Semen Tiga Roda", 3000, 45000);
        sm[2] = new Semen("Semen Holcim", 1000, 55000);
        bt[0] = new Bata("Bata Ringan Citicon", 100000, 650000);
        bt[1] = new Bata("Bata Ringan Bricon", 200000, 700000);
        bt[2] = new Bata("Bata Ringan Blesscon", 150000, 600000);

        System.out.println("\nSilahkan pilih daftar pilihan anda");
        System.out.println("\n1.Stock Barang   \n2.Pengiriman barang \n3.Cetak Invoice \n4.Laporan Barang Terkirim \n5.Log Out");
        System.out.println("\n Pilih (1/2/3/4/5)");
        int choice = fit.nextInt();
        switch (choice) {
            case 1:
                // Code for case 1
                break;
            case 2:
                System.out.println("----Menu Pengiriman Barang----");
                System.out.println("Pilih Toko Tujuan :");
                System.out.println("\nA.Toko 1 \nB.Toko 2 \nC.Toko 3");
                System.out.println("\n Pilih (A/B/C)");
                String nmtoko = fit.next();
                int kirimSemen = 0; // Declare kirimSemen variable outside the switch statement
                int kirimBata = 0; // Declare kirimBata variable outside the switch statement
                int hargaSemen = 0;
                int hargaBata = 0;
                switch (nmtoko) {
                    case "A":
                        System.out.println("Masukkan Jumlah Semen yang akan dikirim");
                        kirimSemen = fit.nextInt();
                        hargaSemen = kirimSemen * 45000;
                        System.out.println("Masukkan Jumlah Bata Ringan yang akan dikirim");
                        kirimBata = fit.nextInt();
                        hargaBata = kirimBata * 100000;
                        total[0] = hargaSemen + hargaBata;
                        break;
                    case "B":
                        System.out.println("Masukkan Jumlah Semen yang akan dikirim");
                        kirimSemen = fit.nextInt();
                        hargaSemen = kirimSemen * 45000;
                        System.out.println("Masukkan Jumlah Bata Ringan yang akan dikirim");
                        kirimBata = fit.nextInt();
                        hargaBata = kirimBata * 100000;
                        total[1] = hargaSemen + hargaBata;

                }
            }
        }
    }       
