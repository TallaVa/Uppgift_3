package Examination_3;
/**
 * Examination 3 Employe list
 * 
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
   * andställdes ID
   * @return Värdet i employeID fältet.
   */
  public String getemployeID() 
    {
      return employeID;
    }

    /**
     * setemployeID metoden sätter 
     * den anställdas ID
     * @param employeID 
     */
    public void setemployeID(String employeID) 
    {
      this.employeID = employeID;
    }

    /**
     * getarbetsTitel metoden returnerar 
     * anställdes arbetsTiteln
     * @return Värdet i arbetsTitel
     */
    public String getarbetsTitel() 
    {
      return arbetsTitel;
    }

    /**
     * setarbetsTitel metoden sätter
     * den anställdas arbetstitel
     * @param arbetsTitel 
     */
    public void setarbetsTitel(String arbetsTitel) 
    {
      this.arbetsTitel = arbetsTitel;
    }

    /**
     * getfNamn metoden returnerar
     * anställdes Förnamn
     * @return
     */
    public String getfNamn() 
    {
      return fNamn;
    }

  public void setfNamn(String fNamn) 
    {
      this.fNamn = fNamn;
    }

  public String geteNamn() 
    {
      return eNamn;
    }

  public void seteNamn(String eNamn) 
    {
      this.eNamn = eNamn;
    }

  public String getstad() 
    {
      return stad;
    }

  public void setstad(String stad) 
    {
      this.stad = stad;
    }

  public int getalder() 
    {
      return alder;
    }

  public void setalder(int alder) 
    {
      this.alder = alder;
    }

  public double getlonPerTim() 
    {
      return lonPerTim;
    }

  public void setlonPerTim(double lonPerTim) 
    {
      this.lonPerTim = lonPerTim;
    }

  public int gettimVecka() 
    {
      return timVecka;
    }

  public void settimVecka(int timVecka) 
    {
      this.timVecka = timVecka;
    }

 @Override
  public String toString() 
  {
      return
              "ID " + "\t\t" + employeID + 
                      "\nFör namn \t" + fNamn +
                     // " Efter Namn " + eNamn +
                      "\nArbetstitel \t" + arbetsTitel;
                     // " Stad " + stad +
                     // " Ålder " + alder +
                     // " Lön per timme " + lonPerTim +
                     // " Timmar per veckan " + timVecka;
  }

       
}