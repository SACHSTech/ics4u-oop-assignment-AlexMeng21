package oop.Spotify;
import java.io.*;
import java.util.ArrayList;
import oop.Spotify.Song;
import oop.Spotify.Songlist;

public class Playlist extends Songlist{
  private String name;
  private String length = "00:00";
  private int intCount = 0;
  private ArrayList<Song> Songs = new ArrayList<Song>();

  public Playlist(String setName){
    name = setName;
  }

  public ArrayList getSongs(){
    return Songs;
  }

  public void addSong(Song newSong){
    Songs.add(intCount, newSong);
    intCount = intCount + 1;
  }

  public String getName(){
    return name;
  }

  public String getLength(){
    return length;
  }

  public void findLength(){
    int TotalLength;
    int Counter;
    int Minutes;
    int Seconds;
    String strMin;
    String strSec;
    Song song;
    String SLength;

    TotalLength = 0;
    
    for(Counter = 0; Counter < Songs.size(); Counter ++){
      song = Songs.get(Counter);
      SLength = song.getLength();
      Minutes = Integer.parseInt(SLength.substring(0 , 2));
      Seconds = Integer.parseInt(SLength.substring(3 , 5)) + (Minutes * 60);

      TotalLength = TotalLength + Seconds;
    }
    
    Minutes = (int)(TotalLength / 60);
    Seconds = TotalLength % 60;
    
    strMin = Integer.toString(Minutes);
    strSec = Integer.toString(Seconds);

    if(strMin.length() < 2){
      strMin = "0" + strMin;
    }

    if(strSec.length() < 2){
      strSec = "0" + strSec;
    }

    length = strMin + ":" + strSec;
    
  }

  public String toString(){
    return name + " " + length + " " + Songs;
  }  
}