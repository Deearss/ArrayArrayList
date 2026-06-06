package tugas;

import java.util.ArrayList;

public class KelasKuliah {

    private ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();
    private String[] namaMatkul = {"ISBD", "Paralel", "PBO 1"};

    public void tambahMahasiswa(Mahasiswa mhs) {
        mahasiswa.add(mhs);
    }

    public void hitungRataRata() {
        // total semua nilai dibagi jumlah mahasiswa
        double totalnilai = 0;
        double jumlah_mahasiswa = mahasiswa.size();

        for (Mahasiswa mhs : mahasiswa) {
            totalnilai += mhs.getNilai();
        }

        double rata_rata = totalnilai / jumlah_mahasiswa;

        System.out.println("Rata-rata nilai dari semua mahasiswa adalah : " + rata_rata);
    }

    public void jumlahLulus() {
        int jumlah_lulus = 0;

        for (Mahasiswa mhs : mahasiswa) {
            if (mhs.lulus()) {
                jumlah_lulus++;
                System.out.println(jumlah_lulus + ". " + mhs.getNama() + " lulus!");
            }
        }
        System.out.println("Jumlah Mahasiswa yang lulus adalah : " + jumlah_lulus);
    }

    public void daftarMatkul() {
        System.out.println("--- daftar matkul : ");
        for (int i = 0; i < namaMatkul.length; i++) {
            int urutannya = i + 1;
            String nama = namaMatkul[i];
            System.out.println(urutannya + ". " + nama);
        }
    }

    public void tampilkanSemua() {
        daftarMatkul();
        System.out.println();
        hitungRataRata();
        System.out.println();
        jumlahLulus();
    }
}
