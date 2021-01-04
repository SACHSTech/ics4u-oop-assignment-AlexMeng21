package oop.Spotify;
import java.io.*;
import java.util.ArrayList;

public class Spotify{
  public static void main(String[] args) throws IOException{
    ArrayList <Song> Songs = new ArrayList <Song>();

    Song Believer = new Song("Believer", "Imagine Dragons", "03:24", false, "Evolve", "12/30/2020");

    Episode newEp = new Episode("newEp", "Sony", "03:30", false, "Podcast", "2021/01/03", "Description");

    Playlist S = new Playlist("S");

    System.out.println(Believer);

    System.out.println(newEp);
    System.out.println(S);

    S.addSong(Believer);
    S.addSong(Believer);

    S.findLength();

    System.out.println(S);

  }
}

