package oop.Spotify;
import oop.Spotify.Playlist;
import oop.Spotify.Episode;
import java.util.ArrayList;

public class Podcast extends Playlist{
  private String producer;
  private String description;
  private int intCount = 0;
  private ArrayList <Episode> Episodes = new ArrayList <Episode>();

  public Podcast(String setName, String setProducer, String About){
    super(setName);
    producer = setProducer;
    description = About;
  }

  public void addEpisode(Episode newEp, Podcast series){
    Episodes.add(intCount, newEp);
    intCount = intCount + 1;
  }

  public ArrayList getSongs(){
    return Episodes;
  }

  public String findLength(){
    return super.findLength();
  }

  public String getProducer(){
    return producer;
  }

  public String getName(){
    return super.getName();
  }

  public String getAbout(){
    System.out.println("About: ");
    return description;
  }

  public void Play(){
    super.Play();
  }

  public String toString(){
    return super.getName() + " " + super.findLength() + " " + producer + " " + Episodes;
  }
}