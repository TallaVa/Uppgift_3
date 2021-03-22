package Chapter7Array.CodeListing7_15;

public class CheckPoint7_15
{
    public static void main(String[] args)
    {
        String[] planets = { "Mercury", "Venus", "Earth", "Mars"};

        for (int index = 0; index < planets.length; index++)
        {
            System.out.println(planets[index] + " " + planets[index].charAt(0));
        }
    }
    
}
