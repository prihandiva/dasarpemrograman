import java.util.Scanner;

public class gpt {
    static int QTY[][] = new int[10][5];
    static int total[][] = new int[10][5];
    static int totalToko[] = new int[10];
    static int f[] = new int [10];
    static int jmlToko,i,n,j;
    static int totalLaporan = 0;
    static String nmToko[] = new String [10];
    static boolean cek = true;
    static Scanner fit = new Scanner(System.in);
    static Semen sm[] = new Semen[5];
    static char jwb;

    public static void main(String[] args) { //FUNGSI MAIN
        sm[0] = new Semen("Garuda (SG)", "SG", 5000, 50000);
        sm[1] = new Semen("Tiga Roda(STR)", "STR", 3000, 45000);
        sm[2] = new Semen("Holcim(SH)", "SH", 1000, 55000);
        sm[3] = new Semen("Padang(SP)", "SP", 4000, 53000);
        sm[4] = new Semen("Bima(SB)", "SB", 2000, 43000);
        gpt main = new gpt();
        String usn,pw;

        System.out.println("+-------------------------------------------------------------------------------+");
        System.out.println("|                                 DISTRIBUTOR SEMEN                             |");
        System.out.println("|                               PT LESTARI JAYA ABADI                           |");
        System.out.println("|                                                                               |");
        System.out.println("|  Alamat : JL.Bandulan Gang 8                            No HP: 0895355779622  |");
        System.out.println("+-------------------------------------------------------------------------------+");
        System.out.println("|                                     LOG IN                                    |");
        System.out.println("+-------------------------------------------------------------------------------+");
        System.out.println("|                                                                               |");
        System.out.print ("\tUSERNAME : ");       
        usn = fit.nextLine();
        System.out.print ("\tPASSWORD : ");  
        pw = fit.nextLine();
        System.out.println("|                                                                               |");
        System.out.println("+-------------------------------------------------------------------------------+");
        
        
        if (usn.equalsIgnoreCase("sib") && pw.equalsIgnoreCase("1c")){
        while (cek) {
            System.out.println("\nSilahkan pilih daftar pilihan anda");
            System.out.println("\n1. Stock Semen  \n2. Pengiriman barang \n3. Cetak Invoice \n4. Laporan Barang Terkirim \n5. Log Out");
            System.out.print("\nPilih (1/2/3/4/5) : ");
            int choice = fit.nextInt();
            switch (choice) {
                case 1:
                    for (i=0;i<sm.length;i++){
                    sm[i].stockSemen -= sm[i].StockKeluar;
                    }
                    tampilSemen();
                    break;
                case 2:
                    do {
                    System.out.println("+------------------------------------------------------------------------------+");
                    System.out.println("|                               MENU PENGIRIMAN                                |");
                    System.out.println("+------------------------------------------------------------------------------+");
                        kirim();
                        System.out.print("Apakah anda ingin mengulang untuk mengirim barang lagi? (y/n) : ");
                        jwb = fit.next().charAt(0);
                    } while (jwb == 'y' || jwb == 'Y');
                    break;
                case 3:
                    System.out.println("+-------------------------------------------------------------------------------+");
                    System.out.println("|                               CETAK INVOICE                                   |");
                    System.out.println("+-------------------------------------------------------------------------------+");
                        for (int i = 0; i < jmlToko; i++) {
                            System.out.println( "Toko ke " + (i+1) + " = " +  nmToko[i]);
                        }
                    System.out.print(" Pilih nomor toko yang akan di cetak : ");
                            int cetaktoko = fit.nextInt();
                            if (cetaktoko == 1){
                                main.Invoice(i=0);
                                System.out.println(" " );
                            }else if (cetaktoko == 2){
                                main.Invoice(i=1);
                                System.out.println(" ");
                            }else if (cetaktoko == 3){
                                main.Invoice(i=2);
                                System.out.println(" ");
                            }else if (cetaktoko == 4){
                                main.Invoice(i=3);
                                System.out.println(" ");
                            }else if (cetaktoko == 5){
                                main.Invoice(i=4);
                                System.out.println(" ");
                            }else if (cetaktoko == 6){
                                main.Invoice(i=5);
                                System.out.println(" ");
                            }else if (cetaktoko == 7){
                                main.Invoice(i=6);
                                System.out.println(" ");
                            }else if (cetaktoko == 8){
                                main.Invoice(i=7);
                                System.out.println(" ");
                            }else if (cetaktoko == 9){
                                main.Invoice(i=8);
                                System.out.println(" ");
                            }else if (cetaktoko == 10){
                                main.Invoice(i=9);
                                System.out.println(" ");
                            }else{
                                System.out.println("Toko tidak ada");
                            }

                    break;
                case 4:
                    System.out.println("+-------------------------------------------------------------------------------+");
                    System.out.println("|                            LAPORAN PENGIRIMAN                                 |");
                    System.out.println("+-------------------------------------------------------------------------------+");
                     main.laporan();
                    break;
                case 5:
                default:
                    System.out.println("Anda yakin akan keluar ? (y/t)");
                    jwb = fit.next().charAt(0);
                    if (jwb == 'Y' || jwb == 'y'){
                        cek = false;
                    }
                    else if (jwb == 'T' || jwb == 't'){
                        break;
                    }else {
                        System.out.println("Mohon masukkan input yang benar");
                    }
                    break;
            }
        }
    }else {
            System.out.println("Username atau Password anda salah");
    }
    }

