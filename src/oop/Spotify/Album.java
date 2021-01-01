package oop.Spotify;

public class Album extends Playlist{
  private String artist;
  
  public Album(String setName, String setLength, String setArtist){
    super(setName, setLength);
    artist = setArtist;
  }
  
}