package oop.Spotify;
import java.io.*;
import java.util.ArrayList;
import oop.Spotify.Song;
import oop.Spotify.Songlist;
import oop.Spotify.User;

public class Playlist extends Songlist{
  //private ArrayList<Song> Songs = new ArrayList<Song>();

  // Constructor
  public Playlist(String setName){
    super(setName);
    
  }

  public ArrayList getSongs(){
    return super.getSongs();
  }

  public ArrayList addSong(Song newSong, Playlist list){
    

    return super.addSong(newSong);
  }

  public void removeSong(Song song){
    super.removeSong(song);
  }

  public String getName(){
    return super.getName();
  }

  public void setName(String newName){
    super.setName(newName);
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