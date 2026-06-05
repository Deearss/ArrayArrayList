package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList {

    public static void main(String[] args) {
        // Latihan daftar belanjaan
        ArrayList<String> belanjaan = new ArrayList<>();
        belanjaan.add("MBG");
        belanjaan.add("Marjan");
        belanjaan.add("Buku");
        belanjaan.add("Garam");

        belanjaan.remove(1);
        for (int i = 0; i < belanjaan.size(); i++) {
            System.out.println("barang " + (i + 1) + " " + belanjaan.get(i));
        }

        // Latihan list angka
        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(1);
        angka.add(3);
        angka.add(2);
        angka.add(5);
        angka.add(4);

        int angka_terbesar = 0;
        for (Integer i : angka) {
            if (i > angka_terbesar) {
                angka_terbesar = i;
            }
        }
        System.out.println("angka terbesar adalah : " + angka_terbesar);
        
        
    }
}
