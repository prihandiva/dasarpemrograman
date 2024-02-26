import java.util.Scanner;
public class PercobaanPemilihan2{
    public static void main(String[]args){
        String kategori;
        int penghasilan, gajiBersih;
        double pajak =0;
        Scanner scan = new Scanner (System.in);
        Scanner scanString = new Scanner (System.in);

        System.out.print("Masukkann kategori: ");
        kategori = scanString.nextLine();
        
            System.out.print ("Masukkan besarnya penghasilan :");
        		penghasilan = scan.nextInt();

        if (penghasilan <= 0){
            System.out.println("Penghasilan yang dimasukkan tidak valid");
            System.exit(0);
        }
        
        if (kategori.equalsIgnoreCase("pekerja")){
            if (penghasilan <= 2000000){
                pajak = 0.1;
            }else if (penghasilan <= 3000000){
                pajak = 0.15;
            }else {
                pajak = 0.2;
            }
        gajiBersih = (int) (penghasilan - (penghasilan*pajak));
        System.out.println ("Gaji bersih yang anda terima : " + gajiBersih);
        }else if (kategori.equals("pebisnis")){
            if (penghasilan <= 2500000){
                pajak = 0.15;
            }else if (penghasilan <= 3500000){
                pajak = 0.2;
            }
        gajiBersih = (int) (penghasilan - (penghasilan*pajak));
        System.out.println("Gaji bersih yang anda terima: " + gajiBersih);
        }else {
            System.out.println ("kategori yang Anda masukkan salah");
        }
    }
}