public class Main {
    public static void main(String[] args) {
        Music song1 = new Music("good song", 3.5, "Pop");
        Music song2 = new Music("even better one ig", 4.0, "Rock");
        Music song3 = new Music("king von anti piracy", 2.8, "Jazz");

        Album album1 = new Album("my block", 2020);
        album1.addMusic(song1);
        album1.addMusic(song2);

        Album album2 = new Album("cops", 2022);
        album2.addMusic(song3);

        Artist artist1 = new Artist("king von");
        artist1.addAlbum(album1);

        Artist artist2 = new Artist("police");
        artist2.addAlbum(album2);

        MusicLibrary library = new MusicLibrary();
        library.addArtist(artist1);
        library.addArtist(artist2);

        library.displayLibraryInfo();

        Music foundSong = library.searchMusic("Song 1");
        if (foundSong != null) {
            foundSong.play();
            foundSong.stop();
        }

        Music randomSong = library.giveRandomMusic();
        if (randomSong != null) {
            randomSong.play();
        }

        album1.removeMusic(song2);
        artist1.removeAlbum(album1);


        library.displayLibraryInfo();
    }
}
