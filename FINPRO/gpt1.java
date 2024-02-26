import java.util.Scanner;

public class gpt1 {
    static int QTY[][] = new int[10][5];
    static int total[][] = new int[10][5];
    static int totalToko[] = new int[10];
    static double tt[] = new double [10];
    static int f[] = new int [10];
    static int plus[] = new int [5];
    static String tgl[] = new String [10];
    static String nmToko[] = new String [10];
    static String jb[] = new String [10];
    static int jmlToko,i,n,j,a,temp,choice;
    static int counter =0;
    static int totalLaporan = 0;
    static boolean cek = true;
    static Scanner fit = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);
    static Semen sm[] = new Semen[5];
    static char jwb;
    static String usn,pw;

    public static void main(String[] args) { 
        //FUNGSI MAIN
        sm[0] = new Semen("Garuda (SG)", "SG", 5000, 50000);
        sm[1] = new Semen("Tiga Roda(STR)", "STR", 3000, 45000);
        sm[2] = new Semen("Holcim(SH)", "SH", 1000, 55000);
        sm[3] = new Semen("Padang(SP)", "SP", 4000, 53000);
        sm[4] = new Semen("Bima(SB)", "SB", 2000, 43000);
        gpt1 main = new gpt1();

        //LOG IN
        System.out.println("+-------------------------------------------------------------------------------+");
        System.out.println("|                                 DISTRIBUTOR SEMEN                             |");
        System.out.println("|                               PT LESTARI JAYA ABADI                           |");
        System.out.println("|                                                                               |");
        System.out.println("|  Alamat : JL.Bandulan Gang 8                            No HP: 0895355779622  |");
        System.out.println("+-------------------------------------------------------------------------------+");
        System.out.println("|                                     LOG IN                                    |");
        System.out.println("+-------------------------------------------------------------------------------+");
        System.out.println("| Masukkan Username dan Password :                                              |");
        System.out.print ("  USERNAME : ");       
        usn = fit.nextLine();
        System.out.print ("  PASSWORD : ");  
        pw = fit.nextLine();
        System.out.println("|                                                                               |");
        System.out.println("+-------------------------------------------------------------------------------+");
                //USN PASS BENAR
                if (usn.equalsIgnoreCase("sib") && pw.equalsIgnoreCase("1c")){
                    while (cek) {
                        System.out.println("\nSilahkan pilih daftar pilihan anda");
                        System.out.println("\n1. Stock Semen  \n2. Pengiriman barang \n3. Cetak Invoice \n4. Laporan Barang Terkirim \n5. Restock Semen \n6. Log Out");
                        System.out.print("\nPilih (1/2/3/4/5) : ");
                        choice = fit.nextInt();
                        switch (choice) { //PILIHAN MENU
                            case 1:
                                main.tampilSemen();
                                break;
                            case 2:
                                do {
                                System.out.println("+------------------------------------------------------------------------------+");
                                System.out.println("|                               MENU PENGIRIMAN                                |");
                                System.out.println("+------------------------------------------------------------------------------+");
                                    for (a = 0; a < nmToko.length; a++) {
                                        do{ 
                                            System.out.print("Masukkan tanggal pengiriman (Tanggal-Bulan-Tahun) : ");
                                            tgl[a] = fit.next();  
                                            kirim(a);
                                            Pembayaran(a);
                                            System.out.println("Total yang harus dibayarkan = Rp." + totalToko[a]);
                                            a++;
                                            counter++;
                                            System.out.print("Tambah Toko? (y/n) : ");
                                            jwb = fit.next().charAt(0);
                                        }while(jwb == 'Y' || jwb == 'y');
                                        break;
                                    }
                                    System.out.print("Sudah Selesai ? (y/n) : ");
                                    jwb = fit.next().charAt(0);
                                } while (jwb == 'N' || jwb == 'n');
                                break; 
                            case 3:
                                System.out.println("+-------------------------------------------------------------------------------+");
                                System.out.println("|                               CETAK INVOICE                                   |");
                                System.out.println("+-------------------------------------------------------------------------------+");
                                for (int i = 0; i < counter; i++) {
                                        System.out.println( "Toko ke " + (i+1) + " = " +  nmToko[i]);
                                }
                                System.out.print(" Pilih nomor toko yang akan di cetak (1-10): ");
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
                                System.out.println("|                                LAPORAN PENGIRIMAN                             |");
                                System.out.println("+-------------------------------------------------------------------------------+");
                                main.Laporan(counter);
                                break;
                            case 5:
                                main.Restock();
                                System.out.println("+-----------------------------------------------------------------------+");
                                System.out.println("|                              DISTRIBUTOR SEMEN                        |");
                                System.out.println("|                            PT LESTARI JAYA ABADI                      |");
                                System.out.println("|                                                                       |");
                                System.out.println("|Alamat : JL.Bandulan Gang 8                      No HP: 0895355779622  |");
                                System.out.println("+-----------------------------------------------------------------------+");
                                System.out.println("|\tMERK SEMEN\t|\tSTOK TERSEDIA\t|\tHARGA\t\t|");
                                System.out.println("|-----------------------------------------------------------------------+");
                                for (int i = 0; i < sm.length; i++) {
                                sm[i].tampilStok();
                                }
                                break;
                            case 6 :
                            default :
                            System.out.print("Anda yakin akan keluar (y/t) ?  :  ");
                                jwb = fit.next().charAt(0);
                                if (jwb == 'Y' || jwb == 'y'){
                                    cek = false;
                                }
                                else if (jwb == 'T' || jwb == 't'){
                                    break;
                                }else {
                                    System.out.println("Mohon masukkan jawaban yang benar");
                                }
                                break;

                        }
                    }
                }else {
                    System.out.println("Username atau Password anda salah");
                }
    }


