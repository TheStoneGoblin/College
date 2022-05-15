/*
ID:     21307377
Name:   Gabriel Stan
Module: CS4222
Date:   2022/03/25
*/
import java.util.*;

public class PlayList{
    String nameOfPlayList;
    ArrayList<Track> playList;

    public PlayList(){
        this.nameOfPlayList = "My_PlayList";
        this.playList = new ArrayList<Track>();
    }

    public PlayList(String playListName){
        this.nameOfPlayList = playListName;
        this.playList = new ArrayList<Track>();
    }

    public String toString(){
        String playListOut = nameOfPlayList + "\n";
        for(Track temp : playList){            
            playListOut += String.format("%s \n", temp.toString());
        }
        return playListOut;
    }

    public void setName(String name){
        this.nameOfPlayList = name;
    }

    public String getName(){
        return this.nameOfPlayList;
    }

    public void add(String title, String artist){
        this.playList.add(new Track(title, artist));
    }

    public void add(String title, String artist, int year, int duration){
        this.playList.add(new Track(title, artist, year, duration));
    }

    public void add(Track t){
        this.playList.add(t);
    }

    public boolean remove(String title){
        boolean found = false;
        for(int i = this.playList.size() - 1; i >= 0 ; i--){
            Track temp = playList.get(i);
            if(temp.getTitle().toLowerCase().indexOf(title.toLowerCase()) != -1){
                playList.remove(playList.indexOf(temp));
                found = true;
            }
        }

        return found;
    }

    public void showList(){
        if(this.playList.size() == 0){
            System.out.println("The list is empty");
        }else{
            System.out.println(toString());
        }
    }

    private void play(ArrayList<Track> toPlay){
        String playListOut = nameOfPlayList + "\n";
        for(Track temp : toPlay){            
            playListOut += String.format("%s \n", temp.toString());
        }
        System.out.println(playListOut);
    }

    public void playAll(boolean random){
        if(random){
            ArrayList<Track> tempPlayList2 = new ArrayList<Track>();
            ArrayList<Track> tempPlayList = new ArrayList<>(playList);
            int a = tempPlayList.size();

            for(int i = 0; i < a ; i++){
                int rand = (int)(Math.random() * tempPlayList.size());
                tempPlayList2.add(tempPlayList.get(rand));
                tempPlayList.remove(rand);
            }
            play(tempPlayList2);
        }else{
            showList();
        }
    }

    public void playOnly(String artist){
        ArrayList<Track> tempPlayList = new ArrayList<Track>();
        play(this.playList);
        for(Track temp : playList){
            if(temp.getArtist().toLowerCase().contains(artist.toLowerCase())){
                tempPlayList.add(temp);
            }
        }
        if(tempPlayList.size() != 0){
            play(tempPlayList);
        }
    }

    public void playOnly(int year){
        ArrayList<Track> tempPlayList = new ArrayList<Track>();
        for(Track temp : playList){
            if(temp.getYear() == year){
                tempPlayList.add(temp);
            }
        }
        if(tempPlayList.size() != 0){
            play(tempPlayList);
        }
    }
}
