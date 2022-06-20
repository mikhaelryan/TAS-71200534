package com.uas.perawatan;

public class App {
    public static void main(String[] args) {
        System.out.println("===========================================PROSES INISIALISASI============================================");
        System.out.println();
        Daftar daftar = new Daftar();
        Pengunjung illegal = new Pengunjung("test",21,"di mana saja");
        //ID menyesuaikan dari anda
        Pendaftaran pendaftaran = new Pendaftaran(0, "Andi");
        //ID menyesuaikan dari anda
        Perawat perawat = new Perawat(0, "Siti");
        //ID menyesuaikan dari anda
        Pemeriksa pemeriksa = new Pemeriksa(1, "Budi", "Organ Dalam", "A123");
        Pengunjung pengunjung = pendaftaran.registrasi();
        pendaftaran.mengaturDaftar(pengunjung, pemeriksa, perawat, daftar);
        System.out.println("===========================================PROSES UJI COBA PASIEN DAN JADWAL ILLEGAL============================================");
        System.out.println();
        perawat.screening(illegal, daftar);
        pemeriksa.memeriksa(illegal, daftar);
        System.out.println("===========================================PROSES UJI COBA PASIEN DAN JADWAL ILLEGAL BERHASIL============================================");
        System.out.println();
        System.out.println("===========================================PROSES SCREENING SUSTER============================================");
        System.out.println();
        perawat.screening(pengunjung, daftar);
        System.out.println("===========================================PROSES SCREENING SUTER BERHASIL============================================");
        System.out.println();
        System.out.println("===========================================PROSES PEMERIKSAAN DOKTER============================================");
        System.out.println();
        int x = pengunjung.getLevelPenyakit();
        for(int i = 0; i <= x; i++) {
            pemeriksa.memeriksa(pengunjung, daftar);
            pemeriksa.cekStatus(pengunjung, daftar);
        }
        System.out.println("===========================================PROSES PEMERIKSAAN DOKTER BERHASIL============================================");
        System.out.println();
        DAO.getPengunjungSembuh();
    }
}
