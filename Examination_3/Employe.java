package Examination_3;
/**
 * Examination 3 Employe list
 * Program för att få en lista på sina anställda
 * med en del funktioner som att lägga till, ta bort
 * och söka på specifika uppgifter.
 */

 public class Employe
 {
  private String employeID;
  private String arbetsTitel;
  private String fNamn;
  private String eNamn;
  private String stad;
  private int alder;
  private double lonPerTim;
  private int timVecka;


  /**
   * Konstruktor med alla fälten som ska användas.
   * @param employeID     Anställds ID.
   * @param arbetsTitel   Anställds arbetstitel.
   * @param fNamn         Anställds förnamn.
   * @param eNamn         Anställds efternamn.
   * @param stad          Anställds bostads ort.
   * @param alder         Anställds ålder.
   * @param lonPerTim     Anställds lön per timme.
   * @param timVecka      Anställds arbetade timmar per vecka.
   */
  public Employe(String employeID, String arbetsTitel, String fNamn, String eNamn, String stad, int alder,
                  int lonPerTim, int timVecka) 
  {
      this.employeID = employeID;
      this.arbetsTitel = arbetsTitel;
      this.fNamn = fNamn;
      this.eNamn = eNamn;  
      this.alder = alder;          
      this.lonPerTim = lonPerTim;
      this.timVecka = timVecka;
      this.stad = stad;
      
  }


  /**
   * getemployeID metoden reurnerar
   * andställdas ID
   * @return Anställdas ID.
   */
  public String getemployeID() 
    {
      return employeID;
    }

    /**
     * setemployeID metoden sätter 
     * den anställdas ID
     * @param employeID Anställdas ID.
     */
    public void setemployeID(String employeID) 
    {
      this.employeID = employeID;
    }

    /**
     * getarbetsTitel metoden returnerar 
     * anställdas arbetsTiteln
     * @return Värdet i arbetsTitel.
     */
    public String getarbetsTitel() 
    {
      return arbetsTitel;
    }

    /**
     * setarbetsTitel metoden sätter
     * den anställdas arbetstitel.
     * @param arbetsTitel Anställdas arbetstitel.
     */
    public void setarbetsTitel(String arbetsTitel) 
    {
      this.arbetsTitel = arbetsTitel;
    }

    /**
     * getfNamn metoden returnerar
     * anställdas förnamn.
     * @return Anställdas förnamn.
     */
    public String getfNamn() 
    {
      return fNamn;
    }


    /**
     * setfNamn metoden sätter
     * den anställdas förnamn.
     * @param fNamn Anstäldas förnamn.
     */
    public void setfNamn(String fNamn) 
    {
      this.fNamn = fNamn;
    }

    /**
     * geteNamn metoden returnerar
     * anställdes efternamn.
     * @return  Anstäddas efternamn.
     */
    public String geteNamn() 
    {
      return eNamn;
    }

    /**
     * seteNamn metoden sätter
     * den anställdas efternamn.
     * @param eNamn Anställdas efternamn.
     */
    public void seteNamn(String eNamn) 
    {
      this.eNamn = eNamn;
    }

    /**
     * getstad metoden returnerar
     * anställdes angivna stad.
     * @return  Anställdas angivna stad.
     */
    public String getstad() 
    {
      return stad;
    }

    /**
     * setstad metoden sätter
     * den anställdas angivna stad.
     * @param stad Anställdas angivna stad.
     */
    public void setstad(String stad) 
    {
      this.stad = stad;
    }

    /**
     * getalder metoden returnerar
     * den anställdas ålder.
     * @return Anställdas ålder.
     */
    public int getalder() 
    {
      return alder;
    }

    /**
     * setalder metoden sätter
     * den ansäldas ålder
     * @param alder Anställdas ålder.
     */
    public void setalder(int alder) 
    {
      this.alder = alder;
    }

    /**
     * getlonPerTim metoden returnerar
     * den anställdas timlön.
     * @return Anställdas timlön.
     */
    public double getlonPerTim() 
    {
      return lonPerTim;
    }

    /**
     * setlonPerTim metoden sätter
     * den anställdas timlön.
     * @param lonPerTim Anställdas timlön.
     */
    public void setlonPerTim(double lonPerTim) 
    {
      this.lonPerTim = lonPerTim;
    }

    /**
     * gettimVecka metoden returnerar
     * den ansälldes timmar per vecka.
     * @return Anställdas arbetade tid per vecka.
     */
    public int gettimVecka() 
    {
      return timVecka;
    }

    /**
     * settimVecka metoden sätter
     * den Anställdas timmar per vecka.
     * @param timVecka Anställdas arbetade tid per vecka.
     */
    public void settimVecka(int timVecka) 
    {
      this.timVecka = timVecka;
    }

    /**
     * Override så att det 
     * sktivs ut på det sättet 
     * programmet är programerad att
     * skriva ut det på.
     */
 @Override
  public String toString() 
  {
      return
              "ID " + "\t\t" + employeID + 
                      "\nFör namn \t" + fNamn +
                     // " Efter Namn " + eNamn +
                      "\nArbetstitel \t" + arbetsTitel +
                      "\n---------------------";
                     // " Stad " + stad +
                     // " Ålder " + alder +
                     // " Lön per timme " + lonPerTim +
                     // " Timmar per veckan " + timVecka;
  }

       
}