package oop.Spotify;
import oop.Spotify.Song;
import oop.Spotify.Songlist;
import java.util.ArrayList;

/** 
* Album class
* is a Songlist
* Contains songs
* Also has a set artist
*/

public class Album extends Songlist{
  private String artist;
  
  // Constructor
  public Album(String setName, String setArtist){
    super (setName);
    artist = setArtist;
  }

  public String getName(){
    return super.getName();
  }
  
  public String getArtist(){
    return artist;
  }

  public ArrayList addSong(Song newSong){
    return super.addSong(newSong);
  }

  public ArrayList getSongs(){
    return super.getSongs();
  }

  public String findLength(){
    return super.findLength();
  }

  public void Play(){
    super.Play();
  }

  public String toString(){
    return super.getName() + " " + artist + " " + super.findLength() + " " + super.getSongs();
  } 

}