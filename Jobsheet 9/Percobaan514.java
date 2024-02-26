import java.util.Scanner;
public class Percobaan514 {
    static int hitungPangkat (int x, int y ){
        if (y==0){
            return (1);
        }
        else {
            return(x*hitungPangkat(x, y-1));
        }

    } 
    public static void main(String[]args){
        int hitungPangkat;
        Scanner fit = new Scanner(System.in);
        int bilangan,pangkat,hasil;
        System.out.print("Bilangan yang dihitung:  ");
        bilangan = fit.nextInt();
        System.out.print("Pangkat:  ");
        pangkat = fit.nextInt();
        hasil = hitungPangkat(bilangan,pangkat);
        System.out.print("Hasilnya adalah = " + hasil);
        System.out.println();       
        System.out.printf("Perkalian (%d pangkat %d) = " ,bilangan,pangkat);

        for (int i =0; i<pangkat; i++){
            System.out.print(bilangan + " x ");
        }
        System.out.println("1 = " + hasil);
    } 
}


