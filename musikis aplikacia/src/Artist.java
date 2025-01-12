import java.util.ArrayList;
import java.util.List;

public class Artist {
    private String name;
    private List<Album> albums;

    public Artist(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void addAlbum(Album album) {
        albums.add(album);
        for (Music music : album.getMusics()) {
            MusicLibrary.getSongs().add(music);
        }
    }

    public void removeAlbum(Album album) {
        albums.remove(album);
        for (Music music : album.getMusics()) {
            MusicLibrary.getSongs().remove(music);
        }
    }

    public void displayInfo() {
        System.out.println("Artist: " + name);
        for (Album album : albums) {
            album.displayInfo();
        }
    }
}
