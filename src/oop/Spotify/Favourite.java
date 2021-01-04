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

  public void addSong(Song newSong){
    super.addSong(newSong);
    //newSong.favourite();
  }

  public void removeSong(Song song){
    int Counter;
    Song check;

    for(Counter = 0; Counter < Songs.size(); Counter ++){
      check = Songs.get(Counter);
      if(check == song){
        Songs.remove(Counter);
        break;
      }
    }
  }

  public String getName(){
    return "Favourites";
  }

  public ArrayList getSongs(){
    return super.getSongs();
  }
}