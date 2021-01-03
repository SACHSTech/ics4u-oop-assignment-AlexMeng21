package oop.Spotify;
import java.io.*;
import java.util.HashMap;
import oop.Spotify.Song;
import oop.Spotify.Playlist;

public class User{
  private String username;
  private String password;
  private HashMap<String, Playlist> playlists = new HashMap<String, Playlist>();

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

  public void addPlaylist(String listName, Playlist newPlaylist){
    playlists.put(listName, newPlaylist);
  }

  public HashMap getPlaylists(){
    return playlists;
  }
}