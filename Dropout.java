

/**
 * The Dropout class is a subclass of Student class
 *
 * @author (Mausam Rai)
 * @version (4th May, 2023)
 */
public class Dropout extends Student
{
    // instance variables - replace the example below with your own
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private boolean hasPaid;

    /**
     * Constructor for objects of class Dropout
     */

    public Dropout(String dateOfBirth, String studentName, int courseDuration, int tuitionFee, int numOfRemainingModules, int numOfMonthsAttended, String dateOfDropout, String dateOfEnrollment, String courseName, int enrollmentID)
    {
        // initialise instance variables

        super(dateOfBirth, studentName, courseDuration, tuitionFee);
        super.setcourseName(courseName);  //calling a mutator method of super class constructor
        super.setdateOfEnrollment(dateOfEnrollment);
        super.setenrollmentID(enrollmentID);
        this.numOfRemainingModules = numOfRemainingModules;
        this.numOfMonthsAttended = numOfMonthsAttended;
        this.dateOfDropout = dateOfDropout;
        this.remainingAmount = 0;
        this.hasPaid = false;
    }

    /**
     * Gets the number of remaining modules.
     *
     * @return the number of remaining modules.
     */

    public int getnumOfRemainingModules()
    {
        return this.numOfRemainingModules;
    }

    /**
     * Gets the number of months attended.
     *
     * @return the number of months attended.
     */

    public int getnumOfMonthsAttended()
    {
        return this.numOfMonthsAttended;
    }

    /**
     * Gets the date of drop out.
     *
     * @return the date of drop out.
     */

    public String getdateOfDropout() 
    {
        return this.dateOfDropout;
    }

    /**
     * Gets the number of remaining amount.
     *
     * @return the number of remaining amount.
     */

    public int getremainingAmount()
    {
        return this.remainingAmount;
    }

    /**
     * Gets the value of has paid.
     *
     * @return the value of has paid.
     */

    public boolean gethasPaid()
    {
        return this.hasPaid;
    }
    // Calculate the remaining amount based on the difference between the course duration and the number of months attended
    public void billsPayable() 
    {
        remainingAmount = ( (super.getcourseDuration()) - this.numOfMonthsAttended) * super.gettuitionFee(); 
        if(remainingAmount == 0){
            this.hasPaid = true;
        }

    }

    public void removeStudent()
    {
        // date of birth, coursename, student name, date of enrollment, course duration, tuition fee and date of drop out
        // enrollment id, number of remaining modules, number of months attended and remaining amount to 0
        if (this.hasPaid == true) 
        {
            super.setdateOfBirth("");
            super.setcourseName("");
            super.setstudentName("");
            super.setdateOfEnrollment("");
            super.setcourseDuration(0);
            super.settuitionFee(0);
            dateOfDropout = "";
            super.setenrollmentID(0);
            numOfRemainingModules = 0;
            numOfMonthsAttended = 0;
            remainingAmount = 0;
        } 
        else 
        {
            System.out.println("All Bills not cleared.");
        }
    }

    public void display() 
    {
        super.display();
        System.out.println("Number of remaining modules: " + getnumOfRemainingModules());
        System.out.println("Number of months attended: " + getnumOfMonthsAttended());
        System.out.println("Dropout date: " + getdateOfDropout());
        System.out.println("Remaining amount: " + getremainingAmount());
    }
}