import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {
    private static List<Artist> artists = new ArrayList<>();
    private static List<Album> albums = new ArrayList<>();
    private static List<Music> songs = new ArrayList<>();

    public static List<Music> getSongs() {
        return songs;
    }

    public void addArtist(Artist artist) {
        artists.add(artist);
    }

    public void removeArtist(Artist artist) {
        artists.remove(artist);
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public void removeAlbum(Album album) {
        albums.remove(album);
    }

    public Music searchMusic(String title) {
        for (Music music : songs) {
            if (music.getTitle().equalsIgnoreCase(title)) {
                return music;
            }
        }
        return null;
    }

    public Music giveRandomMusic() {
        if (!songs.isEmpty()) {
            int randomIndex = (int) (Math.random() * songs.size());
            return songs.get(randomIndex);
        }
        return null;
    }

    public void displayLibraryInfo() {
        System.out.println("Artists in Library:");
        for (Artist artist : artists) {
            artist.displayInfo();
        }
    }
}