//FUNGSI FUNGSI
    public static void tampilSemen() {
        System.out.println("+-----------------------------------------------------------------------+");
        System.out.println("|                              DISTRIBUTOR SEMEN                        |");
        System.out.println("|                            PT LESTARI JAYA ABADI                      |");
        System.out.println("|                                                                       |");
        System.out.println("|Alamat : JL.Bandulan Gang 8                      No HP: 0895355779622  |");
        System.out.println("+-----------------------------------------------------------------------+");
        System.out.println("|\tMERK SEMEN\t|\tSTOK TERSEDIA\t|\tHARGA\t\t|");
        System.out.println("|-----------------------------------------------------------------------+");
        for (int i = 0; i < sm.length; i++) {
        sm[i].tampilStok();
        }
   }
    public static void kirim(int a) {
                System.out.print("\n");            
                System.out.print("Masukkan nama toko ke " + (a+1) + " yang ingin dikirim : ");
                nmToko[a] = sc.nextLine(); 
                fit.nextLine();
                System.out.println("                                                                               ");
                System.out.println("|---------------------      "+ "Pengiriman ke " + nmToko [a] + "       ------------------|");
                System.out.println("                                                                               ");
                System.out.print("Masukkan berapa merk yang akan dikirim (1-5) : ");
                f[a]= fit.nextInt();
                fit.nextLine();
                for (int n = 0; n < f[a]; n++) {
                    System.out.print("Masukkan ID Barang: ");
                    String kdBarang = fit.next();
                    fit.nextLine();
                    if (kdBarang.equalsIgnoreCase(sm[0].kdBarang)) {
                        System.out.print("Masukkan jumlah Semen Gresik: ");
                        //variabel sementara temp
                        temp =  0;
                        temp += fit.nextInt();
                        QTY[a][0]+= temp;
                        sm[0].StockKeluar += temp;
                        total[a][0] = sm[0].totalBarang(QTY[a][0]);
                    } else if (kdBarang.equalsIgnoreCase(sm[1].kdBarang)) {
                        System.out.print("Masukkan jumlah Semen Tiga Roda: ");
                        temp =  0;
                        temp += fit.nextInt();
                        QTY[a][1] += temp;
                        sm[1].StockKeluar += temp;
                        sm[1].totalBarang(QTY[a][1]);
                        total[a][1] = sm[1].totalBarang(QTY[a][1]);
                    } else if (kdBarang.equalsIgnoreCase(sm[2].kdBarang)) {
                        System.out.print("Masukkan jumlah Semen Holcim: ");
                        temp =  0;
                        temp += fit.nextInt();
                        QTY[a][2] += temp;
                        sm[2].StockKeluar += temp;
                        sm[2].totalBarang(QTY[a][2]);
                        total[a][2] = sm[2].totalBarang(QTY[a][2]);
                    } else if (kdBarang.equalsIgnoreCase(sm[3].kdBarang)) {
                        System.out.print("Masukkan jumlah Semen Padang: ");
                        temp =  0;
                        temp += fit.nextInt();
                        QTY[a][3]  += temp;
                        sm[3].StockKeluar += temp;
                        sm[3].totalBarang(QTY[a][3]);
                        total[a][3] = sm[3].totalBarang(QTY[a][3]);
                    } else if (kdBarang.equalsIgnoreCase(sm[4].kdBarang)) {
                        System.out.print("Masukkan jumlah Semen Bima: ");
                        temp =  0;
                        temp += fit.nextInt();
                        sm[4].StockKeluar += temp;
                        QTY[a][4] += temp;
                        sm[4].totalBarang(QTY[a][4]);
                        total[a][4] = sm[4].totalBarang(QTY[a][4]);
                    } else {
                        System.out.println("Kode semen salah");
                    }
                    }
                    for (i=0;i<sm.length;i++){
                    sm[i].kurangSemen (sm[i].StockKeluar);
                    }
                    totalToko[a] = total[a][0] + total[a][1] + total[a][2]+ total[a][3]+ total[a][4];
                    for (n=0 ;n <nmToko.length;n++){
                    totalLaporan += totalToko[n];
                    }
                    
    }
    public static void Pembayaran(int a){
        System.out.println("+-------------------------------------------------------------------------------+");
        System.out.println("|                                    PEMBAYARAN                                 |");
        System.out.println("+-------------------------------------------------------------------------------+");
        System.out.println("Pembayaran bisa dilakukan sejak invoice dikeluarkan");
        System.out.println("1. Tunai \n2. Tempo");
        System.out.print("Ketikkan metode pembayaran yang anda inginkan : ");
        jb[a] = fit.next();
        fit.nextLine();
            if (jb[a].equalsIgnoreCase("Tunai")){
                tt[a] = totalToko[a]*0;
                totalToko[a] += totalToko[a]*0;
            }else if (jb[a].equalsIgnoreCase("Tempo")){
                System.out.println("Anda mendapatkan biaya tambahan sebesar 10%  ");
                double biayaTemp = 0.1;
                tt[a] = totalToko[a]*biayaTemp;
                totalToko[a] += totalToko[a]*biayaTemp;
            }else{
                System.out.println("Mohon masukkan jawaban yang benar");
            }
    }             
    public void Invoice(int i){
        System.out.println("                                                                               ");
        System.out.println("                            CETAK FAKTUR UNTUK   " + nmToko[i]);
        System.out.println("                                                                               ");
        System.out.println("+-----------------------------------------------------------------------------------------+");
        System.out.println("|                                      DISTRIBUTOR SEMEN                                  |");
        System.out.println("|                                    PT LESTARI JAYA ABADI                                |");
        System.out.println("|                                                                                         |");
        System.out.println("|  Alamat : JL.Bandulan Gang 8                                      No HP: 0895355779622  |");
        System.out.println("+-----------------------------------------------------------------------------------------+");
        System.out.println("|                                      FAKTUR PEMBELIAN                                   |");
        System.out.println("|                                                                                         |");
        System.out.println("| Nama Toko        :    " + nmToko[i] + "\t\t\t\t\t\t\t  |");
        System.out.println("| Mode Pembayaran  :    " +jb[i] +"\t\t\t\t\t\t\t\t  |");
        System.out.println("| Tanggal          :    " + tgl[i] +"\t\t\t\t\t\t\t  |");
        System.out.println("+-----------------------------------------------------------------------------------------+");
        System.out.println("|\tMERK SEMEN\t|\tQTY\t|\tHARGA\t\t|\tTOTAL\t\t  |");
        System.out.println("+-----------------------------------------------------------------------------------------+");
        for (n=i; n < (i+1); n++) {
            for ( j=0 ; j < 5; j++){
                if(QTY[n][j] != 0){
                System.out.println("|" + sm[j].merkSemen + "\t\t" + "|\t"  + QTY[n][j] + "\t|\tRp." + sm[j].harga + "\t|"+ "  \tRp." + total [n][j] + "  \t|");
            }}
        System.out.println("+-----------------------------------------------------------------------------------------+");
        System.out.println("|                          PENAMBAHAN BIAYA                     |  \tRp."+ tt[i] + "          \t|");
        System.out.println("+-----------------------------------------------------------------------------------------+");
        System.out.println("|                               TOTAL                           |  \tRp." + totalToko[n] + "  \t|");
        System.out.println("+-----------------------------------------------------------------------------------------+");
        }
    }

    public static void Laporan(int p) {
        System.out.println("+---------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                                                             DISTRIBUTOR SEMEN                                                         |");
        System.out.println("|                                                           PT LESTARI JAYA ABADI                                                       |");
        System.out.println("|                                                                                                                                       |");
        System.out.println("|  Alamat : JL.Bandulan Gang 8                                                                                    No HP: 0895355779622  |");
        System.out.println("+---------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                                                                                                                                       |");
        System.out.println("|                                                          LAPORAN BARANG TERKIRIM                                                      |");
        System.out.println("|                                                                                                                                       |");
        System.out.println("+---------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|\tNAMA\t\t|\t\t\t\t\tKODE SEMEN\t\t\t\t|\t\tTOTAL\t\t|");
        System.out.println("|\tTOKO\t\t|\tSG\t|\tSTR\t|\tSH\t|\tSP\t|\tSB\t|\t\tBELANJA\t\t|");
        System.out.println("|                                                                                                                                       |");
        System.out.println("+---------------------------------------------------------------------------------------------------------------------------------------+");
        for (n=0; n < p; n++) {
            System.out.println("+---------------------------------------------------------------------------------------------------------------------------------------+");
                System.out.println("|" + nmToko[n] + "\t\t" + "|\t"  + QTY[n][0] + "\t|\t" + QTY[n][1] + "\t|"+ "\t" + QTY[n][2] + "\t|" + "\t" + QTY[n][3] + "\t|" + "\t" + QTY[n][4]+ "\t|\tRp." +totalToko [n] + "\t\t|");
        }
        System.out.println("+---------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("+---------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|\tTOTAL\t\t|\t"+ sm[0].StockKeluar + "\t|" + "\t" + sm[1].StockKeluar + "\t|" + "\t" + sm[2].StockKeluar + "\t|" + "\t" + sm[3].StockKeluar + "\t|" + "\t" + sm[4].StockKeluar + "\t|\tRp."+ totalLaporan + "\t\t|");
        System.out.println("+---------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|\tSISA STOCK\t|\t" + sm[0].stockSemen + "\t|" + "\t" + sm[1].stockSemen + "\t|" + "\t" + sm[2].stockSemen + "\t|" + "\t" + sm[3].stockSemen + "\t|" + "\t" + sm[4].stockSemen + "\t|\t" + "\t\t\t|");
        System.out.println("+---------------------------------------------------------------------------------------------------------------------------------------+");
    }   
    
    public static void Restock(){
        System.out.println("Masukkan kode semen yang akan di restock : ");
        System.out.print("Masukkan ID Barang: ");
        int temp;            
        String kdBarang = fit.next();
        fit.nextLine();
            if (kdBarang.equalsIgnoreCase(sm[0].kdBarang)) {
                System.out.print("Masukkan jumlah Semen Gresik: ");
                temp =  0;
                temp += fit.nextInt();
                plus[0]+= temp;
            } else if (kdBarang.equalsIgnoreCase(sm[1].kdBarang)) {
                System.out.print("Masukkan jumlah Semen Tiga Roda: ");
                temp =  0;
                temp += fit.nextInt();
                plus[1]+= temp;
            } else if (kdBarang.equalsIgnoreCase(sm[2].kdBarang)) {
                System.out.print("Masukkan jumlah Semen Holcim: ");
                temp =  0;
                temp += fit.nextInt();
                plus[2]+= temp;
            } else if (kdBarang.equalsIgnoreCase(sm[3].kdBarang)) {
                System.out.print("Masukkan jumlah Semen Padang: ");
                temp =  0;
                temp += fit.nextInt();
                plus[3]+= temp;
            } else if (kdBarang.equalsIgnoreCase(sm[4].kdBarang)) {
                System.out.print("Masukkan jumlah Semen Bima: ");
                temp =  0;
                temp += fit.nextInt();
                plus[4]+= temp;
            } else {
                System.out.println("Kode semen salah");
            }
        for (i=0;i<sm.length;i++){
            sm[i].tambahSemen(plus[i]);
        };
    }
}
