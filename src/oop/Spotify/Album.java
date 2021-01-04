package oop.Spotify;
import oop.Spotify.Song;
import oop.Spotify.Songlist;
import java.util.ArrayList;

public class Album extends Songlist{
  private String artist;
  private String name;
  private String length;
  private int intCount = 0;
  private ArrayList <Song> Songs = new ArrayList<Song>();
  
  public Album(String setName, String setArtist){
    name = setName;
    artist = setArtist;
  }
  
  public void setArtist(String newArtist){
    artist = newArtist;
  }
  public String getArtist(){
    return artist;
  }

  public void addSong(String name, Song newSong){
    Songs.add(intCount, newSong);
    intCount = intCount + 1;
  }

  public ArrayList getSongs(){
    return Songs;
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
    return name + " " + artist + " " + length + " " + Songs;
  } 

}