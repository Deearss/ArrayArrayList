package bagian1.array;

public class LatihanMandiriArray {

    public static void main(String[] args) {
        // Latihan array suhu
        double[] suhu = {80, 75, 90, 60, 85, 56};
        System.out.println("Suhu Tertinggi : " + suhu[2]);
        
        // Latihan array hari
        String[] hari = {"senin", "selasa", "rabu", "kamis", "jumat"};
        for (String kata : hari) {
            if(kata.length() > 5){
                System.out.println(kata);
            }
        }
        
        // Latihan hitung angka genap
        int[] angka = {4, 8, 15, 16, 23, 42};
        int jumlah_genap = 0;
        for (int i : angka) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah angka genap");
                jumlah_genap++;
            }
        }
        System.out.println("Angka Genap ada : " + jumlah_genap);
    }
}
