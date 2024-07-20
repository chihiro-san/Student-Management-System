

/**
 * This class name Student has seven attributes, which corresponds to enrollmentID, dateOfBirth, courseName, studentName, dateOfEnrollement, 
courseDuration, tuitionFee 
 * @author (Mausam Rai)
 * @version (4th May, 2023)
 */
public class Student
{

    //instance/attributes variables
    private int enrollmentID = 0;
    private String dateOfBirth;
    private String courseName = "";
    private String studentName;
    private String dateOfEnrollment = "";
    private int courseDuration;
    private int tuitionFee; 

    /**
     * *Constructor for objects of class Student
     * 
     * @parameter dateOfBirth The DOB of  the student.
     * @parameter studentName The name of  the student.
     * @parameter courseDuration The teaching duration of  the course.
     * @parameter tuitionFee The  price student pay for study.
     */

    public Student(String dateOfBirth, String studentName, int courseDuration, int tuitionFee) // Parameterized Constructor 
    {
        this.dateOfBirth = dateOfBirth; //this keyword refers to the current object in a method or constructor
        this.studentName = studentName;
        this.courseDuration = courseDuration;
        this.tuitionFee = tuitionFee;
       
    }

    /**
     * Gets the dateOfBirth of the student.
     *
     * @return the date of birth of student.
     */

    public String getdateOfBirth()
    {
        return this.dateOfBirth;
    }

    /**
     * Gets the name of the student.
     *
     * @return the name of student.
     */

    public String getstudentName()
    {
        return this.studentName;
    }

    /**
     * Gets the value of course duration.
     *
     * @return the value of course duration.
     */

    public int getcourseDuration()
    {
        return this.courseDuration;
    }

    /**
     * Gets the value of tuition fee.
     *
     * @return the value of tuition fee.
     */

    public int gettuitionFee()
    {
        return this.tuitionFee;
    }

    /**
     * Gets the name of the courses.
     *
     * @return the name of courses.
     */

    public String getcourseName()
    {
        return this.courseName;
    }

    /**
     * Gets the date of enrollment.
     *
     * @return the date of enrollment.
     */

    public String getdateOfEnrollment()
    {
        return this.dateOfEnrollment;
    }

    /**
     * Gets the enrollment id of the student.
     *
     * @return the enrollment id of student.
     */

    public int getenrollmentID()
    {
        return this.enrollmentID;
    }

    /**
     * Sets the value of the dateOfBirth.
     */

    public void setdateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Sets the value of the studentName.
     */

    public void setstudentName(String studentName)
    {
        this.studentName = studentName;
    }

    /**
     * Sets the value of the tuitionFee.
     */

    public void settuitionFee(int tuitionFee)
    {
        this.tuitionFee = tuitionFee;
    }

    /**
     * Sets the value of the courseDuration.
     */

    public void setcourseDuration(int courseDuration)
    {
        this.courseDuration = courseDuration;
    }

    /**
     * Sets the value of the courseName.
     */

    public void setcourseName(String courseName)
    {
        this.courseName = courseName;
    }

    /**
     * Sets the value of the dateOfEnrollment.
     */

    public void setdateOfEnrollment(String dateOfEnrollment)
    {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    /**
     * Sets the value of the enrollmentID.
     */

    public void setenrollmentID(int enrollmentID)
    {
        this.enrollmentID = enrollmentID;
    }

    //simulate the priniting of student deatils
    public void display()
    {

        if (dateOfBirth == "" || studentName == "" || courseDuration == 0 || tuitionFee == 0 || courseName == "" || dateOfEnrollment == "" || enrollmentID == 0) 
        {
            System.out.println("Error: One or more parameters are not set.");
        } 
        else 
        {
            System.out.println("The date of birth is: " + getdateOfBirth());
            System.out.println("The student name is: " + getstudentName());
            System.out.println("The course duration is: " + getcourseDuration());
            System.out.println("The tuition fee is: " + gettuitionFee());
            System.out.println("The course name is: " + getcourseName());
            System.out.println("The date of enrollment is: " + getdateOfEnrollment());
            System.out.println("The enrollment id is: " + getenrollmentID());
        }
    }
}

