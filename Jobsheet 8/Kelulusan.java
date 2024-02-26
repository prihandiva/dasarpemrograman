import java.util.Scanner;

public class Kelulusan{
    public static void main(String[] args){
        int[] nilaiAkhir = new int [10];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        for (i=0; i<10; i++){
            System.out.println("Masukkan nilai Mahasiswa ke--" + i + "; ");
            nilaiAkhir[i] = sc.nextInt();
            if (nilaiAkhir[i]>70){
                System.out.println("Mahasiswa ke--" + i + " Lulus!");
            }
            if  (nilaiAkhir[i]<=70){
                System.out.println("Mahasiswa ke--" + i + " Tidak lulus!");
            }
        }
    }       
}
