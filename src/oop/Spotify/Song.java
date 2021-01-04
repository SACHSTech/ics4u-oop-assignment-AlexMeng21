package oop.Spotify;
import java.io.*;
import oop.Spotify.Favourite;

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

  public void favourite(Song song){
    if(favourite == false){
      Favourite.addSong(song);
    }
    favourite = true;
  }

  public void unfavourite(){
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

  public void setName(String newName){
    name = newName;
  }

  public void setArtist(String newArtist){
    artist = newArtist;
  }

  public void setAlbum(String newAlbum){
    album = newAlbum;
  }

  public void setDate(String newDate){
    date = newDate;
  }

  public void setLength(String newLength){
    length = newLength;
  }

  public String toString(){
    return getName() + " " + getArtist() + " " + getLength() + " " + getFav() + " " + getAlbum() + " " + getDate();
  }
}