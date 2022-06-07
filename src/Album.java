import java.lang.reflect.Array;
import java.util.Scanner;

public class Album
{
    //Instance Variables
    public static String genre;
    public static String albumName;
    public static int debutPoints = 0;
    public static int fearlessPoints = 0;
    public static int speakNowPoints = 0;
    public static int redPoints = 0;
    public static int birthYearPoints = 0;
    public static int reputationPoints = 0;
    public static int loverPoints = 0;
    public static int folklorePoints = 0;
    public static int evermorePoints = 0;

    //Arrays
    static int[] albumArray = {debutPoints, fearlessPoints, speakNowPoints, redPoints, birthYearPoints,
            reputationPoints, loverPoints, folklorePoints, evermorePoints};
    static String[] albumNamesArray = {"Taylor Swift", "Fearless (Taylor's Version)", "Speak Now",
            "Red (Taylor's Version)", "1989", "reputation", "Lover", "folklore", "evermore"};


    //Constructors
    //public Album();

    public Album(String newGenre, String newAlbumName)
    {
        this.genre = newGenre;
        this.albumName = newAlbumName;
    }


    //Album Method
    public static void generateAlbum()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("1. Which of these artists do you like the most? Enter the letter \nA. Tim McGraw \nB. " +
                "Keith Urban \nC. Ed Sheeran \nD. Future " + "\nE. Bon Iver \n");
        String answer1 = keyboard.next();

        if(answer1.equals("A"))
        {
            debutPoints++;
        }
        else if(answer1.equals("B"))
        {
            fearlessPoints++;
        }
        else if(answer1.equals("C"))
        {
            redPoints++;
        }
        else if(answer1.equals("D"))
        {
            reputationPoints++;
        }
        else if(answer1.equals("E"))
        {
            folklorePoints++;
            evermorePoints++;
        }

        System.out.println("2. What is your favorite genre of music? \nA. Country \nB. Pop \nC. Folk \nD. " +
                "Pop Rock");
        String answer2 = keyboard.next();

        if(answer2.equals("A"))
        {
            debutPoints++;
            fearlessPoints++;
        }
        else if(answer2.equals("B"))
        {
            birthYearPoints++;
            reputationPoints++;
            loverPoints++;
        }
        else if(answer2.equals("C"))
        {
            folklorePoints++;
            evermorePoints++;
        }
        else if(answer2.equals("D"))
        {
            speakNowPoints++;
        }

        System.out.println("3. Which of these Taylor Swift singles is your fave? \nA. Our Song \nB. You Belong With Me "
                + "\nC. 22 \nD. Blank Space \nE. Lover");
        String answer3 = keyboard.next();

        if(answer3.equals("A"))
        {
            debutPoints++;
        }
        else if(answer3.equals("B"))
        {
            fearlessPoints++;
            speakNowPoints++;
        }
        else if(answer3.equals("C"))
        {
            redPoints++;
        }
        else if(answer3.equals("D"))
        {
            birthYearPoints++;
        }
        else if(answer3.equals("E"))
        {
            loverPoints++;
        }


        System.out.println("4. What phase of life are you currently in? \nA. Heartbreak \nB. Revenge \nC. Acceptance " +
                "\nD. Renewal");
        String answer4 = keyboard.next();

        if(answer4.equals("A"))
        {
            debutPoints++;
            speakNowPoints++;
            redPoints++;
            folklorePoints++;
        }
        else if(answer4.equals("B"))
        {
            reputationPoints++;
        }
        else if(answer4.equals("C"))
        {
            loverPoints++;
            evermorePoints++;
        }
        else if(answer4.equals("D"))
        {
            birthYearPoints++;
        }

        System.out.println("5. Which of Taylor's boyfriends is your favorite? \nA. Joe Jonas \nB. Jake Gyllenhaal (ew) "
                + "\nC. Harry Styles \nD. Joe Alwyn (the best)");
        String answer5 = keyboard.next();

        if(answer5.equals("A"))
        {
            fearlessPoints++;
            speakNowPoints++;
        }
        else if(answer5.equals("B"))
        {
            redPoints++;
        }
        else if(answer5.equals("C"))
        {
            birthYearPoints++;
        }
        else if(answer5.equals("D"))
        {
            loverPoints++;
            reputationPoints++;
            folklorePoints++;
            evermorePoints++;
        }


        int temp = 0;

        for(int i = 0; i < albumArray.length; i*=1)
        {
            if(albumArray[i] >= 5)
            {
                for(int album : albumArray)
                {
                    if(albumArray[i] > albumArray[album])
                    {
                        temp = albumArray[album];
                    }
                }
            }
            else
            {
                i++;
            }
        }

        setAlbumName(albumNamesArray[temp]);


        if(albumName.equals("Taylor Swift") || albumName.equals("Fearless (Taylor's Version)"))
        {
            setGenre("Country");
        }
        else if(albumName.equals("Speak Now") || albumName.equals("Red (Taylor's Version"))
        {
            setGenre("Pop Rock");
        }
        else if(albumName.equals("1989") || albumName.equals("reputation") || albumName.equals("Lover"))
        {
            setGenre("Pop");
        }
        else
        {
            setGenre("Folk");
        }
    } //end of album method



    //Getters
    public String getGenre()
    {
        return genre;
    }

    public static String getAlbumName()
    {
        return albumName;
    }

    //Setters
    public static void setGenre(String newGenre)
    {
        genre = newGenre;
    }

    public static void setAlbumName(String newAlbumName)
    {
        albumName = newAlbumName;
    }
}