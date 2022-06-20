package com.uas.perawatan;

public class Pengunjung {
    private int rm;
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    private int levelPenyakit =5;
    private String status = "sakit";

    public Pengunjung(int rm,String nama, int usia, String alamat, String penyakit) {
        this.rm=rm;
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
        this.penyakit = penyakit;

    }

    public Pengunjung(String nama, int usia, String alamat) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
    }

    public int getLevelPenyakit() {
        return levelPenyakit;
    }

    public void setLevelPenyakit(int levelPenyakit) {
        this.levelPenyakit = levelPenyakit;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public int getRm() {
        return rm;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getPenyakit() {
        return penyakit;
    }
}
