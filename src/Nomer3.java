import java.util.ArrayList;
import java.util.Random;

class Pensil {
    String warna;
    int jumlah;

    public Pensil(String warna) {
        this.warna = warna;
        this.jumlah = new Random().nextInt(20000) + 1;
    }
}

    public class Nomer3 {

    public static void main(String[] args) {
        ArrayList<Pensil> biru = new ArrayList<Pensil>();
        ArrayList<Pensil> merah = new ArrayList<Pensil>();
        ArrayList<Pensil> hijau = new ArrayList<Pensil>();
        ArrayList<Pensil> oranye = new ArrayList<Pensil>();
        ArrayList<Pensil> hitam = new ArrayList<Pensil>();
        ArrayList<Pensil> ungu = new ArrayList<Pensil>();

        for (int i = 0; i < 20000; i++) { // produce 20000 pensils
            if (i % 3333 == 0) {
                biru.add(new Pensil("Biru"));
            } else if (i % 3333 == 1) {
                merah.add(new Pensil("Merah"));
            } else if (i % 3333 == 2) {
                hijau.add(new Pensil("Hijau"));
            } else if (i % 3333 == 3) {
                oranye.add(new Pensil("Oranye"));
            } else if (i % 3333 == 4) {
                hitam.add(new Pensil("Hitam"));
            } else if (i % 3333 == 5) {
                ungu.add(new Pensil("Ungu"));
            }
        }

        System.out.println("Total jumlah pensil dari setiap warna:");
        System.out.println("Biru: " + biru.size());
        System.out.println("Merah: " + merah.size());
        System.out.println("Hijau: " + hijau.size());
        System.out.println("Oranye: " + oranye.size());
        System.out.println("Hitam: " + hitam.size());
        System.out.println("Ungu: " + ungu.size());

        System.out.println("\nJumlah produksi maksimum dan minimum dari setiap produksi pensil warna:");
        System.out.println("Biru: max " + maxProduksi(biru) + " min " + minProduksi(biru));
        System.out.println("Merah: max " + maxProduksi(merah) + " min " + minProduksi(merah));
        System.out.println("Hijau: max " + maxProduksi(hijau) + " min " + minProduksi(hijau));
        System.out.println("Oranye: max " + maxProduksi(oranye) + " min " + minProduksi(oranye));
        System.out.println("Hitam: max " + maxProduksi(hitam) + " min " + minProduksi(hitam));
        System.out.println("Ungu: max " + maxProduksi(ungu) + " min " + minProduksi(ungu));
    }

    public static int maxProduksi(ArrayList<Pensil> arr) {
        int max = arr.get(0).jumlah;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).jumlah > max) {
                max = arr.get(i).jumlah;
            }
        }
        return max;
    }

    public static int minProduksi(ArrayList<Pensil> arr) {
        int min = arr.get(0).jumlah;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).jumlah < min) {
                min = arr.get(i).jumlah;
            }
        }
        return min;
    }
}