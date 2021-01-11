/**
 * Dealer class för spelet Cho-Han
 */

public class Dealer
{
    private int die1Value;      //Värde av tärning #1
    private int die2Value;      //Värde av tärning #1

    /**
     * Constructor
     */

     public Dealer()
     {
         die1Value = 0;
         die2Value = 0;
     }

     /**
      * rollDice metoden rullar tärningarna och sparar deras värde
      */

      public void rollDice()
      {
          final int SIDES = 6; //antal sidor per rärning

          //Skapar två tärningar och rullar dem 
          Die die1 = new Die(SIDES);
          Die die2 = new Die(SIDES);

          //Spara värden
          die1Value = die1.getValue();
          die2Value = die2.getValue();
      }

      /**
       * getChoOrHan metoden kommer att return resultatet
       * av tärningarna, Cho eller Han.
       * @return antingen Cho (jämn) eller Han (udda)
       */

       public String getChoOrHan()
       {
           String result;   //Att holla resultatet

           //Få summan av tärningarna
           int sum = die1Value + die2Value;

           //Avgör om somman är udda eller jämnt
           if (sum % 2 == 0)
                result = "Cho (jämt)";
            else
                result = "Han (udda)";

           //Return resultatet
           return result;
       }

       /**
        * getDie1Value metoden returnerar värdet av tärning #1
        * @return die1Value fältet
        */

        public int getDie1Value()
        {
            return die1Value;
        }

        /**
         * getDie2Value metoden returnerar vördet av rärning #2
         * @return die2Value fältet
         */

         public int getDie2Value()
         {
             return die2Value;
         }
}
