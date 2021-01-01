package oop.Spotify;
import java.io.*;

public class Song{
  private String name;
  private String artist;
  private String length;
  private boolean favourite;
  private String album;
  private String date;

  public Song(String setName, String setArtist, String setLength, boolean isfavourite, String setAlbum, String setDate){
    name = setName;
    artist = setArtist;
    length = setLength;
    favourite = isfavourite;
    album = setAlbum;
    date = setDate;
  }

  public void favorite(){
    favourite = true;
  }

  public void unfavorite(){
    favourite = false;
  }

  public String getName(){
    return name;
  }

  public String getArtist(){
    return artist;
  }

  public String getLength(){
    return length;
  }

  public boolean getFav(){
    return favourite;
  }

  public String getAlbum(){
    return album;
  }

  public String getDate(){
    return date;
  }
}