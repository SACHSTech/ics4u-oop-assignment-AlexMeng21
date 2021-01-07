package oop.Spotify;
import oop.Spotify.Playlist;
import oop.Spotify.Episode;
import java.util.ArrayList;

// Podcast class
// is a Playlist
// Uses arrayList to store Episodes
// override addSong, getSongs, findLength
// Has a producer and description

public class Podcast extends Playlist{
  private String producer;
  private String description;
  private int intCount = 0;
  private String length = "00:00";
  private ArrayList <Episode> Episodes = new ArrayList <Episode>();

  public Podcast(String setName, String setProducer, String About){
    super (setName);
    producer = setProducer;
    description = About;
  }

  // Modify addSong to work with Episode object
  public void addEpisode(Episode newEp, Podcast series){
    Episodes.add(intCount, newEp);
    intCount = intCount + 1;
    series.findLength();
  }

  public ArrayList getSongs(){
    return Episodes;
  }

  // Modify findLength to work with Episode object
  public String findLength(){
    int TotalLength;
    int Counter;
    int Minutes;
    int Seconds;
    String strMin;
    String strSec;
    Episode episode;
    String SLength;

    TotalLength = 0;
    
    for (Counter = 0; Counter < Episodes.size(); Counter ++) {
      episode = Episodes.get(Counter);
      SLength = episode.getLength();

      Minutes = Integer.parseInt(SLength.substring(0 , 2));
      Seconds = Integer.parseInt(SLength.substring(3 , 5)) + (Minutes * 60);

      TotalLength = TotalLength + Seconds;

    }
    
    Minutes = (int)(TotalLength / 60);
    Seconds = TotalLength % 60;
    
    strMin = Integer.toString(Minutes);
    strSec = Integer.toString(Seconds);

    if (strMin.length() < 2) {
      strMin = "0" + strMin;
    }

    if (strSec.length() < 2) {
      strSec = "0" + strSec;
    }

    length = strMin + ":" + strSec;

    return length;
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
    int Counter;

    for (Counter = 0; Counter < Episodes.size(); Counter ++) {
      System.out.println("Now Playing: " + Episodes.get(Counter).getName());
    }
  }

  public String toString(){
    return super.getName() + " " + length + " " + producer + " " + Episodes;
  }
}