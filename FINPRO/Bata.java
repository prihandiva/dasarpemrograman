public class Bata {
    
        public String merkBata;
        public int stockBata;
        public int harga;

       
     
        public Bata (String idB, int stockB, int hargaB){
         merkBata = idB;
         stockBata = stockB;
         harga = hargaB;
        }
        void tampilBata(){
             System.out.println("MERK SEMEN " + merkBata);
             System.out.println("STOCK AWAL : " + stockBata);
             System.out.println("HARGA PER SAK  : " + harga);
     
        }
}
     

