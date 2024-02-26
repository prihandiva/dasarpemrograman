import java.util.Scanner;

public class MahasiswaMain {
    public static void main (String[]args){
        Mahasiswa [] mhs = new Mahasiswa[10];
        mhs [0] = new Mahasiswa ("19970506001", "Alfatih", 3.9);
        mhs [1] = new Mahasiswa ("19910421002", "Gitta", 3.8);
        mhs [2] = new Mahasiswa ("19950322002", "Amanda", 3.75);
        mhs [3] = new Mahasiswa ("19980129001", "Kevin", 3.5);
        mhs [4] = new Mahasiswa ("19990208002", "Windy", 3.92);
        mhs [5] = new Mahasiswa ("19970710001", "Belva", 3.6);
        mhs [6] = new Mahasiswa ("19920602001", "James", 3.7);
        mhs [7] = new Mahasiswa ("19901106002", "Aruna", 3.3);
        mhs [8] = new Mahasiswa ("19981005002", "Sabrina", 3.55);
        mhs [9] = new Mahasiswa ("19991201001", "Agus", 3.65);

        Scanner fit = new Scanner (System.in);
        System.out.println("Masukkan nama mahasiswa yang dicari: ");
        String cari = fit.nextLine();
        boolean no = false;
        for (int i=0; i<mhs.length; i++){
            if (cari.equalsIgnoreCase(mhs[i].namaMahasiswa)){
                System.out.println("Nama " + mhs[i].namaMahasiswa);
                System.out.println("NIM " + mhs[i].nim);
                System.out.println("IPK " + mhs[i].ipk);
                no=true;
            }
        }  
        if(!no) {
            System.out.println("Data tidak ditemukan");
        } 
        
        System.out.println("Masukkan nilai IPK yang anda cari: ");
        double cari2 = fit.nextDouble();
        fit.nextLine();
        for (int j=0; j<mhs.length; j++){
            if (cari2 == mhs[j].ipk){
                System.out.println("Nama " + mhs[j].namaMahasiswa);
                System.out.println("NIM " + mhs[j].nim);
                System.out.println("IPK " + mhs[j].ipk);
            }
        }
    }
}



