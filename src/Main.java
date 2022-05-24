import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
/***************************ABC Example********************************/
        C c = new C();

        c.a();;
        c.b();
        c.c();
        /**********************Person and Student Example*****************************************/

        Person person =new Person("Mahi", "9520 Stoney Glen Dr.");
        Person person2 =new Person("David", "1919 Manhattan Rd.");

        System.out.println(person);
        System.out.println(person2);

        Student student = new Student("Feven", "1529 Cold Creek PL");
        Student student2 = new Student("Robel", "6381 Hollywood Blvd. Los Angeles 90028");

        System.out.println(student);
        System.out.println("Study credits " + student.credits());
        student.study();
        System.out.println("Study credits " + student.credits());

        System.out.println(student2);
        System.out.println("Study Credits " + student2.credits());
        student2.study();
        System.out.println("Study credits " + student2.credits());

        /***************************************Teacher***********************************/
        Teacher ada = new Teacher("Ada", "24 Maddox St. London W1S 2QN", 1200.0);
        Teacher eko = new Teacher("Eko", "Mannerheimintie 15 00100 Helsinki", 5400);

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        int i = 0;
        while (i < 25) {
            ollie.study();
            i = i + 1;
        }

        System.out.println(ada);
        System.out.println(eko);
        System.out.println(ollie);


        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);

        /*****************************WareHouse*******************************/
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToWarehouse(1.0);
        System.out.println(juice);  // Juice: balance = 989.7, space left 10.299999999999955

        /*****************************Box***************************************/
        MisplacingBox box = new MisplacingBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
    }


    /************************Person Method************************************************/

    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }}
}




