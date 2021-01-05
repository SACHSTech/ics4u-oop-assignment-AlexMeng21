package oop.Spotify;
import oop.Spotify.Song;
import oop.Spotify.Songlist;
import java.util.ArrayList;

public class Album extends Songlist{
  private String artist;
  private ArrayList <Song> Songs = new ArrayList<Song>();
  
  // Constructor
  public Album(String setName, String setArtist){
    super(setName);
    artist = setArtist;
  }

  public String getName(){
    return super.getName();
  }
  
  public String getArtist(){
    return artist;
  }

  public ArrayList addSong(Song newSong){
    Songs = super.addSong(newSong);
    return Songs;
  }

  public ArrayList getSongs(){
    return Songs;
  }

  public String findLength(){
    return super.findLength();
  }

  public void Play(){
    super.Play();
  }

  public String toString(){
    return super.getName() + " " + artist + " " + super.findLength() + " " + Songs;
  } 

}