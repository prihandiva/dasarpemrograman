import java.util.Scanner;
public class Tugas5{
    public static void main(String[]args){
        double Luas, Volume, sisi, jari2, tinggi, alas;
        double phi=3.14;
        String menu,pilih,a,b;
        Scanner scan = new Scanner (System.in);
        Scanner scanString = new Scanner (System.in);

        System.out.print ("Masukkan kode menu 1(LUAS) atau 2(VOLUME): ");
        menu = scan.nextLine();

        if (menu.equalsIgnoreCase("1")){
            System.out.println ("Pilih kode (a) Persegi atau (b) Segitiga ?");
            pilih = scanString.nextLine();
            if (pilih.equalsIgnoreCase("a")){
                System.out.print("Masukkan sisi :");
                sisi = scan.nextDouble();
                Luas = sisi*sisi;
                System.out.println("Luas persegi adalah :" + Luas);
            } else if (pilih.equalsIgnoreCase("b")){
                System.out.print("Masukkan alas: ");
                alas = scan.nextDouble();
                System.out.print ("Masukkan tinggi: ");
                tinggi = scan.nextDouble();
                Luas = alas*tinggi/2;
                System.out.println("Luas segitiga adalah:" + Luas);
            } else {
                System.out.println("Kode yang anda masukkan salah");
            }
        }else if (menu.equalsIgnoreCase("2")){
            System.out.println ("Pilih kode (a) Kubus atau (b) Tabung ? ");
            pilih = scanString.nextLine();
            if (pilih.equalsIgnoreCase("a")){
                System.out.print("Masukkan sisi :");
                sisi = scan.nextDouble();
                Volume = sisi*sisi*sisi;
                System.out.println ("Volume Kubus adalah :" + Volume);
            }else if (pilih.equalsIgnoreCase("b")){
                System.out.print("Masukkan jari jari :");
                jari2 = scan.nextDouble();
                System.out.print("Masukkan tinggi :");
                tinggi = scan.nextDouble();
                Volume = phi*jari2*jari2*tinggi;
                System.out.println("Volume Tabung adalah :" + Volume);
            }else {
                System.out.println ("Kode yang anda masukkan salah");
            }
        } else {
            System.out.println("Kode menu yang anda masukkan tidak tersedia.Hanya ada 1 dan 2 untuk kode menu");
        }

    }
}