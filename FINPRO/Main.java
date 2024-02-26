import java.util.Scanner;

public class Main {
    // Declaration of variables and arrays
    static int i, k, y;
    static String namaToko[] = new String[10];
    static String namaKrd, kodeKrd;
    static int hargaKrd, stok;
    static Kerudung krd[] = new Kerudung[5];
    static int jumlah[][] = new int[10][5];
    static int total[][] = new int[10][5];
    static int jmlToko, tanyaBarang;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        char masuk, tambah;
        boolean cek = true;

        // Initialization of Kerudung objects
        krd[0] = new Kerudung("Persegi Voal", 250000, 100, "A");
        krd[1] = new Kerudung("Persegi Scraf", 350000, 100, "B");
        krd[2] = new Kerudung("Pashmina Ceruty", 350000, 100, "C");
        krd[3] = new Kerudung("Pashmina Satin", 350000, 100, "D");
        krd[4] = new Kerudung("Pashmina Silk", 400000, 100, "E");

        Main main = new Main(); // Object creation for accessing non-static methods

        System.out.println("\n\n\n\n^^^^^^^^^^ APLIKASI DISTRIBULA ^^^^^^^^^\n\n\n\n");
        System.out.println("Apakah Anda ingin masuk? (Y/T) ");
        masuk = sc.next().charAt(0);
        if (masuk == 'T' || masuk == 't') {
            System.out.println("TERIMA KASIH");
        } else if (masuk == 'Y' || masuk == 'y') {
            System.out.println("-------------- PT YAMALDI SATU --------------");
            System.out.println("-------------- SELAMAT DATANG! --------------\n");
            System.out.println("Masukkan nama pengguna (Admin) : ");
            String namaAdmin = sc.nextLine();
            sc.nextLine();
            System.out.println("Masukkan kata sandi Anda       : ");
            String kataSandi = sc.nextLine();
            if (kataSandi.equalsIgnoreCase("12345")) {
                while (cek) {
                    System.out.println("\n~----------------------\n");
                    System.out.println("--------- MENU ----------\n");
                    System.out.println("----------------------~\n");
                    System.out.println("Silahkan memilih menu!! \n");
                    System.out.println("\n1. Daftar Barang \n2. Pengiriman Barang \n3. Laporan Pengiriman Barang \n4. Keluar");
                    System.out.println("Pilih salah satu (1/2/3/4)");
                    choice = sc.nextInt();
                    sc.nextLine();
                    switch (choice) {
                        case 1:
                            // Display list of available items
                            System.out.println("-------------------------------- PT YAMALDI SATU --------------------------------");
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.println("|\tJenis Bahan\t\t|\tHarga\t|\tStok\t|\tKode\t|");
                            System.out.println("---------------------------------------------------------------------------------");
                            for (int i = 0; i < krd.length; i++) {
                                System.out.println("|\t" + krd[i].namaKrd + "\t\t|\t" + krd[i].hargaKrd + "\t|\t" + krd[i].stok + "\t|\t" + krd[i].kodeKrd + "\t|");
                            }
                            System.out.println("--------------------------------+---------------+---------------+----------------");
                            System.out.println("---------------------------------------------------------------------------------\n");
                            break;
                        case 2:
                            // Place an order
                            do {
                                main.hargaBarang(i);
                                System.out.println("Apakah pesanan sudah selesai? (Y/T)");
                                tambah = sc.next().charAt(0);
                            } while (tambah == 'T' || tambah == 't');

                            // Generate invoices for each store
                            for (k = 0; k < jmlToko; k++) {
                                System.out.println("\n\n\n============== PT YAMALDI SATU ==============");
                                System.out.println("    Jl. Bunga Sakura No. 128, Kota Malang    \n");
                                System.out.println("------------- INVOICE PEMBAYARAN -----------\n");
                                System.out.println("Nama Toko : " + namaToko[k] + "\n");
                                System.out.println("--------------------------------------------\n");
                                System.out.println("Nama Barang\t\tQTY\tHrg/@\tHarga");
                                System.out.println("--------------------------------------------\n");
                                // TODO: Print the ordered items and their details for the current store (namaToko[k])
                            }
                            break;
                        case 3:
                            System.out.println("ini laporan pengiriman");
                            break;
                        case 4:
                            cek = false;
                            break;
                        default:
                            System.out.println("Invalid choice. Please enter a valid option.");
                            break;
                    }
                }
            } else {
                System.out.println("Mohon maaf anda bukan admin");
            }
        } else {
            System.out.println("Error");
        }
    }

    public void hargaBarang(int i) {
        System.out.println("========== Silahkan Masukkan Data ==========");
        System.out.println("Masukkan jumlah toko\t: ");
        jmlToko = sc.nextInt();
        for (i = 0; i < jmlToko; i++) {
            System.out.println("Input nama toko\t: ");
            namaToko[i] = sc.nextLine();
            sc.next();
            System.out.println("Masukkan jumlah barang yang akan dikirim : ");
            tanyaBarang = sc.nextInt();
            for (int j = 0; j < tanyaBarang; j++) {
                sc.nextLine();
                System.out.println("Masukkan kode barang\t : ");
                String kodeBarang = sc.nextLine();
                if (kodeBarang.equalsIgnoreCase(krd[0].kodeKrd)) {
                    System.out.println("Masukkan jumlah barang\t : ");
                    jumlah[i][0] = sc.nextInt();
                    total[i][0] = jumlah[i][0] * krd[0].hargaKrd;
                } else if (kodeBarang.equalsIgnoreCase(krd[1].kodeKrd)) {
                    System.out.println("Masukkan jumlah barang\t : ");
                    jumlah[i][1] = sc.nextInt();
                    total[i][1] = jumlah[i][1] * krd[1].hargaKrd;
                } else if (kodeBarang.equalsIgnoreCase(krd[2].kodeKrd)) {
                    System.out.println("Masukkan jumlah barang\t : ");
                    jumlah[i][2] = sc.nextInt();
                    total[i][2] = jumlah[i][2] * krd[2].hargaKrd;
                } else if (kodeBarang.equalsIgnoreCase(krd[3].kodeKrd)) {
                    System.out.println("Masukkan jumlah barang\t : ");
                    jumlah[i][3] = sc.nextInt();
                    total[i][3] = jumlah[i][3] * krd[3].hargaKrd;
                } else if (kodeBarang.equalsIgnoreCase(krd[4].kodeKrd)) {
                    System.out.println("Masukkan jumlah barang\t : ");
                    jumlah[i][4] = sc.nextInt();
                    total[i][4] = jumlah[i][4] * krd[4].hargaKrd;
                } else {
                    System.out.println("Kode tidak ditemukan");
                }
            }
        }
    }
}

class Kerudung {
    // Declaration of variables
    String namaKrd;
    int hargaKrd;
    int stok;
    String kodeKrd;

    // Constructor for Kerudung class
    public Kerudung(String namaKrd, int hargaKrd, int stok, String kodeKrd) {
        this.namaKrd = namaKrd;
        this.hargaKrd = hargaKrd;
        this.stok = stok;
        this.kodeKrd = kodeKrd;
    }
}

    // Getters and setters for