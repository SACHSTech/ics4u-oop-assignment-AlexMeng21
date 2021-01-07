package oop.Spotify;
import java.io.*;
import oop.Spotify.Song;

/**
* Episode class
* is a Song
* No favourite
* Has a description and a producer instead of artist
*/

public class Episode extends Song{
  private String description;

  public Episode(String setName, String setProducer, String setLength, String setPodcast, String setDate, String setDescription){
    super (setName, setProducer, setLength, setPodcast, setDate);
    description = setDescription;
  }

  public String getDescription(){
    return description;
  }

  public String getName(){
    return super.getName();
  }

  public String getProducer(){
    return super.getArtist();
  }

  public String getLength(){
    return super.getLength();
  }

  public boolean getFav(){
    return super.getFav();
  }

  public String getPodcast(){
    return super.getAlbum();
  }

  public String getDate(){
    return super.getDate();
  }

  public String toString(){
    return getName() + " " + getArtist() + " " + " " + getLength() + " " + getFav() + " " + getPodcast() + " " + getDate() + " " + getDescription();
  }
}