package oop.Spotify;
import java.io.*;

import javax.naming.NamingEnumeration;

import oop.Spotify.Song;

public class Playlist{
  private String name;
  private String length;
  private Song song;

  public Playlist(String setName, String setLength){
    name = setName;
    length = setLength;
  }

  //public String findLength(Playlist list){
    //private String length;


   // return length;
 // }

  public Song getSongs(Playlist list){
    return NamingEnumeration.getIDs(list);

    
  }

  public void addSong(Song newSong, Playlist listName){
    song = newSong;
    listName.put(newSong);
  }

  public String getName(){
    return name;
  }

  public String getLength(){
    return length;
  }

  
}