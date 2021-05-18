package be.intecbrussel.swimmingpool;

/***
 * Person class
 *
 * This class defines a Person in our application
 *
 * the person in our application has a First name, a Last name, an age and ChlorineIntolerance
 */

public class Person {

    //public class variable that is unchangeable
    public static final String GENUS = "homo sapiens sapiens";
    //declare instance variables
    private String firstName = "anonymous";
    private String lastName = "anonymouson";
    private int age = 0;
    private boolean chlorineIntolerance = false;

    //declare class variables

    private static int numberOfCreatedPersons = 0;

    //initialisation code block
    {
        System.out.println("an initialisation code block is being called");

    }

    //define constructors
    public Person() {
        System.out.println("a new person is being constructed");
        numberOfCreatedPersons++;
    }

    public Person(String firstName, String lastName) {
        this();
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Person(String firstName, String lastName, int age, boolean chlorineIntolerance) {
        //call upon the no args constructor
        this(firstName,lastName);
        setAge(age);
        setChlorineIntolerance(chlorineIntolerance);
    }

    //define getter + setter methods
    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        } else {
            this.firstName = "anonymous";
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        } else {
            this.lastName = "anonymous";
        }
    }

    public void setChlorineIntolerance(boolean chlorineIntolerance) {
        this.chlorineIntolerance = chlorineIntolerance;
    }

    public void setAge(int age) {
        if (age < 150 && age > -1) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isChlorineIntolerance() {
        return chlorineIntolerance;
    }


    // define custom methods
    public void introduceYourSelf() {
        System.out.println("Hi everybody, I'm: " + firstName + " " + lastName);
        System.out.println("I hope you are all doing okay?");
        System.out.println("I'm " + age + " years old and am I intolerant to Chlorine?" + chlorineIntolerance);
    }

    public void yearPasses() {
        age++;
    }
    //age increases by the amount of years
    public void yearPasses(int amountOfYears) {
        age = age + amountOfYears;
    }

    //class methods
    public static int getNumberOfPeopleCreated(){

        return numberOfCreatedPersons;

    }

}
