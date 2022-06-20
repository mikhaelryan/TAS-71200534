package org.example;

import java.sql.*;

public class App 
{
    public double sudut(String s) {
        String[] arr=s.split(":");
        int jam= Integer.parseInt(arr[0]);
        int menit= Integer.parseInt((arr[1]));

        double derajat=0.5*(jam*60+menit);
        double derajat2=6*menit;

        double angle=derajat-derajat2;
        angle=Math.min(360-angle,angle);
        return (angle);
    }

    String url="jdbc:sqlite:waktu.db";

    public void createNewDatabase(){
        try(Connection conn= DriverManager.getConnection(url)){
            if (conn != null) {
                DatabaseMetaData meta=conn.getMetaData();

            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void createNewTable() {
    String sql = "create table IF NOT EXISTS waktu" +
            "(\n" +
            " nomor integer not null\n" +
            " constraint waktu_pk\n" +
            " primary key autoincrement,\n" +
            " waktu text not null,\n" +
            " sudut real null\n" +
            ");";
    String sql2="INSERT INTO waktu values('1','15:00','2'),('2','07:30','2'),\n" +
            " ('3','08:05','2'),\n" +
            " ('4','17:35','2'),\n" +
            " ('5','11:01','2');";
    try(Connection conn= DriverManager.getConnection(url)){
        Statement stm = conn.createStatement();
        stm.execute(sql);
        stm.execute(sql2);
    }catch (SQLException e){
        System.out.println(e.getMessage());
    }
    }

    public void update(){
        String sql="SELECT * FROM waktu";
        try(Connection conn= DriverManager.getConnection(url)){
            Statement stm = conn.createStatement();
            ResultSet rs=stm.executeQuery(sql);
            while (rs.next()){
                double hasil= sudut(rs.getString("sudut"));
                String sql2=  "Update waktu set sudut="+hasil+" WHere nomor="+rs.getString("nomor");
                Statement stm2 = conn.createStatement();
                stm2.execute(sql2);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }


    public static void main( String[] args )
    {
        App app=new App();
        app.createNewDatabase();
        app.createNewTable();
        app.update();
    }

}
