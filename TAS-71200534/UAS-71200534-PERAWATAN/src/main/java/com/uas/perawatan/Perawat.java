package com.uas.perawatan;

public class Perawat {
    private int idPerawat;
    private String nama;

    public Perawat(int idPerawat, String nama) {
        this.idPerawat = idPerawat;
        this.nama = nama;
    }

    public void screening(Pengunjung pengunjung, Daftar daftar){
        if(daftar.getStatusDaftar()==true){
            daftar.setStatusScreening(true);
            daftar.setPengunjung(pengunjung);
            System.out.println("screening berhasil");
        }else{
            System.out.println("harus pendaftaran terlebih dahulu");
        }
    }

    public int getIdPerawat() {
        return idPerawat;
    }
}
