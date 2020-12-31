package oop.Spotify;
import java.io.*;

public class Spotify{
  public static void main(String[] args) throws IOException{
    
    Song Believer;
    Believer = new Song("Believer", "Imagine Dragons", "3:24", false, "Evolve", "12/30/2020");

    System.out.println(Believer.getName());

  }
}