    public static void tampilSemen() {
        System.out.println("+---------------------------------------------------------------+");
        System.out.println("|                      DISTRIBUTOR SEMEN                        |");
        System.out.println("|                    PT LESTARI JAYA ABADI                      |");
        System.out.println("|                                                               |");
        System.out.println("|Alamat : JL.Bandulan Gang 8              No HP: 0895355779622  |");
        System.out.println("+---------------------------------------------------------------+");
        System.out.println("|\tMERK SEMEN\t|\tSTOK TERSEDIA\t|\tHARGA\t|");
        System.out.println("|---------------------------------------------------------------|");
        for (int i = 0; i < sm.length; i++) {
            System.out.println("|" + sm[i].merkSemen + "\t\t" + "|\t\t"  +sm[i].stockSemen + "\t|\t" + sm[i].harga + "\t|");
        }
        System.out.println("+---------------------------------------------------------------+");
    }

    public static void kirim() {
        System.out.print("Masukkan jumlah toko yang akan dikirim (1-10): ");
        jmlToko = fit.nextInt();
        for (int a = 0; a < jmlToko; a++) {
            System.out.print("Masukkan nama toko yang ingin dikirim : ");
            fit.nextLine();
            nmToko[a] = fit.nextLine();
            System.out.println("|----------------   "+ "Pengiriman ke " + nmToko [a] + "   -----------|");
            System.out.print("Masukkan berapa merk yang akan dikirim (1-5): ");
            f[a]= fit.nextInt();
            for (int n = 0; n < f[a]; n++) {
                //variabel sementara temp
                int temp;
                fit.nextLine();
                System.out.print("Masukkan ID Barang: ");
                String kdBarang = fit.nextLine();
                if (kdBarang.equalsIgnoreCase("SG")) {
                    System.out.print("Masukkan jumlah Semen Gresik: ");
                    temp =  0;
                    temp += fit.nextInt();
                    QTY[a][0]+= temp;
                    sm[0].StockKeluar += temp;
                    total[a][0] = QTY[a][0] * sm[0].harga;
                } else if (kdBarang.equalsIgnoreCase("STR")) {
                    System.out.print("Masukkan jumlah Semen Tiga Roda: ");
                    temp =  0;
                    temp += fit.nextInt();
                    QTY[a][1] += temp;
                    sm[1].StockKeluar += temp;
                    total[a][1] = QTY[a][1] * sm[1].harga;
                } else if (kdBarang.equalsIgnoreCase("SH")) {
                    System.out.print("Masukkan jumlah Semen Holcim: ");
                    temp =  0;
                    temp += fit.nextInt();
                    QTY[a][2] += temp;
                    sm[2].StockKeluar += temp;
                    total[a][2] = QTY[a][2] * sm[2].harga;
                } else if (kdBarang.equalsIgnoreCase("SP")) {
                    System.out.print("Masukkan jumlah Semen Padang: ");
                    temp =  0;
                    temp += fit.nextInt();
                    QTY[a][3]  += temp;
                    sm[3].StockKeluar += temp;
                    total[a][3] = QTY[a][3] * sm[3].harga;
                } else if (kdBarang.equalsIgnoreCase("SB")) {
                    System.out.print("Masukkan jumlah Semen Bima: ");
                    temp =  0;
                    temp += fit.nextInt();
                    sm[4].StockKeluar += temp;
                    QTY[a][4] += temp;
                    total[a][4] += QTY[a][4] * sm[4].harga;
                } else {
                    System.out.println("Kode salah");
                }
            }
            for (int z = 0; z < 5; z++) {
                totalToko[a] += total[a][z];
                totalLaporan += totalToko[n];
            }
            System.out.println("Total = " + totalToko[a]);
        }
    }

