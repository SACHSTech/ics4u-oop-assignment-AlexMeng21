package oop.Spotify;
import oop.Spotify.Playlist;
import oop.Spotify.Episode;
import java.util.HashMap;

public class Podcast extends Songlist{
  private String producer;
  private HashMap <String, Episode> Episodes = new HashMap<String, Episode>();

  public Podcast(String setName, String setProducer){
    super(setName);
    producer = setProducer;
  }

  public void addEpisode(String name, Episode newEp){
    Episodes.put(name, newEp);
  }

  public HashMap getSongs(){
    return Episodes;
  }
}