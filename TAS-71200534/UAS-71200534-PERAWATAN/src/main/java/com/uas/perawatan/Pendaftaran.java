package com.uas.perawatan;

import java.util.Scanner;

public class Pendaftaran {
    private int IdPendaftaran;
    private String nama;

    public Pendaftaran(int idPendaftaran, String nama) {
        IdPendaftaran = idPendaftaran;
        this.nama = nama;
    }

    public void mengaturDaftar(Pengunjung pengunjung, Pemeriksa pemeriksa, Perawat perawat, Daftar daftar){
        if(pengunjung.getStatus()=="sakit"){
            daftar.setPemeriksa(pemeriksa);
            daftar.setStatusDaftar(true);
            daftar.setPengunjung(pengunjung);
            daftar.setPerawat(perawat);
            DAO.inputDaftar(new Daftar(daftar.getIdPemeriksaan(),pengunjung,pemeriksa,perawat,this));
        }
    }

    public Pengunjung registrasi(){
        Scanner inp1=new Scanner(System.in);
        System.out.println("Masukan RM: ");
        int rm=inp1.nextInt();
        Scanner inp=new Scanner(System.in);
        System.out.println("Masukan Nama anda: ");
        String nama=inp.nextLine();
        Scanner inp2=new Scanner(System.in);
        System.out.println("Masukan Usia anda: ");
        int usia=inp2.nextInt();
        Scanner inp3=new Scanner(System.in);
        System.out.println("Masukan alamat anda: ");
        String alamat=inp3.nextLine();
        Scanner inp4=new Scanner(System.in);
        System.out.println("Masukan penyakit anda: ");
        String penyakit=inp4.nextLine();
        System.out.println("Proses registrasi berhasil");
        DAO.inputPengunjung(new Pengunjung(rm,nama,usia,alamat,penyakit));

        return new Pengunjung(rm,nama,usia,alamat,penyakit);
    }

    public int getIdPendaftaran() {
        return IdPendaftaran;
    }
}
