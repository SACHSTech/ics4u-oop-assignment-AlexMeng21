package oop.Spotify;
import oop.Spotify.Song;
import java.util.HashMap;
import java.io.*;

public abstract class Songlist{
  private String name;

  public Songlist(String setName){
    this.name = setName;
  }

  public void setName(String newName){
    name = newName;
  }

  public String getName(){
    return name;
  }

  public abstract HashMap getSongs();
}