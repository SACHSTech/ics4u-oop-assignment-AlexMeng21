package oop.Spotify;
import oop.Spotify.Song;
import java.util.ArrayList;
import java.io.*;

/**
* Songlist class
* Parent to Playlist, Album, grandparent? lol to Favourite and Podcast
* Contains most of the methods for child classes
*/

public class Songlist{
  private String name;
  private String length = "00:00";
  private int intCount = 0;
  private ArrayList <Song> Songs = new ArrayList<Song>();

  public Songlist(String setName){
    name = setName;
  }

  public String getName(){
    return name;
  }

  public void setName(String newName){
    name = newName;
  }

  public ArrayList getSongs(){
    return Songs;
  }

  public ArrayList addSong(Song newSong){
    Songs.add(intCount, newSong);
    intCount = intCount + 1;
    return Songs;
  }

  public void removeSong(Song song){
    int Counter;
    Song check;

    for (Counter = 0; Counter < Songs.size(); Counter ++) {
      check = Songs.get(Counter);
      if (check == song) {
        Songs.remove(Counter);
        break;
      }

    }

  }

  public String findLength(){
    int TotalLength;
    int Counter;
    int Minutes;
    int Seconds;
    String strMin;
    String strSec;
    Song song;
    String SLength;

    TotalLength = 0;
    
    for (Counter = 0; Counter < Songs.size(); Counter ++) {
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

    if (strMin.length() < 2) {
      strMin = "0" + strMin;
    }

    if (strSec.length() < 2) {
      strSec = "0" + strSec;
    }

    length = strMin + ":" + strSec;
    return length;
  }

  public void Play(){
    int Counter;

    for (Counter = 0; Counter < Songs.size(); Counter ++) {
      System.out.println("Now Playing: " + Songs.get(Counter).getName());

    }

  }
}