import java.util.Scanner;
public class PemilihanPercobaan214{
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        int nilai;
        System.out.println("Masukkan Sebuah Bilangan:");
        nilai=input.nextInt();

        if (nilai>=100){
            nilai+=10;
        }
        else{
            nilai-=10;
        }
    System.out.println("Hasil Nilai Akhir adalah" + nilai);
    
    System.out.println("Ini yang sudah saya modifikasi");
        float jumlah,nilai1,nilai2,rata;
        nilai1=input.nextFloat();
        nilai2=input.nextFloat();
        jumlah = (nilai1 + nilai2);
        rata= jumlah /2;
        
        if (rata>=100){
            rata-=5;
        }
        else{
            System.out.println(rata);
        }
    System.out.println("Hasil nilai modifikasi adalah" + rata);
    }
}