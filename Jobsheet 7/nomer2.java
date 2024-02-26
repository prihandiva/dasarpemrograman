import java.util.Scanner;
public class nomer2{
    public static void main(String[] args){
        boolean segitigabintang14 = true;
        Scanner sc = new Scanner(System.in);
        while (segitigabintang14){
            System.out.print("Masukkan angka :");
            int bintang = sc.nextInt();

            if (bintang >= 5) {
                for (int i = bintang; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    }
            } else {
                System.out.println("Nomor yang anda masukkan kurang dari 5 ");
                continue;
            }
            segitigabintang14 = false;
        }
    }
}