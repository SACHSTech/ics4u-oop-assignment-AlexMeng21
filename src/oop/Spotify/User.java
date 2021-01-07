package oop.Spotify;
import java.io.*;
import java.util.ArrayList;
import oop.Spotify.Song;
import oop.Spotify.Playlist;
import oop.Spotify.Favourite;

// User class
// Contains list of added Playlists, Albums, Podcasts, and has it's own Favourite object
// Favourites playlist is created when a new user is made

public class User{
  private String username;
  private String password;
  private int ListCount = 0;
  private int AlbumCount = 0;
  private int SeriesCount = 0;
  private ArrayList<Playlist> playlists = new ArrayList<Playlist>();
  private ArrayList<Album> Albums = new ArrayList<Album>();
  private ArrayList<Podcast> Podcasts = new ArrayList<Podcast>();
  private Favourite favourites = new Favourite();

  public User(String setUsername, String setPass){
    username = setUsername;
    password = setPass;
  }

  public String getUsername(){
    return username;
  }

  public void changeUsername(String name){
    username = name;
  }

  public String getPassword(){
    return password;
  }

  public void changePass(String pass){
    password = pass;
  }

  public void addPlaylist(Playlist newPlaylist){
    playlists.add(ListCount, newPlaylist);
    ListCount = ListCount + 1;
  }

  public ArrayList getPlaylists(){
    return playlists;
  }

  public void removePlaylist(Playlist list){
    int Counter;
    Playlist check;

    for (Counter = 0; Counter < playlists.size(); Counter ++) {
      check = playlists.get(Counter);

      if (check == list) {
        playlists.remove(Counter);

      }

    }

  }

  public void addAlbum(Album newAlbum){
    Albums.add(AlbumCount, newAlbum);
    AlbumCount = AlbumCount + 1;
  }

  public ArrayList getAlbums(){
    return Albums;
  }

  public void removeAlbum(Album album){
    int Counter;
    Album check;

    for (Counter = 0; Counter < Albums.size(); Counter ++) {
      check = Albums.get(Counter);

      if (check == album) {
        Albums.remove(Counter);

      }

    }

  }

  public void addPodcast(Podcast newSeries){
    Podcasts.add(SeriesCount, newSeries);
    SeriesCount = SeriesCount + 1;
  }

  public ArrayList getPodcasts(){
    return Podcasts;
  }

    public void removePodcast(Podcast series){
    int Counter;
    Podcast check;

    for (Counter = 0; Counter < Podcasts.size(); Counter ++) {
      check = Podcasts.get(Counter);

      if (check == series) {
        Podcasts.remove(Counter);
        
      }

    }

  }

  public Favourite getLikedSongs(){
    return favourites;
  }

  public String toString(){
    return username + " " + password + " " + favourites + " " + playlists + " " + Albums + " " + Podcasts;
  }
}