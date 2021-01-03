package oop.Spotify;
import java.io.*;
import java.util.HashMap;
import oop.Spotify.Song;
import oop.Spotify.Songlist;

public class Playlist extends Songlist{
  private String name;
  private String length;
  private HashMap<String, Song> Songs = new HashMap<String, Song>();

  public Playlist(String setName, String setLength, HashMap SongList){
    super(setName);
    length = setLength;
    Songs = SongList;
  }

  public HashMap getSongs(){
    return Songs;
  }

  public void addSong(String name, Song newSong){
    Songs.put(name, newSong);
  }

  public String getName(){
    return name;
  }

  public String getLength(){
    return length;
  }

  
}