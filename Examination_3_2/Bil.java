package Examination_3_2;

public class Bil 
{
    private String regNr;
    private String marke;
    private String model;
    private int ortal;
    private int miltal;
    private char vexel;
    private String farg;
    private String drivmedel;
    private double pris;
    private String ovrigt;      
    
    /**
     * Konstruktor för alla fälten som ska användas.
     * @param regNr
     * @param marke
     * @param model
     * @param ortal
     * @param miltal
     * @param vexel
     * @param farg
     * @param drivmedel
     * @param pris
     * @param ovrigt
     */
    public Bil(String regNr, String marke, String model, int ortal, int miltal, char vexel, String farg,
                String drivmedel, double pris, String ovrigt)
    {
        this.regNr = regNr;
        this.marke = marke;
        this.model = model;
        this.ortal = ortal;
        this.miltal = miltal;
        this.vexel = vexel;
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
}

