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
  private String city;
  private int age;
  private double hourPay;
  private int hourWeek;

  public Employe(String emplyerId, String jobTitle, String firstName, String lastName, String city, int age,
                  double hourPay, int hourWeek) {
      this.emplyerId = emplyerId;
      this.jobTitle = jobTitle;
      this.firstName = firstName;
      this.lastName = lastName;
      this.city = city;
      this.age = age;
      this.hourPay = hourPay;
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

  public String getCity() 
    {
      return city;
    }

  public void setCity(String city) 
    {
      this.city = city;
    }

  public int getAge() 
    {
      return age;
    }

  public void setAge(int age) 
    {
      this.age = age;
    }

  public double getHourPay() 
    {
      return hourPay;
    }

  public void setHourPay(double hourPay) 
    {
      this.hourPay = hourPay;
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
                      " CITY " + city +
                      " AGE " + age +
                      " PAY/H " + hourPay +
                      " H/WEEK " + hourWeek;
  }

       
 }