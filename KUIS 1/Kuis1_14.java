public class Kuis1_14 {
    public static void main(String[] args){
        float waktujam14, waktumnt14;
        float jarak14 = 100;
        float kecepatan14 = 40;
        System.out.println("Jarak = " + jarak14 + "km");
        System.out.println("Kecepatan = " + kecepatan14 + "km/jam");
        waktujam14 = jarak14 / kecepatan14;
        System.out.println("Waktu tempuh dalam jam = " + waktujam14 + "jam");
        waktumnt14 = waktujam14 * 60;
        System.out.println("Waktu tempuh dalam menit = "+ waktumnt14 + "menit");
    }
}