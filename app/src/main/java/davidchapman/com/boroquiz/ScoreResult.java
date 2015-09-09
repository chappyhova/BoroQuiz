package davidchapman.com.boroquiz;

/**
 * Created by GOAT on 08/09/2015.
 */
public class ScoreResult {
    private int result;

    public String ScoreUpdate(int score){
        result = score;

        if (result == 10)
        {
            return "Congratulations you are the Juninho of Boro Quiz questions!";
        }
        else if (result > 7 &&  result < 10 )
        {
            return "Excellent! You are in the same league as Gareth Southgate!";
        }
        else if (result > 5 && result < 8)
        {
            return "Well done you achieved a solid score. Lets call you Robbie Mustoe!";
        }
        else if (result > 3 && result < 6)
        {
            return "Standards are low... Lee Dong-Gook... ";
        }
        else if (result > 1 && result < 4)
        {
            return "You've had a nightmare! You're worse than, Phil Whelan!";
        }
        else
        {
            return "Oh no... Jon Gittens...";
        }
    }
}
