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
        System.out.println("1. Which of these albums is your personal favorite? \nA. Lover \nB. Speak Now \nC. " +
                "Reputation \nD. Red (Taylor's Version) \nE. Fearless (Taylor's Version) \nF. folklore");
        String answer1 = keyboard2.next();

        if(answer1.equals("A"))
        {
            theArcherPoints++;  //3
        }
        else if(answer1.equals("B"))
        {
            dearJohnPoints++; //3
        }
        else if(answer1.equals("C"))
        {
            delicatePoints++; //3
        }
        else if(answer1.equals("D"))
        {
            allTooWellPoints++;
        }
        else if(answer1.equals("E"))
        {
            whiteHorsePoints++;
        }
        else if(answer1.equals("F"))
        {
            myTearsRicochetPoints++;
        }

        System.out.println("2. Which of these singles do you prefer? \nA. Shake It Off \nB. willow \nC. Love Story" +
                " (Taylor's Version) \nD. Me! \nE. Look What You Made Me Do");
        String answer2 = keyboard2.next();

        if(answer2.equals("A"))
        {
            ayhtdwsPoints++;
        }
        else if(answer2.equals("B"))
        {
            tolerateItPoints++;
        }
        else if(answer2.equals("C"))
        {
            whiteHorsePoints++;
        }
        else if(answer2.equals("D"))
        {
            theArcherPoints++;
        }
        else if(answer2.equals("E"))
        {
            delicatePoints++;
        }

        System.out.println("3. Pick a collab \nA. exile ft. Bon Iver \nB. Everything Has Changed ft. Ed Sheeran \nC. " +
                "You All Over Me ft. Maren Morris \nD. The Last Time ft. Gary Lightbody \nE. Breathe ft. Colbie Calliat"
                + "\nF. coney island ft. The National");
        String answer3 = keyboard2.next();

        if(answer3.equals("A"))
        {
            myTearsRicochetPoints++;
        }
        else if(answer3.equals("B"))
        {
            allTooWellPoints++;
        }
        else if(answer3.equals("C"))
        {
            whiteHorsePoints++;
        }
        else if(answer3.equals("D"))
        {
            allTooWellPoints++;
        }
        else if(answer3.equals("E"))
        {
            whiteHorsePoints++;
        }
        else if(answer3.equals("F"))
        {
            tolerateItPoints++;
        }

        System.out.println("4. Choose a song that starts with a vowel \nA. Ours \nB. End Game \nC. invisible string \n" +
                "D. august \nE. Out of the Woods \nF. ivy");
        String answer4 = keyboard2.next();

        if(answer4.equals("A"))
        {
            dearJohnPoints++;
        }
        else if(answer4.equals("B"))
        {
            delicatePoints++;
        }
        else if(answer4.equals("C"))
        {
            myTearsRicochetPoints++;
        }
        else if(answer4.equals("D"))
        {
            myTearsRicochetPoints++;
        }
        else if(answer4.equals("E"))
        {
            ayhtdwsPoints++;
        }
        else if(answer4.equals("F"))
        {
            tolerateItPoints++;
        }

        System.out.println("5. Choose a hobby \nA. Journaling \nB. Baking \nC. Exercising \nD. Reading \nE. Drawing \n"
                + "F. Gardening");
        String answer5 = keyboard2.next();

        if(answer5.equals("A"))
        {
            theArcherPoints++;
        }
        else if(answer5.equals("B"))
        {
            dearJohnPoints++;
        }
        else if(answer5.equals("C"))
        {
            ayhtdwsPoints++;
        }
        else if(answer5.equals("D"))
        {
            whiteHorsePoints++;
        }
        else if(answer5.equals("E"))
        {
            coldAsYouPoints++;
        }
        else if(answer5.equals("F"))
        {
            myTearsRicochetPoints++;
            tolerateItPoints++;
        }

        int temp = 0;

        for(int i = 0; i < songArray.length; i++)
        {
            for(int song : songArray)
            {
                if(songArray[i] > songArray[song])
                {
                    temp = songArray[temp];
                }
            }
        }

        setSongName(songNamesArray[temp]);
    }


    //Getters
    public static String getSongName()
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
        generateAlbum();
        generateSong();
        return "Album: " + getAlbumName() + "\n-Genre: " + getGenre() + "\n\nSong: " + getSongName();
    } //end toString
} //end class