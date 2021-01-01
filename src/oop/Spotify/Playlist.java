package oop.Spotify;
import java.io.*;
import oop.Spotify.Song;

public class Playlist{
  private String name;
  private String length;
  private Song song;

  public Playlist(String setName, String setLength){
    name = setName;
    length = setLength;
  }

  public void addSong(Song newSong, Playlist listName){
    song = newSong;
    listName.put("Song" , newSong);
  }

  public String getName(){
    return name;
  }

  public String getLength(){
    return length;
  }

  
}