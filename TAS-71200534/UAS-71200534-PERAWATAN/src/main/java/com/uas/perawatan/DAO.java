package com.uas.perawatan;

import java.sql.*;

public class DAO {
    Connection con;
    public static ResultSet result;
    public static Statement statement;

    {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/perawatan", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Perawat getPerawatByID(int x){
        String sql="SELECT * from perawat where IdPerawat="+x;
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/perawatan", "root", "")){
            Statement statement= conn.createStatement();
            result=statement.executeQuery(sql);
            return new Perawat(result.getInt(0),result.getString(1));
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    private Pemeriksa getPemeriksaByID(int x){
        String sql="SELECT * from pemeriksa where IdPemeriksa="+x;
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/perawatan", "root", "")){
            Statement statement= conn.createStatement();
            result = statement.executeQuery(sql);
            return new Pemeriksa(result.getInt(0),result.getString(1),result.getString(2),result.getString(3));
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }

    }

    public static void inputDaftar(Daftar daftar){
        String sql="INSERT INTO daftar VALUES(" + "\""+daftar.getIdPemeriksaan()+"\""+","+"\""+daftar.getPengunjung().getRm()+"\""+","+"\""+daftar.getPerawat().getIdPerawat()+"\""+","+"\""+daftar.getPendaftaran().getIdPendaftaran()+"\""+","+"\""+daftar.getPengunjung().getStatus()+"\");";
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/perawatan", "root", "")){
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }

    public static void inputPengunjung(Pengunjung pengunjung){
        String sql="INSERT INTO pengunjung VALUES("+"\""+pengunjung.getRm()+"\""+","+"\""+pengunjung.getNama()+"\""+","+"\""+pengunjung.getUsia()+"\""+","+"\""+pengunjung.getAlamat()+"\""+","+"\""+pengunjung.getPenyakit()+"\");";
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/perawatan", "root", "")){
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    private Pendaftaran getPendaftaranByID(int x){
        String sql="SELECT * from pendaftaran where IdPendaftaran="+x;
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/perawatan", "root", "")){
            Statement statement= conn.createStatement();
            result=statement.executeQuery(sql);
            return new Pendaftaran(result.getInt(0),result.getString(1));
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void getPengunjungSembuh(){
        String sql="SELECT * from daftar where status=1";
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/perawatan", "root", "")){
            Statement statement= conn.createStatement();
            result=statement.executeQuery(sql);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void updateStatusPengunjung(int x){
        String sql="UPDATE pengunjung set status="+x;
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/perawatan", "root", "")){
            Statement statement= conn.createStatement();
            result=statement.executeQuery(sql);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }




}
