package oop.Spotify;
import oop.Spotify.Song;
import oop.Spotify.Songlist;
import java.util.HashMap;

public class Album extends Songlist{
  private String artist;
  private String name;
  private String length;
  private HashMap <String, Song> songs = new HashMap<String, Song>();
  
  public Album(String setName, String setLength, String setArtist){
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
    songs.put(name, newSong);
  }

  public HashMap getSongs(){
    return songs;
  }

}