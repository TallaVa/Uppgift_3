package Examination_3;
/**
 * Examination 3 Employe list
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

  public Employe(String employeID, String arbetsTitel, String fNamn, String eNamn, String stad, int alder,
                  double lonPerTim, int timVecka) 
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
//    public Employee(){}

  public String getemployeID() 
    {
      return employeID;
    }

  public void setemployeID(String employeID) 
    {
      this.employeID = employeID;
    }

  public String getarbetsTitel() 
    {
      return arbetsTitel;
    }

  public void setarbetsTitel(String arbetsTitel) 
    {
      this.arbetsTitel = arbetsTitel;
    }

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

 // @Override
  public String toString() 
  {
      return
              "ID " + employeID +
                      " För Namn " + fNamn +
                      " Efter Namn " + eNamn +
                      " Arbetstitel " + arbetsTitel +
                      " Stad " + stad +
                      " Ålder " + alder +
                      " Lön per timme " + lonPerTim +
                      " Timmar per veckan " + timVecka;
  }

       
 }