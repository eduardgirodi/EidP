package UA10;

/**
 * @Author Dominique Köstler
 */

public class Studierender
{
    private String firstName;
    private String lastName;
    private int matrikelNummer;
    private float[] grades = new float[1];
    private float average;
    private int availableArrayIndex = 0;

    public Studierender(String firstName, String lastName, int matrikelNummer){
        this.firstName = firstName;
        this.lastName = lastName;
        this.matrikelNummer = matrikelNummer;
    }

    public static void main(String[] args)
    {
        Studierender s1 = new Studierender("Willi", "Winzig", 123456);
        Studierender s2 = new Studierender("Helga", "Hurtig", 123457);

        s1.neueNote(3.0F);
        s1.neueNote(2.3F);
        s2.neueNote(1.3F);

        System.out.println(s1);
        System.out.println(s2);
    }
    public void neueNote(float note){
        this.grades[availableArrayIndex] = note;
        this.grades = increaseArraySizeBy1AndPopulate(this.grades);
        this.availableArrayIndex++;
        this.average = getNotendurchschnitt();
    }

    public float getNotendurchschnitt(){
        int totalGrades = (this.grades.length-1);
        if(totalGrades == 1) return this.grades[0];
        float sum=0;
        for (int i = 0; i < totalGrades; i++)
        {
         sum += this.grades[i];
        }
        return sum/totalGrades;
    }
    public String toString(){
        String output = "Name: " + this.firstName + " " + this.lastName + " , Matr. Nr.:  "+ this.matrikelNummer +", " +
                "Ergebnisse: ";
        //Minus one because everytime we preemptively increase the array 
        //length we create an entry with 0.0 which has an effect on the average
        for (int i = 0; i < this.grades.length -1; i++) 
        {
            output += this.grades[i] +" ";
        }
        output +=", Notendurschnitt: " +this.average;
        return output;
    }
    private float[] increaseArraySizeBy1AndPopulate(float[] array){
        int newSize = array.length +1;
        float[] newArray = new float[newSize];
        for (int i = 0; i < array.length; i++)
        {
            newArray[i] = array[i];
        }
        return newArray;
    }

}
