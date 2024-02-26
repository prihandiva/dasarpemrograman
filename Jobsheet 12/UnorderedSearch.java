import java.util.Scanner;
public class UnorderedSearch {
    static int search (int[]arr, int num){

        for (int i = 0; i<arr.length; i++){
            if (arr[i] == num)
            return i;
        }return -1;
    }
public static void main (String []args){
    Scanner fit = new Scanner(System.in);
    int[] arrInt = {10,5,20,2,11,8,4,15};
    System.out.println("Masukkan angka yang anda cari: ");
    int cari = fit.nextInt();
    int hasil = search(arrInt,cari);
    if (hasil == -1)
        System.out.println("Elemen " + cari + " Tidak ditemukan");
    else
        System.out.println("Elemen " + cari + " ditemukan pada posisi ke-" + hasil);
    }
}


