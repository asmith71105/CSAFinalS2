import java.util.Scanner;

public class songClass extends albumClass
{
    //Instance Variables
    private static int trackNum;
    private static String songName;
    private static int ourSongPoints = 0;
    private static int loveStoryPoints = 0;
    private static int minePoints = 0;
    private static int wanegbtPoints = 0;
    private static int wildestDreams = 0;
    private static int lookWhatYouMadeMeDoPoints = 0;
    private static int loverPoints = 0;
    private static int cardiganPoints = 0;
    private static int willowPoints = 0;


    //Arrays
    static int[] songArray = {ourSongPoints,loveStoryPoints, minePoints, wanegbtPoints, wildestDreams,
            lookWhatYouMadeMeDoPoints, loverPoints, cardiganPoints, willowPoints};
    static String[] songNamesArray = {"Our Song", "Love Story (Taylor's Version)", "Mine",
            "We Are Never Ever Getting Back Together (Taylor's Version)", "Wildest Dreams (Taylor's Version)",
            "Look What You Made Me Do", "Lover", "cardigan", "willow"};
    static int[] trackNumArray = {11, 3, 1, 8, 9, 6, 3, 2, 1};


    //Constructors
    public void Song(int newTrackNum, String newSongName, String newGenre, String newAlbumName)
    {
        trackNum = newTrackNum;
        songName = newSongName;
        genre = newGenre;
        albumName = newAlbumName;
    }

    public static void generateSong()
    {
        Scanner keyboard2 = new Scanner(System.in);


        for(int i = 0; i < 8; i++)
        {
            if(songArray[i] > songArray[i + 1])
            {
                setSongName(songNamesArray[i]);
                setTrackNum(trackNumArray[i]);
            }
            else
            {
                setSongName(songNamesArray[i + 1]);
                setTrackNum(trackNumArray[i]);
            }
        }
    }


    //Getters
    public int getTrackNum()
    {
        return trackNum;
    }

    public String getSongName()
    {
        return songName;
    }

    //Setters
    public static void setTrackNum(int newTrackNum)
    {
        trackNum = newTrackNum;
    }

    public static void setSongName(String newSongName)
    {
        songName = newSongName;
    }

}