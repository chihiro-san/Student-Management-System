

/**
 * The Regular class is a subclass of Student class and has four attributes: numOfModules, numOfCreditHours, daysPresent, isGrantedScholarship
 *
 * @author (Mausam Rai)
 * @version (4th May, 2023)
 */
public class Regular extends Student
{
    // instance variables
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship;

    /**
     * Constructor for objects of class Regular
     */

    public Regular(String dateOfBirth, String studentName, int courseDuration, int tutionFee,int numOfModules, int numOfCreditHours, double daysPresent, String dateOfEnrollment, String courseName, int enrollmentID)
    {
        // initialise instance variables

        super(dateOfBirth, studentName, courseDuration, tutionFee);   //calling a super class constructor
        super.setcourseName(courseName);    //calling a mutator method of super class constructor
        super.setdateOfEnrollment(dateOfEnrollment);
        super.setenrollmentID(enrollmentID);
        this.numOfModules = numOfModules;
        this.numOfCreditHours = numOfCreditHours;
        this.daysPresent = daysPresent;
        this.isGrantedScholarship = false;
    }

    /**
     * Gets the number of modules.
     *
     * @return the number of modules.
     */

    public int getnumOfModules()
    {
        return this.numOfModules;
    }

    /**
     * Gets the number of credit hours.
     *
     * @return the number of credit hours.
     */

    public int getnumOfCreditHours() 
    {
        return this.numOfCreditHours;
    }

    /**
     * Gets the number of days present.
     *
     * @return the number of days present.
     */

    public double getdaysPresent() 
    {
        return this.daysPresent;
    }

    /**
     * Gets the value of is granted scholarship.
     *
     * @return the value of is granted scholarship.
     */

    public boolean getisGrantedScholarship()
    {
        return this.isGrantedScholarship;
    }

    /**
     * Sets the value of the daysPresent.
     */

    public void setdaysPresent(double daysPresent) 
    {
        this.daysPresent = daysPresent;
    }

    /**

     *Calculates the present percentage based on the given number of days present and determines the scholarship eligibility.
     *@param daysPresent The number of days present
     *@return attendance grade message ('A', 'B', 'C', 'D', or 'E')
     */
    public char presentPercentage(double daysPresent)
    {
        double presentPercentage = (daysPresent / (super.getcourseDuration() ) ) * 100; 
        char message;

        if( (super.getcourseDuration() ) < daysPresent) 
        {
            System.out.println("invalid input: courseDuration cannot be less than days present");
        }

        if (presentPercentage >= 80 && presentPercentage <= 100)
        {
            message = 'A';
            this.isGrantedScholarship = true;
        }

        else if (presentPercentage < 80 && presentPercentage >=60) 
        {
            message = 'B';
            this.isGrantedScholarship = false;
        }

        else if (presentPercentage < 60 && presentPercentage >=40) 
        {
            message = 'C';
            this.isGrantedScholarship = false;
        } 

        else if (presentPercentage < 40 && presentPercentage >=20) 
        {
            message = 'D';
            this.isGrantedScholarship = false;
        } 
        else 
        { 
            message = 'E';
            this.isGrantedScholarship = false;
        }    
        return message;
    }

    /**
     *Displays the student's information and whether the scholarship has been granted.
     */
    public void grantCertificate(String courseName, int enrollmentID, String dateOfEnrollment) 
    {
        System.out.print(super.getstudentName() + " has graduated from " + super.getcourseName() + " with enrollment ID " + super.getenrollmentID() + " and enrollment date " + super.getdateOfEnrollment() + ".");

        if (this.isGrantedScholarship == true) 
        {
            System.out.print(" The scholarship has been granted.");
        }

    }

    public void display()
    {
        super.display();  // call the display method of the Student class
        System.out.println("Number of modules: " + getnumOfModules());
        System.out.println("Number of credit hours: " + getnumOfCreditHours());
        System.out.println("Days present: " + getdaysPresent());
    }
}


