import java.util.Random;

/**
 * Player class för spelet Cho-Han
 */

public class Player
{
    private String name;        //Spelarens namn
    private String guess;       //Spelarens gissning
    private int points;          // Spelarens poäng

    /**
     * Constructor
     * @param PlayerName Spelarens namn
     */

     public Player(String playerName)
     {
         name = playerName;
         guess = "";
         points = 0;
     }

     /**
      * makeGuess metoden får spelaren att gissa på antingen
      * "Cho (jämn)" eller "Han (udda)"
      */

      public void makeGuess()
      {
          //Skapar ett Random object
          Random rand = new Random();

          //få ett random nummer av antingen 0 eller 1
          int guessNumber = rand.nextInt(2);

          //Omvandla det random nummret vi fick till
          // att ge ut antingen Cho(jämn) eller Han(udda)
          if (guessNumber == 0)
            guess = "Cho (jämn)";
          else
            guess = "Han (udda)";  
      }

      /**
       * addPoints metoden lägger till poängen 
       * till spelarens pott
       */

       public void addPoints(int newPoints)
       {
           points += newPoints;
       }

       /**
        * getName metoden hämtar upp spelarens namn
        * @return namnet från namn fältet
        */

        public String getName()
        {
            return name;
        }

        /**
         * getGuess metoden hämtar vad spelaren har gissat
         * @return hämtar värdet från guess fältet
         */

         public String getGuess()
         {
             return guess;
         }

         /**
          * getPoints metoden hämtar spelarens poäng 
          * från points fältet
          * @return värdet från points fältet
          */

          public int getPoints()
          {
              return points;
          }
}
