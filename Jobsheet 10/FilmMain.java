public class FilmMain {
   public static void main(String[]args){
    Film film1 = new Film();

    film1.judul = "Quantumania Mancing";
    film1.genre = "Action Comedy";
    film1.rate = "Remaja";
    film1.jumlahTiket = 0; //mencoba di setting stock 0
    film1.hargaTiket = 40000;

    film1.tambahTiket(1);
    film1.kurangTiket(3);
    film1.tampilFilm();
    film1.kurangTiket(3);
    int income = film1.totalRevenue(4);

    System.out.println("Total jual 4 tiket = " + income);

    System.out.println("===========\n");
    Film film2 = new Film("Maniaquantum", "Horor", "Dewasa", 2000, 40000);
    
    film2.tambahTiket(1);
    film2.kurangTiket(3);
    film2.tampilFilm();

    int income2 = film1.totalRevenue(4);

    System.out.println("Total jual 4 tiket = " + income2);

    Film film3 = new Film("Weak Hero!!", "Action", "Remaja", 1000, 35000);
    } 
}




