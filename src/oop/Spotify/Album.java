package oop.Spotify;
import oop.Spotify.Song;
import oop.Spotify.Songlist;
import java.util.HashMap;

public class Album extends Playlist{
  private String artist;
  private HashMap <String, Song> songs = new HashMap<String, Song>();
  
  public Album(String setName, String setLength, String setArtist){
    super(setName, setLength);
    artist = setArtist;
  }
  
  public String getArtist(){
    return artist;
  }

  public void addSong(String name, Song newSong){
    songs.put(name, newSong);
  }
}