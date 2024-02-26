import java.util.Scanner;

public class triall {
            static int QTY [][]=new int [3][5];
            static int total[][]=new int[3][5];
            static int totalToko[] = new int [3];
            static int QTYSG,QTYSTR,QTYSH,QTYSP,QTYSB;
            static int qty[]= new int [3];
            static String nmToko[] = new String [10];
            static int f,i;
            static int jmlToko;
            static boolean cek = true;
            static Scanner fit = new Scanner (System.in); 
            static Scanner sc = new Scanner(System.in);       
            static String kdBarang;
            static Semen sm[] = new Semen[5];
            static char jwb;

        public static void main (String[]args){
            sm [0] = new Semen ("Semen Garuda", "SG", 5000, 50000);
            sm [1] = new Semen ("Semen Tiga Roda", "STR", 3000, 45000);
            sm [2] = new Semen ("Semen Holcim", "SH",1000, 55000);
            sm [3] = new Semen ("Semen Padang","SP" ,4000, 53000);
            sm [4] = new Semen ("Semen Bima","SB" ,500, 43000);  //Kenalan sama objectnya(classnya)
            
            triall main = new triall();


            while(cek){
            System.out.println("\nSilahkan pilih daftar pilihan anda");
            System.out.println("\n1.Stock Barang  \n2.Pengiriman barang \n3.Cetak Invoice \n4.Laporan Barang Terkirim \n5.Log Out");
            System.out.println("\n Pilih (1/2/3/4/5)");
            int choice = fit.nextInt();
            switch(choice){
                case 1:
                    main.tampilSemen();
                    break;
                case 2:
                    do { 
                        System.out.println("+-------------------------------------------------+");
                        System.out.println("|              MENU PENGIRIMAN BARANG             |");
                        System.out.println("+-------------------------------------------------|");
                        System.out.print("Masukkan jumlah toko yang akan dikirim : ");    
                        jmlToko = fit.nextInt();
                            for (int a = 0; a<jmlToko;a++){
                                System.out.print ("Masukkan nama toko yang ingin dikirim : ");
                                nmToko[a] = fit.next();
                                main.kirim(a=i);
                                System.out.println("Total = " + total [i]);
                            }
                                System.out.println("Apakah anda ingin mengirim barang lagi ? (y/n)"); 
                                 jwb = fit.next().charAt(0);
                   }   while (jwb == 'y' || jwb == 'Y'); {}
                    break;
                case 3 :
                    System.out.println("+-------------------------------------------------+");
                    System.out.println("|-------------------CETAK INVOICE-----------------|");
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("\tPilih Toko Tujuan : ");
                    System.out.println("\nA.Toko Jaya  \nB.Toko Sari \nC.Toko Intan");
                    System.out.println("+-------------------------------------------------+");
                    System.out.println("\t Pilih (A/B/C)");
                    // nmtoko = fit.next();
                    // switch (nmtoko) {
                    //     case "A":
                    //        //
                    //        break; 
                    //     case "B":
                    //         //
                    //         break;
                    //     case "C":
                    //        //
                    //         break;
                    // }
                case 4 :
                    System.out.println("+-------------------------------------------------+");
                    System.out.println("+-------------------SISA STOCK--------------------+");
                    System.out.println("+-------------------------------------------------+");
                    System.out.println("Pilih Toko Tujuan : ");
                    System.out.println("\nA.Toko Jaya  \nB.Toko Sari \nC.Toko Intan");
                    System.out.println("\n Pilih (A/B/C)");
                    // nmtoko = fit.next();
                                 sm[0].StockKeluar += 20;
                                sm[0].stockSemen -= sm[0].StockKeluar; 
                                 System.out.println(sm[0].stockSemen +" " +sm[0].StockKeluar);
            //         switch (nmtoko) {
            //             case "A":
            //                 //
            //                 break;
            //             case "B":
            //                 //
            //                 break;
            //             case "C":
            //                //
            //                 break;
            //         }
            //     case 5 :
    
            //         default:
            //         break;
            //             }
                
            //     }
            } }}    
     public void tampilSemen(){
                    System.out.println("+----------------------- PT ABADI JAYA -------------------------+");
                    System.out.println("|---------------------------------------------------------------|");
                    System.out.println("|\tMERK SEMEN\t|\tSTOK AWAL\t|\tHARGA\t|");
                    System.out.println("|---------------------------------------------------------------|");
                    for (int i = 0; i < sm.length; i++) {
                        System.out.println("|" + sm[i].merkSemen + "\t\t" + sm[i].stockSemen + "\t\t\t"+ sm[i].harga + "\t|");
                    }
                    System.out.println("+---------------------------------------------------------------+");
                   
    }
   public void kirim(int i){
        for (int n=i; i<(n+1);i++){
            System.out.print("Masukkan berapa merk yg akan dikirim : ");
            int f = sc.nextInt();
            for(int j=0; j<f; j++){
            sc.nextLine();
            System.out.print("Masukkan ID Barang : ");
            String kdBarang = sc.nextLine();
            if (kdBarang.equalsIgnoreCase("SG")){
                System.out.print("Masukkan jumlah Semen Gresik : " );
                QTY[n][0] = sc.nextInt();
                total [n][0] = QTY[n][0] * sm[0].harga;
            }else if (kdBarang.equalsIgnoreCase("STR")){
                System.out.print("Masukkan jumlah Semen Tiga Roda : " );
                QTY[n][1] = sc.nextInt();
                total [n][1] = QTY[n][1] * sm[1].harga;
            }else if (kdBarang.equalsIgnoreCase("SH")){
                System.out.print("Masukkan jumlah Semen Holcim : " );
                QTY[n][2] = sc.nextInt();
                total [n][2] = QTY[n][2] * sm[2].harga;
            }else if (kdBarang.equalsIgnoreCase("SP")){
                System.out.print("Masukkan jumlah Semen Padang : " );
                QTY[n][3] = sc.nextInt();
                total [n][3] = QTY[n][3] * sm[3].harga;
            }else if (kdBarang.equalsIgnoreCase("SB")){
                System.out.print("Masukkan jumlah Semen Bima : " );
                QTY[n][4] = sc.nextInt();
                total [n][4] = QTY[n][4] * sm[4].harga;
            }else {
                System.out.println("Kode salah");
            }
            }
        }
    } 
}
        
        
        
        
    
    
            
        