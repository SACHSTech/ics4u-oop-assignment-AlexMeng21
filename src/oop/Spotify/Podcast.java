package oop.Spotify;
import oop.Spotify.Playlist;
import oop.Spotify.Episode;
import java.util.ArrayList;

public class Podcast extends Songlist{
  private String producer;
  private String name;
  private String length;
  private int intCount = 0;
  private ArrayList <Episode> Episodes = new ArrayList <Episode>();

  public Podcast(String setName, String setProducer){
    name = setName;
    producer = setProducer;
  }

  public void addEpisode(String name, Episode newEp){
    Episodes.add(intCount, newEp);
    intCount = intCount + 1;
  }

  public ArrayList getSongs(){
    return Episodes;
  }

  public void findLength(){
    int TotalLength;
    int Counter;
    int Minutes;
    int Seconds;
    String strMin;
    String strSec;
    Song episode;
    String SLength;

    TotalLength = 0;
    
    for(Counter = 0; Counter < Episodes.size(); Counter ++){
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

    if(strMin.length() < 2){
      strMin = "0" + strMin;
    }

    if(strSec.length() < 2){
      strSec = "0" + strSec;
    }

    length = strMin + ":" + strSec;
    
  }

  public String getProducer(){
    return producer;
  }

  public String getName(){
    return name;
  }

  public String getLength(){
    return length;
  }

  public String toString(){
    return name + " " + length + " " + producer + " " + Episodes;
  } 
}