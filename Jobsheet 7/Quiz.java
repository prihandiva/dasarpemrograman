import java.util.Scanner;
import java.util.Random;
public class Quiz {
    public static void main(String[]args){
Random random = new Random();
Scanner input = new Scanner (System.in);
char menu = 'y';
String ukuran;
do{
    int number = random.nextInt(10) + 1;
    boolean success = false;
    do {
        System.out.print("Tebak angka (1-10) : ");
        int answer = input.nextInt();
        input.nextLine();
        success = (answer == number);
            
        if (answer>number){
            System.out.println ("Ups Jawaban anda lebih besar");
        }else if (answer<number){
            System.out.println ("Ups Jawaban anda lebih kecil");
        }else if (answer == number){
            System.out.println ("Selamat, Jawaban anda benar!!");
        }
    } 
    while (!success);
    System.out.print("Apakah Anda ingin mengulang permainan (y/Y) ? ");
    menu = input.nextLine().charAt(0);
}while (menu == 'y' ||  menu == 'Y');
    }
}
