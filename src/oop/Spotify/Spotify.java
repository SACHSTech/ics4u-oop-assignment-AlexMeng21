package oop.Spotify;
import java.io.*;
import java.util.ArrayList;

public class Spotify{
  public static void main(String[] args) throws IOException{

    Song Believer = new Song("Believer", "Imagine Dragons", "03:24", false, "Evolve", "12/30/2020");

    Song Thunder = new Song("Thunder", "Imagine Dragons", "03:19", false, "Evolve", "01/04/2021");

    Episode newEp = new Episode("newEp", "Sony", "03:30", false, "Podcast", "2021/01/03", "Description");

    Album Evolve = new Album("Evolve", "Imagine Dragons");

    Evolve.addSong(Thunder);
    Evolve.addSong(Believer);

    System.out.println(Evolve);

    Playlist S = new Playlist("S");

    System.out.println(Believer);

    System.out.println(newEp);

    System.out.println(S);

    S.addSong(Believer, S);
    S.addSong(Believer, S);

    //S.findLength();

    System.out.println(S);

    S.Play();

  }
}

