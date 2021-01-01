package oop.Spotify;
import oop.Spotify.Playlist;

public class Podcast extends Playlist{
  private String producer;

  public Podcast(String setName, String setLength, String setProducer){
    super(setName, setLength);
    producer = setProducer;
  }

  public void addEpisode(Podcast podcast, Episode newEp){
    podcast.put(podcast, newEp);
  }
}