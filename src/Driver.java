public class Driver
{
    public static void main(String[] args)
    {
        Album.generateAlbum();
       // Album album = new Album();
        Song.generateSong();
       // Song song = new Song();
        System.out.println(Album.albumName);
        System.out.println(Album.genre);
    }

}