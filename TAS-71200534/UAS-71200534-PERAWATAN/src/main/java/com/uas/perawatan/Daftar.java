package com.uas.perawatan;

public class Daftar {
    private int idPemeriksaan;
    private Pengunjung pengunjung;
    private Pemeriksa pemeriksa;
    private Perawat perawat;
    private Pendaftaran pendaftaran;
    private Boolean statusDaftar;
    private Boolean statusScreening;

    public Daftar(int idPemeriksaan, Pengunjung pengunjung, Pemeriksa pemeriksa, Perawat perawat, Pendaftaran pendaftaran) {
        this.idPemeriksaan = idPemeriksaan;
        this.pengunjung = pengunjung;
        this.pemeriksa = pemeriksa;
        this.perawat = perawat;
        this.pendaftaran = pendaftaran;
    }

    public Daftar() {
    }

    public Boolean getStatusScreening() {
        return statusScreening;
    }

    public void setPengunjung(Pengunjung pengunjung) {
        this.pengunjung = pengunjung;
    }

    public void setPemeriksa(Pemeriksa pemeriksa) {
        this.pemeriksa = pemeriksa;
    }

    public void setPerawat(Perawat perawat) {
        this.perawat = perawat;
    }

    public void setStatusDaftar(Boolean statusDaftar) {
        this.statusDaftar = statusDaftar;
    }

    public void setStatusScreening(Boolean statusScreening) {
        this.statusScreening = statusScreening;
    }

    public Boolean getStatusDaftar() {
        return statusDaftar;
    }

    public Pengunjung getPengunjung() {
        return pengunjung;
    }

    public Pemeriksa getPemeriksa() {
        return pemeriksa;
    }

    public Perawat getPerawat() {
        return perawat;
    }

    public Pendaftaran getPendaftaran() {
        return pendaftaran;
    }

    public int getIdPemeriksaan() {
        return idPemeriksaan;
    }
}
