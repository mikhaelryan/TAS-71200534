package com.rplbo.musicplaylist;

import java.util.ArrayList;

public class Playlist {
    private String playlistName;
    private static ArrayList<Song> songs=new ArrayList<>();
    private static int count;

    public Playlist(){

    }

    public String getPlayListName() {
        return playlistName;
    }

    public void setPlayListName(String playlistName) {
        this.playlistName = playlistName;
    }

    public static void print(){
        System.out.println("Jumlah Lagu = "+count+" / Kapasitas Playlist = 6");
        for (int i=0; i < songs.size(); i++){
            System.out.println("ListSong["+i+"] : "+songs.get(i).getName()+" - "+songs.get(i).getArtist());
        }
    }

    public String totalTime(){
        int total=0;
        for (int i=0; i < songs.size(); i++){
            total+=songs.get(i).getLength();
        }
        return ("Total waktu ["+this.playlistName+"] = "+total+" detik");
    }

    public void add(Song s){
        if(this.count<6) {
            this.songs.add(s);
            this.count+=1;
        }else{
            System.out.println("Playlist Favorite penuh!. Tidak bisa menambahkan lagu lagi.");
        }
    }

    public void remove(String songName){
        for (int i=0; i < songs.size(); i++){
            if(songs.get(i).getName()==songName){
                System.out.println(songs.get(i).getName()+" terhapus . . .");
                songs.remove(i);
                count-=1;
            }
        }
    }

    public int size(){
        return count;
    }
}
