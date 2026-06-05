package bagian3.perpustakaan;

public class LatihanMandiriMultiClass {

    public static void main(String[] args) {
        // Membuat objek pengelola 
        Perpustakaan perpus = new Perpustakaan();

        // Membuat objek Buku lalu memasukkannya ke koleksi 
        perpus.tambahBuku(new Buku("Rich Dad Poor Dad", "Robert Kyosaki", 2011));
        perpus.tambahBuku(new Buku("Atomic Habits", "James Clear", 2017));
        perpus.tambahBuku(new Buku("Habit Kecil", "James Clear", 2018));
        perpus.tambahBuku(new Buku("10 dosa besar Soeharto", "Wimanjaya K. Liotohe", 1998));
        perpus.tampilkanKoleksi();

        System.out.println();

        perpus.pinjamBuku("10 dosa besar Soeharto");
        perpus.pinjamBuku("10 dosa besar Soeharto");   // coba pinjam kedua kali 

        // Praktek mengembalikan buku setelah menambahkan method kembalikanBuku(String judul)
        System.out.println("kembalikan ah...");
        perpus.kembalikanBuku("10 dosa besar Soeharto");

        System.out.println("oke pinjam lagi...");
        perpus.pinjamBuku("10 dosa besar Soeharto");

        System.out.println();
        
        // Praktek mencari buku oleh penulis tertentu
        perpus.cariPenulis("James Clear");
        
        System.out.println();

        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
    }
}
