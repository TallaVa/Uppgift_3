package Chapter7Array.CodeListing7_15;

public class MonthDays
{
   
        public static void main(String[] args)
        {
            String[] months = { "Januari", "Februari", "Mars",
                                "April", "Maj", "Juni", "Juli",
                                "Augusti", "September", "Oktober",
                                "November", "December" };
            
            int[] days = { 31, 28, 31, 30, 31, 30, 31,
                            31, 30, 31, 30, 31 };

            for ( int index = 0; index < months.length; index++)
            {
                System.out.println(months[index] + " has " + days[index] + " days.");
            }
        }
     
}
