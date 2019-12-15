public class Kalender
{

    public Tag[] days =new Tag[365];
    public static void main(String[] args)
    {

        Jahr y2019 = new Jahr(2019);
        Jahr y2018 = new Jahr(2018);
        y2018.eintragen(45,"Klausur",1);
        y2019.eintragen(37,"Treffen",5);

        if(y2018.getTermin(17) == null){
            System.out.println("17. Tag ist frei");
        }
        else
        {
            System.out.println("17. Tag ist belegt");
        }
        if(y2018.getTermin(45) == null){
            System.out.println("45. Tag ist frei");
        }
        else
        {
            System.out.println("45. Tag ist belegt");
        }
        System.out.println("Belegte Tag insgesamt: " + (y2018.getBelegt()+y2019.getBelegt()));

    }
    public Kalender(){
        generateDays();
    }

    /**
     * Generates all the days in the calender
     */
    private void generateDays()
    {
        for (int i = 0; i < this.days.length; i++)
        {
            days[i] = new Tag();
        }
    }


}
