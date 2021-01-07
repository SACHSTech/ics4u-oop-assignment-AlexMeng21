package oop.Spotify;
import java.util.ArrayList;
import java.io.*;
import oop.Spotify.Playlist;
import oop.Spotify.Song;

// Favourites Playlist
// is a Playlist
// Favourite is automatically made when creating a new User
// Contains songs

public class Favourite extends Playlist{
  public Favourite(){
    super("Favourites");
  }

  public ArrayList addSong(Song newSong, Favourite Favourites){
    if (newSong.getFav() == false) {
      newSong.favourite(newSong, Favourites);
    }

    Favourites.findLength();
    return super.addSong(newSong);
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
    return super.getName() + " " + super.findLength() + " " + super.getSongs();
  }
}