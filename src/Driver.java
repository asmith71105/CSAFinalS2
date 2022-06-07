public class Driver
{
    public static void main(String[] args)
    {
        Album.generateAlbum();
        Song song = new Song("", "mom", "d", "n", "u");
        Song.generateSong();
        System.out.println(song.toString());
    }

}