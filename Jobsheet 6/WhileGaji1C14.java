import java.util.Scanner;
public class WhileGaji1C14 {
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        int karyawan, jam, gaji;
        int jumlah =0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan: ");
        karyawan = scan.nextInt();

        int i=0;
        while (i<karyawan) {
            System.out.println("Pilihan jabatan - Direktur, Manager, Staf");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ":");
            jabatan = scan.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jam = scan.nextInt();
            
            if (jabatan.equalsIgnoreCase("direktur")){
                continue;
            }else if (jabatan.equalsIgnoreCase("manager")){
                gaji = jam * 100000;
            }else {
                gaji = jam * 75000;
            } i++;
            jumlah += gaji;
        } 
        System.out.print("Pengeluaran perusahaan = " + jumlah);
    } 
}