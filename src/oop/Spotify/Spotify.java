package oop.Spotify;
import java.io.*;
import java.util.ArrayList;

/** 
* Main Program Spotify.java
* Demonstrate Functionality
* Create User, Create Songs, Episodes, Playlists, Albums, Podcasts, etc
* Print All Objects
* Add Songs to Albums and Playlists
* Add Episodes to Podcasts
* Like Songs, then print Favourites
* Add Playlists, Albums, Podcasts to User
* Play Songs
*/

public class Spotify{
  public static void main(String[] args) throws IOException{

    int intCount;

    User Me = new User("Me", "12345");

    Song Believer = new Song("Believer", "Imagine Dragons", "03:24", "Evolve", "12/30/2020");
    Song Thunder = new Song("Thunder", "Imagine Dragons", "03:19", "Evolve", "01/04/2021");
    Song Perfect = new Song("Perfect", "Ed Sheeran", "03:30", "Divide", "01/05/2021");
    Song Happier = new Song("Happier", "Ed Sheeran", "03:10", "Divide", "01/05/2021");

    System.out.println("New Song: " + Believer.getName());
    System.out.println("New Song: " + Thunder.getName());
    System.out.println("New Song: " + Perfect.getName());
    System.out.println("New Song: " + Happier.getName());
    System.out.println(" ");

    Episode Ep1 = new Episode("Ep1", "Sony", "03:30", "Series", "2021/01/03", "Description");
    Episode Ep2 = new Episode("Ep2", "Sony", "04:30", "Series", "2021/01/03", "Description");
    Episode Book1 = new Episode("Book1", "Amazon", "45:20", "Audible", "01/05/2021", "Story");
    Episode Book2 = new Episode("Book2", "Amazon", "30:17", "Audible", "01/05/2021", "Second part");

    System.out.println("New Episode: " + Ep1.getName());
    System.out.println("New Episode: " + Ep2.getName());
    System.out.println(" ");

    Album Evolve = new Album("Evolve", "Imagine Dragons");
    Album Divide = new Album("Divide", "Ed Sheeran");

    System.out.println("New Album: " + Evolve);
    System.out.println("New Album: " + Divide);
    System.out.println(" ");

    Podcast series = new Podcast("Series", "Twitch", "Description");
    Podcast Audible = new Podcast("Audible", "Amazon", "Audio Books");

    System.out.println("New Podcast: " + series);
    System.out.println("New Podcast: " + Audible);
    System.out.println(" ");

    Playlist S = new Playlist("S");
    Playlist N = new Playlist("N");

    System.out.println("New Playlist: " + S);
    System.out.println("New Playlist: " + N);
    System.out.println(" ");

    Evolve.addSong(Thunder);
    Evolve.addSong(Believer);

    System.out.println("Evolve with 2 songs: ");
    for (intCount = 0; intCount < Evolve.getSongs().size(); intCount ++) {
      System.out.println(Evolve.getSongs().get(intCount));

    }

    System.out.println("Length: " + Evolve.findLength());
    System.out.println(" ");

    Divide.addSong(Perfect);
    Divide.addSong(Happier);

    System.out.println("Divide with 2 songs: ");
    for (intCount = 0; intCount < Divide.getSongs().size(); intCount ++) {
      System.out.println(Divide.getSongs().get(intCount));

    }

    System.out.println("Length: " + Divide.findLength());
    System.out.println(" ");

    series.addEpisode(Ep1, series);
    series.addEpisode(Ep2, series);

    System.out.println("Series with 2 episodes: ");
    for (intCount = 0; intCount < series.getSongs().size(); intCount ++) {
      System.out.println(series.getSongs().get(intCount));

    }

    System.out.println("Length: " + series.findLength());
    System.out.println(" ");

    Audible.addEpisode(Book1, Audible);
    Audible.addEpisode(Book2, Audible);

    System.out.println("Audible with 2 episodes: ");
    for (intCount = 0; intCount < Audible.getSongs().size(); intCount ++) {
      System.out.println(Audible.getSongs().get(intCount));

    }

    System.out.println("Length: " + Audible.findLength());
    System.out.println(" ");

    S.addSong(Believer);
    S.addSong(Thunder);

    System.out.println("S with 2 Songs: ");
    for (intCount = 0; intCount < S.getSongs().size(); intCount ++) {
      System.out.println(S.getSongs().get(intCount));

    }

    System.out.println("Length: " + S.findLength());
    System.out.println(" ");

    N.addSong(Perfect);
    N.addSong(Happier);

    System.out.println("N with 2 Songs: ");
    for (intCount = 0; intCount < N.getSongs().size(); intCount ++) {
      System.out.println(N.getSongs().get(intCount));

    }

    System.out.println("Length: " + N.findLength());
    System.out.println(" ");

    Me.addAlbum(Evolve);
    Me.addAlbum(Divide);
    Me.addPlaylist(S);
    Me.addPlaylist(N);
    Me.addPodcast(series);
    Me.addPodcast(Audible);

    System.out.println("My Albums: ");
    for (intCount = 0; intCount < Me.getAlbums().size(); intCount ++) {
      ArrayList <Album> albums = Me.getAlbums();
      System.out.println(albums.get(intCount).getName());

    }

    System.out.println(" ");

    System.out.println("My Playlists: ");
    for (intCount = 0; intCount < Me.getPlaylists().size(); intCount ++) {
      ArrayList <Playlist> lists = Me.getPlaylists();
      System.out.println(lists.get(intCount).getName());

    }
    System.out.println(" ");

    System.out.println("My Podcasts: ");
    for (intCount = 0; intCount < Me.getPodcasts().size(); intCount ++) {
      ArrayList <Podcast> podcasts = Me.getPodcasts();
      System.out.println(podcasts.get(intCount).getName());

    }
    System.out.println(" ");

    Thunder.favourite(Thunder, Me.getLikedSongs());
    Perfect.favourite(Perfect, Me.getLikedSongs());

    System.out.println("My Favourite Songs: ");
    for (intCount = 0; intCount < Me.getLikedSongs().getSongs().size(); intCount ++) {
      ArrayList <Song> song = Me.getLikedSongs().getSongs();
      System.out.println(song.get(intCount).getName());

    }

    System.out.println("Length: " + Me.getLikedSongs().findLength());
    System.out.println(" ");

    System.out.println("Play S");
    S.Play();
    System.out.println(" ");

    System.out.println("Play N");
    N.Play();
    System.out.println(" ");

    System.out.println("Play Audible");
    Audible.Play();
    System.out.println(" ");

    System.out.println("Play Series");
    series.Play();
    System.out.println(" ");

    System.out.println("Play Evolve");
    Evolve.Play();
    System.out.println(" ");

    System.out.println("Play Divide");
    Divide.Play();
    System.out.println(" ");

    System.out.println("User Info: ");
    System.out.println(Me);

    System.out.println(" ");

    Me.changePass("54321");
    Me.changeUsername("notMe");

    System.out.println("Changed username and password: " + Me.getUsername() + ", " + Me.getPassword());


  }
}

