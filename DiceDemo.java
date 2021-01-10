/**
 * Det här programmet simulerar rull av tärningen
 */

public class DiceDemo
{
    public static void main(String[] args)
    {
        final int DIE1_SIDES = 6;       //Antal sidor av tärning #1
        final int DIE2_SIDES = 12;      //Antal sidor av tärning #2
        final int MAX_ROLLS = 5;        //Antal gånger tärnigen ska rulla
    
        //Skapar två instanser av Die classen
        Die die1 = new Die(DIE1_SIDES);
        Die die2 = new Die(DIE2_SIDES);

        //Visa tärningarnas antala sidor
        System.out.println("Det här simulerar rullning av en "
                + DIE1_SIDES + " sides tärning och en med  " + DIE2_SIDES + " sidor");
        System.out.println("Tärningarnas initiala värde: ");
        System.out.println(die1.getValue() + " " + die2.getValue());

        //Rulla tärningarna 5 gånger
        System.out.println("Rullar tärninganra " + MAX_ROLLS + " gånger.");

        for (int i = 0; i < MAX_ROLLS; i++)
        {
            //Rullar tärningarna
            die1.roll();
            die2.roll();

            //Visa värdet av rätningarna 
            System.out.println(die1.getValue() + " " + die2.getValue());

        }

    }        
}
