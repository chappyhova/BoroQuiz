package davidchapman.com.boroquiz;

/**
 * Created by GOAT on 06/09/2015.
 */
public class Questions {


    private Page[] mPages;

    public Questions(){
        mPages = new Page[33];

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

        mPages[17] = new Page("In which year did Boro win the Carling Cup?",
                new Answer ("2002", false),
                new Answer ("2003", false),
                new Answer ("2004", true),
                new Answer ("2005", false));

        mPages[18] = new Page("Which team beat Boro 4-0 in the UEFA Cup Final in 2006?",
                new Answer ("Espanyol", false),
                new Answer ("Deportivo", false),
                new Answer ("Villarreal", false),
                new Answer ("Sevilla", true));

        mPages[19] = new Page("Who is the oldest player to play for Boro?",
                new Answer ("Bryan Robson", true),
                new Answer ("Mark Schwarzer", false),
                new Answer ("Gareth Southgate", false),
                new Answer ("Colin Cooper", false));

        mPages[20] = new Page("Who scored the most league goals in Boro's history?",
                new Answer ("John Hickton", false),
                new Answer ("Brian Clough", false),
                new Answer ("George Camsell", true),
                new Answer ("Bernie Slaven", false));

        mPages[21] = new Page("Which former Boro player has the most interntional caps while playing for the club?",
                new Answer ("Gareth Southgate", false),
                new Answer ("Mark Schwarzer", true),
                new Answer ("Juninho", false),
                new Answer ("Stewart Downing", false));

        mPages[22] = new Page("Who is Boro's most expensive signing?",
                new Answer ("Massimo Maccarone", false),
                new Answer ("Yakubu", false),
                new Answer ("Ugo Ehiogu", false),
                new Answer ("Afonso Alves", true));

        mPages[23] = new Page("From which Dutch club did Boro sign, Afonso Alves?",
                new Answer ("Heerenveen", true),
                new Answer ("Ajax", false),
                new Answer ("PSV", false),
                new Answer ("Feyenoord", false));

        mPages[24] = new Page("From which club did Boro sign, Craig Hignett?",
                new Answer ("Barnsley", false),
                new Answer ("Liverpool", false),
                new Answer ("Crewe Alexandra", true),
                new Answer ("Blackburn Rovers", false));

        mPages[25] = new Page("How many years did Boro go without winning a major trophy?",
                new Answer ("108", false),
                new Answer ("128", true),
                new Answer ("118", false),
                new Answer ("138", false));

        mPages[26] = new Page("Which country did Joseph-Desire Job play for?",
                new Answer ("Ivory Coast", false),
                new Answer ("South Africa", false),
                new Answer ("Ghana", false),
                new Answer ("Cameroon", true));

        mPages[27] = new Page("From which team did Boro sign Juninho in 1995?",
                new Answer ("Sao Paolo", true),
                new Answer ("Santos", false),
                new Answer ("Flamengo", false),
                new Answer ("Palmeiras", false));

        mPages[28] = new Page("To which team did Boro sell Juninho in 1997?",
                new Answer ("Barcelona", false),
                new Answer ("Celtic", false),
                new Answer ("Atletico Madrid", true),
                new Answer ("Real Madrid", false));

        mPages[29] = new Page("At which stadium did Boro play West Ham United in an FA Cup semi-final in 2006?",
                new Answer ("Old Trafford", false),
                new Answer ("Villa Park", true),
                new Answer ("Millenium Stadium", false),
                new Answer ("Wembley", false));

        mPages[30] = new Page("Which side knocked Boro out of the UEFA Cup in 2005?",
                new Answer ("Villarreal", false),
                new Answer ("Roma", false),
                new Answer ("Sevilla", false),
                new Answer ("Sporting Lisbon", true));

        mPages[31] = new Page("Which Boro player scored a brace in a 2-0 victory over Lazio in 2004?",
                new Answer ("Bolo Zenden", true),
                new Answer ("Stewart Downing", false),
                new Answer ("Mark Viduka", false),
                new Answer ("Jimmy Floyd Hasselbaink", false));

        mPages[32] = new Page("Which shirt number does Stewart Downing wear for Boro?",
                new Answer ("11", false),
                new Answer ("20", false),
                new Answer ("19", true),
                new Answer ("17", false));




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
