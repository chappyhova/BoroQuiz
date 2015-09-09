package davidchapman.com.boroquiz;

/**
 * Created by GOAT on 06/09/2015.
 */
public class Questions {


    private Page[] mPages;

    public Questions(){
        mPages = new Page[18];

        mPages[0] = new Page("Which player scored the first goal in a competitive game at the Riverside Stadium?",
                new Answer ("Craig Hignett", true),
                new Answer ("Jan Age Fjortoft", false),
                new Answer ("John Hendrie", false),
                new Answer ("Nicky Barmby", false));

        mPages[1] = new Page("Who scored a hat trick for Boro away to Blackburn in October 2004?",
                new Answer ("Mark Viduka", false),
                new Answer ("Jimmy Floyd Hasselbaink", true),
                new Answer ("Massimo Maccarone", false),
                new Answer ("Joseph-Desire Job", false));

        mPages[2] = new Page("Which Boro player was sent off for slapping Javier Mascherano?",
                new Answer ("Tuncay Sanli", false),
                new Answer ("Jeremie Aliadiere", true),
                new Answer ("Mido", false),
                new Answer ("Lee Cattermole", false));

        mPages[3] = new Page("From which club did Boro loan Uwe Fuchs in 1995?",
                new Answer ("FC Koln", false),
                new Answer ("Kaiserslautern", false),
                new Answer ("Fortuna Koln", true),
                new Answer ("Fortuna Dusseldorf", false));

        mPages[4] = new Page("Who was Boro's top Premier League goalscorer with 9 goals in the 2002/03 season?",
                new Answer ("Joseph-Desire Job", false),
                new Answer ("Szilard Nemeth", false),
                new Answer ("Juninho", false),
                new Answer ("Massimo Maccarone", true));

        mPages[5] = new Page("Which player did Boro sign from Tottenham Hotspur for £30,000 in 1972?",
                new Answer ("Nobby Stiles", false),
                new Answer ("Graeme Souness", true),
                new Answer ("Bobby Murdoch", false),
                new Answer ("John Craggs", false));

        mPages[6] = new Page("From which club did Boro sign Massimo Maccarone?",
                new Answer ("Siena", false),
                new Answer ("Parma", false),
                new Answer ("Empoli", true),
                new Answer ("Palermo", false));

        mPages[7] = new Page("Emmanuel Pogatetz and Jimmy Floyd Hasselbaink were on the scoresheet in a 3-0 victory away to Sunderland in January 2006 but who scored the other goal?",
                new Answer ("Andrew Taylor", false),
                new Answer ("Stuart Parnaby", true),
                new Answer ("Lee Cattermole", false),
                new Answer ("Gaizka Mendieta", false));

        mPages[8] = new Page("How many FA Cup Semi-Final appearances have Boro made?(Not including replays)",
                new Answer ("1", false),
                new Answer ("2", false),
                new Answer ("3", true),
                new Answer ("4", false));

        mPages[9] = new Page("From which club did Boro sign Hamilton Ricard in 1997?",
                new Answer ("Deportivo Cali", true),
                new Answer ("Once Caldas", false),
                new Answer ("Millionarios", false),
                new Answer ("Santa Fe", false));

        mPages[10] = new Page("How many goals did Mark Viduka score for Boro in all competitions?",
                new Answer ("38", false),
                new Answer ("40", false),
                new Answer ("42", true),
                new Answer ("44", false));

        mPages[11] = new Page("Who was Boro's top Championship goalscorer with 12 goals in the 2009/10 season?",
                new Answer ("Leroy Lita", false),
                new Answer ("Jeremie Aliadiere", false),
                new Answer ("Adam Johnson", true),
                new Answer ("Scott McDonald", false));

        mPages[12] = new Page("What number shirt did Juninho have when he first signed for Boro?",
                new Answer ("23", false),
                new Answer ("10", false),
                new Answer ("20", false),
                new Answer ("25", true));

        mPages[13] = new Page("Against which team did Juninho score an equaliser to earn Boro a draw on his return from injury in March 2003?",
                new Answer ("Tottenham Hotspur", false),
                new Answer ("Everton", true),
                new Answer ("Newcastle United", false),
                new Answer ("Blackburn Rovers", false));

        mPages[14] = new Page("How many caps did Emerson have for Brazil?",
                new Answer ("0", true),
                new Answer ("3", false),
                new Answer ("5", false),
                new Answer ("8", false));

        mPages[15] = new Page("To which club did Boro sell Afonso Alves in 2009?",
                new Answer ("Al-Rayyan", false),
                new Answer ("Al-Gharafa", false),
                new Answer ("Al-Sadd", true),
                new Answer ("Qatar SC", false));

        mPages[16] = new Page("Which Boro player won the penalty that Paul Merson converted against Liverpool in the Coca-Cola League Cup semi-final second leg in 1998?",
                new Answer ("Paul Merson", false),
                new Answer ("Marco Branca", false),
                new Answer ("Craig Hignett", false),
                new Answer ("Mikkel Beck", true));

        mPages[17] = new Page("Who was Boro's top Premier League goalscorer with 13 goals in the 2005/06 season?",
                new Answer ("Jimmy Floyd Hasselbaink", false),
                new Answer ("Yakubu", true),
                new Answer ("Mark Viduka", false),
                new Answer ("Massimo Maccarone", false));



    }

    public Page[] getPages() {
        return mPages;
    }

    public void setPages(Page[] pages) {
        mPages = pages;
    }

    public int getLength()
    {
        return mPages.length;
    }

    public Page getPage(int pageNumber){
        return mPages[pageNumber];
    }
}
