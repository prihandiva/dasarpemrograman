import java.util.Scanner;
public class nomer1 {
    public static void main(String[] args){
        boolean segitigaangka14 = true;
        Scanner sc = new Scanner(System.in);
        while (segitigaangka14){
            
            System.out.print("Masukkan nomor : ");
            int angka14 = sc.nextInt();

            if (angka14 >= 3) {
                for (int i = 0; i <= angka14; i++) {
                    for (int j = angka14; j - 1 > i; j--){
                        System.out.print("");
                    }
                    for (int j = 1; j <= i ; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                } 
            } else {
                System.out.println("Nomor yang anda masukkan kurang dari 3 ");
                continue;
            }
            segitigaangka14 = false;
        }

    }
}
   
