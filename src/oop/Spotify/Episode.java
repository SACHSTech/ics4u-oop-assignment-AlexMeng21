package oop.Spotify;
import java.io.*;
import oop.Spotify.Song;

public class Episode extends Song{
  private String description;

  public Episode(String setName, String setArtist, String setLength, boolean isfavourite, String setAlbum, String setDate, String setDescription){
    super(setName, setArtist, setLength, isfavourite, setAlbum, setDate);
    description = setDescription;
  }
}