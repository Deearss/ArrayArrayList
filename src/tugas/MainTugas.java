// Haidir Aditya - 2410010069
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        KelasKuliah kelaskuliah = new KelasKuliah();
        
        kelaskuliah.tambahMahasiswa(new Mahasiswa("Haidir", "2410010069", 101));
        kelaskuliah.tambahMahasiswa(new Mahasiswa("Reno", "2410010068", 50));
        kelaskuliah.tambahMahasiswa(new Mahasiswa("Azkiya", "2410010067", 10)); 
        kelaskuliah.tambahMahasiswa(new Mahasiswa("Azkaa", "2410010066", 80));
        kelaskuliah.tambahMahasiswa(new Mahasiswa("Syahru", "2410010065", 200));
        
        
        // menampilkan rata-rata nilai dan jumlah mahasiswa yang lulus serta daftar matkul
        kelaskuliah.tampilkanSemua();
        
        // Menambahkan satu objek Mahasiswa baru ke dalam koleksi, 
        kelaskuliah.tambahMahasiswa(new Mahasiswa("Reza", "2410010064", 110));
        
        // lalu menampilkan kembali jumlah data terbaru.
        System.out.println();
        System.out.println();
        System.out.println("Menampilkan kembali jumlah data baru...");
        kelaskuliah.tampilkanSemua();
    }
}
