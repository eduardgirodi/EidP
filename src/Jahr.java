public class Jahr
{
    public Kalender calender;
    private int year;
    private int totalAppointments = 0;

    public Jahr(int year)
    {
        this.year = year;
        this.calender = new Kalender();
    }


    public void eintragen(int tag, String was, int prioritaet){
        if(this.calender.days[tag-1].getVerabredung() == null){
            this.calender.days[tag-1].eintragen(was,prioritaet);
            this.totalAppointments++;
        }
        else
        {
            System.out.println("Fehler: " + this.calender.days[tag-1].getVerabredung());
        }
    }

    public String getTermin(int Tag)
    {
        String appointment = this.calender.days[Tag-1].getVerabredung();

        return ((appointment==null) ? null : appointment);
    }
    public int getPrioritaet(int Tag){
        return this.calender.days[Tag-1].getPrioritaet();
    }

    public int getBelegt(){
        return totalAppointments;
    }
}
