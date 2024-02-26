import java.util.Scanner;

public class Kuis_14_Fitria{
    public static void main(String[]args){
        Scanner fit = new Scanner(System.in);
       int hargaLuar14 = 50000;
       int hargaDalam14 = 35000;
       int delivery14 = 10000;
       int takeout14 = 5000;
       String Nama14[] ={"Italian Food","Korean Food","Chinese Food","Khas Jogja", "Khas Madura"}; 
       int Menu14 [][] = new int[5][4];
       int italia14[] = {6,8,4};
       int korea14[] = {10,16,11};
       int china14[] = {9,14,10};
       int jogja14[] = {12,5,7};
       int madura [] = {5,8,5};
       int min [] = {100,100,100,100,100};
       int max [] = {0,0,0,0,0};
        int harga14[] = {0,0,0};
        int total14[] ={0,0,0};
        int hargaD14[]={0,0,0};
        double rata14;
        int a=0,i=0;
       
        
        for (a=0; a<3;a++){
            System.out.printf("Menu %s\n", Nama14[a]);
            for(i=0; i<Menu14[0].length; i++){
                switch (i){
                    case 0:
                        System.out.print("Masukkan jumlah dine in: ");
                        Menu14[a][i] = fit.nextInt();
                        harga14 = hargaLuar14*Menu14[a][i];
                        System.out.println("Jumlah = "+ harga14);
                        harga14[a] += Menu14[a][i];
                        break;
                    case 1:
                        System.out.print("Masukkan jumlah delivery : ");
                        Menu14[a][i] = fit.nextInt();
                        harga14 = hargaLuar14*Menu14[a][i] + delivery14;
                        System.out.println("Jumlah =" + harga14);
                        harga14 [a]+= Menu14[a][i];
                        break;
                    case 2:
                        System.out.print("Masukkan jumlah takeout : ");
                        Menu14[a][i] = fit.nextInt();
                        harga14 = hargaLuar14*Menu14[a][i] + takeout14;
                        System.out.println("Jumlah =" + harga14);
                        harga14 [a]+= Menu14[a][i];
                        break;
            }System.out.println ("Total : " + harga14[a]);
        }
    for (a=3; a<5;a++){
        System.out.printf("Menu %s\n", Nama14[a]);
        for(i=0; i<Menu14[0].length; i++){
            switch (i){
                case 0:
                    System.out.print("Masukkan jumlah dine in: ");
                    Menu14[a][i] = fit.nextInt();
                    hargaD14 = hargaDalam14*Menu14[a][i];
                    System.out.println("Jumlah =" + hargaD14);
                    hargaD14 [a]+= Menu14[a][i];
                    break;
                case 1:
                    System.out.print("Masukkan jumlah delivery : ");
                    Menu14[a][i] = fit.nextInt();
                    hargaD14 = hargaDalam14*Menu14[a][i] + delivery14;
                    System.out.println("Jumlah =" + hargaD14 );
                    hargaD14[a] += Menu14[a][i];
                    break;
                case 2:
                    System.out.print("Masukkan jumlah takeout : ");
                    Menu14[a][i] = fit.nextInt();
                    hargaD14=  hargaDalam14*Menu14[a][i] + takeout14;
                    System.out.println("Jumlah =" + hargaD14);
                    hargaD14[a]+= Menu14[a][i];
                    break;
        }System.out.println ("Total : " + hargaD14[a]);
        rata14 [i] = hargaD14[i] /Menu14[0].length; 
    }
}
System.out.print("---------------------");
System.out.print("Rata rata pembelian Khas Madura %2f\n", rata14[4]);
}
}
}