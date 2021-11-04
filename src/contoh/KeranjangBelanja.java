package contoh;

public class KeranjangBelanja {

    public static void main(String[] args) {
        Kalkulator kal = new Kalkulator();
        int hasilTambah = kal.tambah(43, 79);
        System.out.println("Hasil Tambah : " + hasilTambah);

        double hasilBagi = kal.bagi(15, 0);
        System.out.println("Hasil Bagi : " + hasilBagi);

    }
}
