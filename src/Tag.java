public class Tag
{
    private String termin;
    private int prioritaet;

    public Tag()
    {
        this.termin = null;
        this.prioritaet = 0;
    }

    public void eintragen(String was, int prioritaet)
    {
        this.termin = was;
        this.prioritaet = prioritaet;
    }


    public String getVerabredung()
    {
        return ((this.termin == null) ? null : this.termin);
    }


    public int getPrioritaet()
    {
        return ((this.termin == null) ? 0 : this.prioritaet);
    }

}
