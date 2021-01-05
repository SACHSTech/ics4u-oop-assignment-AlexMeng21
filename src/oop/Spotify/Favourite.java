package oop.Spotify;
import java.util.ArrayList;
import java.io.*;
import oop.Spotify.Playlist;
import oop.Spotify.Song;

public class Favourite extends Playlist{
  private ArrayList <Song> Songs = new ArrayList <Song> ();
  public Favourite(){
    super("Favourites");
  }

  public ArrayList addSong(Song newSong, Favourite Favourites){
    newSong.favourite(newSong, Favourites);
    Songs = super.addSong(newSong);
    Favourites.findLength();
    return Songs;
  }

  public void removeSong(Song song){
    super.removeSong(song);
  }

  public String getName(){
    return "Favourites";
  }

  public ArrayList getSongs(){
    return super.getSongs();
  }

  public String findLength(){
    return super.findLength();
  }

  public void Play(){
    super.Play();
  }

  public String toString(){
    return super.getName() + " " + super.findLength() + " " + Songs;
  }
}