    public void Invoice(int i){
        System.out.println("+-------------------------------------------------------------------------------+");
        System.out.println("|                                 DISTRIBUTOR SEMEN                             |");
        System.out.println("|                               PT LESTARI JAYA ABADI                           |");
        System.out.println("|                                                                               |");
        System.out.println("|  Alamat : JL.Bandulan Gang 8                            No HP: 0895355779622  |");
        System.out.println("+-------------------------------------------------------------------------------+");
        System.out.println("|                                 FAKTUR PEMBELIAN                              |");
        System.out.println("|                                                                               |");
        System.out.println("|Nama Toko :  " + nmToko[i] + "\t\t\t\t\t\t\t|");
        System.out.println("|                                                                               |");
        System.out.println("+-------------------------------------------------------------------------------+");
        System.out.println("|\tMERK SEMEN\t|\tQTY\t|\tHARGA\t\t|\tTOTAL\t|");
        System.out.println("+-------------------------------------------------------------------------------+");
        for (n=i; n < (i+1); n++) {
            for ( j=0 ; j < 5; j++){
                System.out.println("|" + sm[j].merkSemen + "\t\t" + "|\t"  + QTY[n][j] + "\t|\t" + sm[j].harga + "\t\t|"+ "\t" + total [n][j] + "\t|");
            }
        System.out.println("+-------------------------------------------------------------------------------+");
        System.out.println("|                               TOTAL                           |\t" + totalToko[n] + " |");
        System.out.println("+-------------------------------------------------------------------------------+");
        }
    }
        public static void laporan() {
        System.out.println("+-------------------------------------------------------------------------------+");
        System.out.println("|                                 DISTRIBUTOR SEMEN                             |");
        System.out.println("|                               PT LESTARI JAYA ABADI                           |");
        System.out.println("|                                                                               |");
        System.out.println("|  Alamat : JL.Bandulan Gang 8                            No HP: 0895355779622  |");
        System.out.println("+-------------------------------------------------------------------------------+");
        System.out.println("|                                                                               |");
        System.out.println("|                             LAPORAN BARANG TERKIRIM                           |");
        System.out.println("|                                                                               |");
        System.out.println("+-------------------------------------------------------------------------------+");
        System.out.println("|\tMERK SEMEN\t|\tQTY\t|\tHARGA\t\t|\tTOTAL\t|");
        System.out.println("+-------------------------------------------------------------------------------+");
        for (n=0; n < jmlToko; n++) {
            System.out.println("+-------------------------------------------------------------------------------+");
            System.out.println("|Nama Toko :  " + nmToko[n] + "      \t\t\t\t\t\t\t|");
            System.out.println("+-------------------------------------------------------------------------------+");
            for ( j=0 ; j < 5; j++){
                System.out.println("|" + sm[j].merkSemen + "\t\t" + "|\t"  + QTY[n][j] + "\t|\t" + sm[j].harga + "\t\t|"+ "\t" + total [n][j] + "\t|");
            }
        }
        System.out.println("+-------------------------------------------------------------------------------+");
        System.out.println("|                               TOTAL                           |       " + totalLaporan + " |");
        System.out.println("+-------------------------------------------------------------------------------+");
    }

}
