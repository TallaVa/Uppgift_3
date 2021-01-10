import java.util.Random;

/**
 * Den här class simulerar en sex sidig tärning
 */
public class Die
{
        private int sides;      //Nummer av sidor
        private int value;      //Tärningens värde

        /**
         * Construcor som initierar rull av tärning
         * @param numSides antal sidor på tärningen
         */

         public Die(int numSides)
         {
                 sides = numSides;
                 roll();
         }

         /**
          * roll metoden simulerar rullningen av tärningen
          */
         
          public void roll()
          {
                  //Skapa en Random object
                  Random rand = new Random();

                  //Få tärningens nummer
                  value = rand.nextInt(sides) + 1;
          }

          /**
           * getSides metoden
           * @return får tillbaka antal sidor på tärningen
           */

           public int getSides()
           {
                   return sides;
           }

           /**
            * getValue metoden 
            * @return värdet av tärningen
            */

            public int getValue()
            {
                    return value;
            }
}
