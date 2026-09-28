
/**
 * Autobus.
 * 
 * @author (Moustafa Hamzah) 
 * @version (28.09.2026)
 */
public class Autobus
{
    private String kennzeichen;
    private int    sitzplatze;
    private boolean anhanger;
    
    public Autobus()
    {
        setKennzeichen("W-1234A");
        setSitzplatze(29);
        setAnhanger(false);
    }
    
    public Autobus(String neuKennzeichen, int neuSitzplatze, boolean neuAnhanger)
    {
        setKennzeichen(neuKennzeichen);
        setSitzplatze(neuSitzplatze);
        setAnhanger(neuAnhanger);
    }
    
    public String getKenzeichen()
    {
        return kennzeichen;
    }
    
    public int getSitzplatze()
    {
        return sitzplatze;
    }
    
    public boolean getAnhanger()
    {
        return anhanger;
    }

    public void setKennzeichen(String neuKennzeichen)
    {
        kennzeichen = neuKennzeichen;
    }
    
    public void setSitzplatze(int neuSitzplatze)
    {
        sitzplatze = neuSitzplatze;
    }
    
    public void setAnhanger(boolean neuAnhanger)
    {
        anhanger = neuAnhanger;
    }
}