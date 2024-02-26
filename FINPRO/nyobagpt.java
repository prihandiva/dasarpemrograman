import java.util.HashMap;
import java.util.Map;

public class nyobagpt {
    public static void main(String[] args) {
        // Inisialisasi stok material
        Map<String, Integer> stokMaterial = new HashMap<>();
        stokMaterial.put("Semen", 100);
        stokMaterial.put("Bata Ringan", 200);
        stokMaterial.put("Tandon", 5);

        // Daftar penerima
        Penerima[] penerima = {
                new Penerima("Alice"),
                new Penerima("Bob"),
                new Penerima("Charlie"),
                new Penerima("Dave")
        };

        // Pendistribusian material kepada setiap penerima
        for (Penerima p : penerima) {
            System.out.println("Pemberian material kepada " + p.getNama() + ":");
            p.distribusiMaterial(10, "Semen", stokMaterial);
            p.distribusiMaterial(20, "Bata Ringan", stokMaterial);
            p.distribusiMaterial(1, "Tandon", stokMaterial);
            System.out.println();
        }

        // Menampilkan sisa stok material setelah pendistribusian
        System.out.println("Sisa stok material:");
        for (Map.Entry<String, Integer> entry : stokMaterial.entrySet()) {
            String material = entry.getKey();
            int jumlah = entry.getValue();
            System.out.println(material + ": " + jumlah);
        }
    }
}

class Penerima {
    private String nama;

    public Penerima(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void distribusiMaterial(int jumlah, String material, Map<String, Integer> stokMaterial) {
        if (stokMaterial.containsKey(material)) {
            int stok = stokMaterial.get(material);
            if (stok >= jumlah) {
                stokMaterial.put(material, stok - jumlah);
                System.out.println(jumlah + " " + material + " telah diberikan kepada " + nama);
            } else {
                System.out.println("Stok " + material + " tidak mencukupi.");
            }
        } else {
            System.out.println(material + " tidak tersedia.");
        }
    }
}
