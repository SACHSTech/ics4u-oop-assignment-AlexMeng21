package Spotify;
import java.io.*;

public class User{
  private String username;
  private String password;
  private Playlist playlist;

  public User(String setUsername, String setPass){
    username = setUsername;
    password = setpassword;
  }

  public String getUsername(){
    return username;
  }

  public String getPassword(){
    return password;
  }

  public void addPlaylist(Playlist newPlaylist){
    playlist = newPlaylist;
    put(Playlist, User);
  }
}