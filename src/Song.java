import java.util.Scanner;

public class Song extends Album
{
    //Instance Variables
    private static String songName;
    private static int coldAsYouPoints = 0;
    private static int whiteHorsePoints = 0;
    private static int dearJohnPoints = 0;
    private static int allTooWellPoints = 0;
    private static int ayhtdwsPoints = 0;
    private static int delicatePoints = 0;
    private static int theArcherPoints = 0;
    private static int myTearsRicochetPoints = 0;
    private static int tolerateItPoints = 0;


    //Arrays
    static int[] songArray = {coldAsYouPoints, whiteHorsePoints, dearJohnPoints, allTooWellPoints, ayhtdwsPoints,
            delicatePoints, theArcherPoints, myTearsRicochetPoints, tolerateItPoints};
    static String[] songNamesArray = {"Cold As You", "White Horse (Taylor's Version)", "Dear John",
            "All Too Well (Taylor's Version)", "All You Had to Do Was Stay", "Delicate", "The Archer",
            "my tears ricochet", "tolerate it"};


    //Constructors
    public Song(String genre, String albumName, String newSongName, String newGenre, String newAlbumName)
    {
        super(genre, albumName);
        songName = newSongName;
    }


    //Brain Method
    public static void generateSong()
    {
        Scanner keyboard2 = new Scanner(System.in);
        System.out.println("1. ");

        int temp = 0;

        for(int i = 0; i < songArray.length; i*=1)
        {
            if(songArray[i] >= 5)
            {
                for(int song : songArray)
                {
                    if(songArray[i] > songArray[song])
                    {
                        temp = songArray[song];
                    }
                }
            }
            else
            {
                i++;
            }
        }

        setSongName(songNamesArray[temp]);
    }


    //Getters
    public String getSongName()
    {
        return songName;
    }

    //Setters
    public static void setSongName(String newSongName)
    {
        songName = newSongName;
    }


    //toString
    public String toString()
    {
        String results = "Album: " + getAlbumName() + "\n-Genre: " + getGenre() + "\n\nSong: " + getSongName();
        return results;
    } //end toString
} //end class