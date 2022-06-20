package com.uas.perawatan;

public class Pemeriksa {
    private int idPemeriksa;
    private String nama;
    private String spesialis;
    private String ruangan;

    public Pemeriksa(int idPemeriksaan, String nama, String spesialis, String ruangan) {
        this.idPemeriksa = idPemeriksa;
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pengunjung pengunjung, Daftar daftar){
        if(daftar.getStatusScreening()==true){
            if(pengunjung.getLevelPenyakit()>0){
                pengunjung.setLevelPenyakit(pengunjung.getLevelPenyakit()-1);
                if(pengunjung.getLevelPenyakit()>0) {
                    System.out.println("pasien anda masih sakit");
                }else{
                    System.out.println("selamat pasien anda telah sembuh");
                    DAO.updateStatusPengunjung(1);
                }
            }else{
                pengunjung.setStatus("sembuh");
            }
        }else{
            System.out.println("anda harus melakukan pendaftaraan terlebih dahulu di bagian pelayanan!");
        }
    }

    public void cekStatus(Pengunjung pengunjung, Daftar daftar){
        pengunjung.getStatus();
    }

    public int getIdPemeriksa() {
        return idPemeriksa;
    }
}
