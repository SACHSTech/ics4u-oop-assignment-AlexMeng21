package oop.Spotify;
import java.io.*;

public class Playlist{
  private String name;
  private String length;
  private Song song;

  public Playlist(String setName, String setLength){
    name = setName;
    length = setLength;
  }

  public void addSong(Song newSong, String listName){
    song = newSong;
    put(Song , Playlist);
  }

  public String getName(){
    return name;
  }

  public String getLength(){
    return length;
  }

  
}