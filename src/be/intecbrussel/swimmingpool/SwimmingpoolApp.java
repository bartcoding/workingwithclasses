package be.intecbrussel.swimmingpool;

public class SwimmingpoolApp {

    public static void main(String[] args) {

        Person person1 = new Person("Nikolaas", "Daem",25,false);
        Person person2 = new Person("Mick","Vdd",25,false);
        Person person3 = new Person("Suzy", "Zwemtnietgraag", 99,true);
        Person person4 = new Person();

        //configure person1
/*      person1.setFirstName("Nikolaas");
        person1.setLastName("Daem");
        person1.setAge(-26);
        person1.setChlorineIntolerance(false);
*/



        //print out properties of person 2
        person1.introduceYourSelf();
        person2.introduceYourSelf();
        person3.introduceYourSelf();
        person4.introduceYourSelf();

        //print out the first name of the first person
        //System.out.println(person1.getFirstName());
        person1.yearPasses();
        System.out.println("one year passes");
        person1.introduceYourSelf();

        System.out.println("ten years pass");
        person1.yearPasses(10);
        person1.introduceYourSelf();

        System.out.println("the genus of a person is: " + Person.GENUS);

        SwimmingpoolUtilities.introducePerson(person1);

        System.out.println("how many people where created?");
        System.out.println(Person.getNumberOfPeopleCreated());
    }

}
