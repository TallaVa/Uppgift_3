package Examination_3;
/**
 * Examination 3 Employe list
 */

 public class Employe
 {
  private String emplyerId;
  private String jobTitle;
  private String firstName;
  private String lastName;
  private String stad;
  private int alder;
  private double lonPerTim;
  private int hourWeek;

  public Employe(String emplyerId, String jobTitle, String firstName, String lastName, String stad, int alder,
                  double lonPerTim, int hourWeek) {
      this.emplyerId = emplyerId;
      this.jobTitle = jobTitle;
      this.firstName = firstName;
      this.lastName = lastName;
      this.stad = stad;
      this.alder = alder;
      this.lonPerTim = lonPerTim;
      this.hourWeek = hourWeek;
  }
//    public Employee(){}

  public String getEmplyerId() 
    {
      return emplyerId;
    }

  public void setEmplyerId(String emplyerId) 
    {
      this.emplyerId = emplyerId;
    }

  public String getJobTitle() 
    {
      return jobTitle;
    }

  public void setJobTitle(String jobTitle) 
    {
      this.jobTitle = jobTitle;
    }

  public String getFirstName() 
    {
      return firstName;
    }

  public void setFirstName(String firstName) 
    {
      this.firstName = firstName;
    }

  public String getLastName() 
    {
      return lastName;
    }

  public void setLastName(String lastName) 
    {
      this.lastName = lastName;
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

  public int getHourWeek() 
    {
      return hourWeek;
    }

  public void setHourWeek(int hourWeek) 
    {
      this.hourWeek = hourWeek;
    }

  @Override
  public String toString() 
  {
      return
              "ID " + emplyerId +
                      " FIRST NAME " + firstName +
                      " LAST NAME " + lastName +
                      " JOB TITLE " + jobTitle +
                      " stad " + stad +
                      " alder " + alder +
                      " PAY/H " + lonPerTim +
                      " H/WEEK " + hourWeek;
  }

       
 }