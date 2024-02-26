import java.util.Scanner;
public class UTS_14_Fitria {
    public static void main(String[]args){
        double diskon14;
        char ukuran14;
        int biaya14 = 50000;
        String nama14;
        int jumlah14; 
        double total14 = 0;
        double hasil14;
        Scanner scan = new Scanner (System.in);
        Scanner scanString = new Scanner (System.in);

        System.out.println ("Masukkan jumlah pakaian yang akan di jahit : ");
        jumlah14 = scan.nextInt();
        

        int i = 0;
        while (i<jumlah14) {
            System.out.print ("Masukkan ukuran baju " +  (i+1)  + " yang di jahit M/L: ");
            ukuran14 = scan.next().charAt(0);
            
            if (ukuran14 == 'M' || ukuran14 == 'm'){
                System.out.println("Harga " + biaya14);
                 
            }else if (ukuran14 == 'L' || ukuran14 == 'l'){
                biaya14 += 5000;
                System.out.println("Harga " + biaya14);
                
            }else{
                System.out.println ("Ukuran yang anda masukkan salah");
                continue;
            }
            i++;
          total14 += biaya14; 
        }  System.out.println ("Harga sebelum diskon adalah :" +"Rp" + total14);
         System.out.println ("Silahkan Masukkan nama anda: ");
            nama14 = scanString.nextLine(); 

            if (nama14.equalsIgnoreCase("Ahmad")){
            hasil14 = total14 - (total14*0.002);
            System.out.println ("Maka total harga yang harus anda bayar adalah : "+ "Rp" + hasil14);
        
            }else if(nama14.equalsIgnoreCase("Ramadhan")){
            hasil14= total14 - (total14*0.004);
            System.out.println ("Maka total harga yang harus anda bayar adalah : " +"Rp" + hasil14);
    
            }else {
            System.out.println("Anda tidak mendapat diskon. Total belanjaan anda adalah : " + "Rp" + total14);
            } 
           
    
    }

       
}