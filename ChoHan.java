import java.util.Scanner;

public class ChoHan 
{
    public static void main(String[] args)
    {
        final int MAX_ROUNDS = 5;       //Antal rundor
        String player1Name;             //Första spelarens namn
        String player2Name;             //Andra spelarens namn

        //Skapa ett scaner object för keyboard input
        Scanner key = new Scanner(System.in);
        
        //Ta emot selarnas namn
        System.out.println("Ange första spelarens namn: ");
        player1Name = key.nextLine();
        System.out.println("Ange andra spelarens namn: ");
        player2Name = key.nextLine();

        //Skapa Dealer (huset)
        Dealer dealer = new Dealer();

        //Skapa de två spelarna man angätt innan
        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);

        //Spela de 5 rundorna
        for (int round = 0; round < MAX_ROUNDS; round++)
        {
            System.out.println("----------------------");
            System.out.printf("Nu spelas runda %d.\n", round + 1);

            //rulla tärningarna
            dealer.rollDice();

            //Spelarna matar in sina gissningar
            player1.makeGuess();
            player2.makeGuess();

            //Avgär vem som är vinnaren
            roundResults(dealer, player1, player2);

        }
        
    //Presentera den slutliga vinnaren
    displayGrandWinner(player1, player2);

    key.close();
}


/**
 * roundResults metoden kollar upp vem som 
 * vann den varje runda
 * @param dealer Dealer objectet
 * @param player1 Spelare #1 objektet
 * @param player2 Spelare #2 objektet
 */

 public static void roundResults(Dealer dealer, Player player1, Player player2)
 {
     //visa tärningarnas värde
     System.out.printf("Dealer(Huset) rullade %d och %d.\n", 
                        dealer.getDie1Value(), dealer.getDie2Value());
     System.out.printf("Resultatet: %s\n", dealer.getChoOrHan());

     //Kolla varje spelares gissning och dela ut poäng
     checkGuess(player1, dealer);
     checkGuess(player2, dealer);
 }

 /**
  * checkGuess metoden kollar spelarnas gissningar
  * mot vad Dealer(husets) resultat
  * @param player spelar objektet att kolla
  * @param dealer Dealer objektet
  */

  public static void checkGuess(Player player, Dealer dealer)
  {
      final int POINTS_TO_ADD = 1;                  //poäng att ge till vinnaren
      String guess = player.getGuess();             //spelarens gissning
      String choHanResult = dealer.getChoOrHan();   //Cho eller Han

      //Presentera spelarnas gissningar
      System.out.printf("Spelare %s gissade på %s.\n", 
                        player.getName(), player.getGuess());

      //Ge poäng om spelaren gissat rätt
      if(guess.equalsIgnoreCase(choHanResult))
      {
          player.addPoints(POINTS_TO_ADD);
          System.out.printf("Tilldelar %d poäng till %s.\n", 
                            POINTS_TO_ADD, player.getName());
      }  
  }

  /**
   * displayGrandWinner metoden visar spelets stora vinnare
   * @param player1 Spelare #1
   * @param player2 Spelare #2
   */

   public static void displayGrandWinner(Player player1, Player player2)
   {
        System.out.println("--------------------------");
        System.out.println("Game Over. Här är resultatet: ");
        System.out.printf("%s: %d points.\n", player1.getName(),
                        player1.getPoints());
        System.out.printf("%s: %d points.\n", player2.getName(),
                        player2.getPoints()); 

        if (player1.getPoints() > player2.getPoints())
            System.out.println(player1.getName() + " är den stora vinnaren!");
        else if (player2.getPoints() > player1.getPoints())
            System.err.println(player2.getName() + " är den stora vinnaren!");
        else 
            System.out.println("Spelarna är lika!");
   }

   }



