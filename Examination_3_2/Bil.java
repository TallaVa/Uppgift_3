package Examination_3_2;

public class Bil 
{
    private String regNr;
    private String marke;
    private String model;
    private int artal;
    private int miltal;
    private String vaxel;
    private String farg;
    private String drivmedel;
    private double pris;
    private String ovrigt;      
    
    /**
     * Konstruktor för alla fälten som ska användas.
     * @param regNr
     * @param marke
     * @param model
     * @param artal
     * @param miltal
     * @param vaxel
     * @param farg
     * @param drivmedel
     * @param pris
     * @param ovrigt
     */
    public Bil(String regNr, String marke, String model, int artal, int miltal, String vaxel, String farg,
                String drivmedel, double pris, String ovrigt)
    {
        this.regNr = regNr;
        this.marke = marke;
        this.model = model;
        this.artal = artal;
        this.miltal = miltal;
        this.vaxel = vaxel;
        this.farg = farg;
        this.drivmedel = drivmedel;
        this.pris = pris;
        this.ovrigt = ovrigt;
    }

    /**
     * getregNr metoden returnerar
     * bilens regnummer.
     * @return Bilens registreringsnummer.
     */
    public String getregNr()
    {
        return regNr;
    }

    /**
     * setregNr metoden används för att
     * registrera registreringsnummret som 
     * användaren anger.
     * @param regNr Bilens registreringsnummer.
     */
    public void setregNr(String regNr)
    {
        this.regNr = regNr;
    }

    /**
     * getmarke metoden returnerar
     * bilens fabrikat.
     * @return bilens fabrikat/märke.
     */
    public String getmarke()
    {
        return marke;
    }

    /**
     * setmarke metoden används för att 
     * registrera fabrikat/märket på bilen.
     * @param marke bilens fabrikat/märke.
     */
    public void setmarke(String marke)
    {
        this.marke = marke;
    }

    /**
     * getmodel metoden returnerar
     * bilens model.
     * @return Bilens model.
     */
    public String getmodel()
    {
        return model;
    }

    /**
     * setmodel metoden används för att
     * registrera model på bilen.
     * @param model Bilens märke.
     */
    public void setmodel(String model)
    {
        this.model = model;
    }

    /**
     * getartal metoden returnerar
     * bilens årtal.
     * @return Bilens årtal.
     */
    public int getartal()
    {
        return artal;
    }

    /**
     * setartal metoden sätter årtal
     * på bilen.
     * @param artal Bilens årtal.
     */
    public void setartal(int artal)
    {
        this.artal = artal;
    }

    /**
     * getmiltal metoden returnerar
     * bilens miltal.
     * @return Bilens miltal.
     */
    public int getmiltal()
    {
        return miltal;
    }

    /**
     * setmiltal metoden sätter miltal
     * på bilen.
     * @param miltal Bilens miltal
     */
    public void setmiltal(int miltal)
    {
        this.miltal = miltal;
    }

    /**
     * getvaxel returnerar om bilen
     * har en manuel växellåda eller automatisk
     * @return Bilens växellåda.
     */
    public String getvaxel()
    {
        return vaxel;
    }

    /**
     * setvaxel metoden sätter vilken
     * växellåda bilen har.
     * @param vaxel Bilens växellåda
     */
    public void setvaxel(String vaxel)
    {
        this.vaxel = vaxel;
    }

    /**
     * getfarg metoden returnerar
     * bilens färg
     * @return Bilens färg.
     */
    public String getfarg()
    {
        return farg;
    }

    /**
     * setfarg metoden sätter 
     * bilens färg
     * @param farg Bilens färg.
     */
    public void setfarg(String farg)
    {
        this.farg = farg;
    }

    /**
     * getdrivmedel returnerar bilens
     * drivemedel.
     * @return Bilens drivmedel.
     */
    public String getdrivmedel()
    {
        return drivmedel;
    }

    /**
     * setdrivmedel metoden sätter bilens
     * drivmedel.
     * @param drivmedel Bilens drivmedel.
     */
    public void setdrivmedel(String drivmedel)
    {
        this.drivmedel = drivmedel;
    }

    /**
     * getpris returnerar bilens 
     * pris.
     * @return Bilens pris.
     */
    public double getpris()
    {
        return pris;
    }

    /**
     * setpris metoden sätter priset
     * på bilen.
     * @param pris Bilens pris.
     */
    public void setpris(double pris)
    {
        this.pris = pris;
    }
    
    /**
     * getovrigt returenerar en string
     * där man kan lägga till övrig information.
     * @return Övrig information.
     */
    public String gerovrigt()
    {
        return ovrigt;
    }

    /**
     * setovrigt metoden sätter 
     * övrigt information om bilen.
     * @param ovrigt Övrig information.
     */
    public void setovrigt(String ovrigt)
    {
        this.ovrigt = ovrigt;
    }

    public double getRabattpris()
    {
       return pris*0.90;
    }

    /**
     * Struktur för utskrift
     */
    @Override
    public String toString()
    {
        return   "Regnr     : " + "\t\t" + regNr
                +"\nMärke     : " + "\t\t" + marke
                +"\nModel     : " + "\t\t" + model
                +"\nÅrtal     : " + "\t\t" + artal
                +"\nMiltal    : " + "\t\t" + miltal
                +"\nM/A       : " + "\t\t" + vaxel
                +"\nFärg      : " + "\t\t" + farg
                +"\nDrivmedel : " + "\t\t" + drivmedel
                +"\nPris      : " + "\t\t" + String.format("%.2f", pris)  + " kr"
                +"\nÖvrigt    : " + "\t\t" + ovrigt + "\n"; 
    }

}

