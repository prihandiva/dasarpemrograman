public class Semen {
    public String merkSemen;
    public int stockSemen;
    public int harga;    
    public String kdBarang;
    public int StockKeluar;
    public int StockMasuk;
    
   
    //konstruktor
    public Semen (String idS, String kd,int stockS, int hargaS){
    this.merkSemen = idS;
    this.stockSemen = stockS;
    this.harga = hargaS;
    this.kdBarang = kd;
    this.StockKeluar = 0;
    this.StockMasuk = 0;
    }   
    
    ///method 
    public void tampilStok(){
        System.out.println("|" + merkSemen + "\t\t" + "|\t\t"  + stockSemen + "\t|\tRp." + harga + "\t|");
        System.out.println("+-----------------------------------------------------------------------+");
    }
    
    public void kurangSemen(int n){
        StockKeluar = n;
        int temp = 0;
        temp += StockKeluar;
        stockSemen -= temp;
        return;
    }

    public void tambahSemen(int m){
       StockMasuk = m;
       int temp = 0;
       temp += StockMasuk;
       stockSemen += temp;
       return;
    }

    public int totalBarang(int qty){
        return qty*harga;
    }
}   


