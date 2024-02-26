public class Greeting14{
    static void beriSalam(){
        System.out.println("Halo! Selamat Pagi");
    }
    static void beriUcapan(String ucapan){
        System.out.println (ucapan);
    }
    public static void main (String[]args){
        beriSalam();
        String Modifikasi = "Halo! Selamat Pagi (Modifikasi)";
        System.out.println (Modifikasi);
        String salam = "Selamat datang di pemrograman Java";
        beriUcapan (salam);
    }
}   
