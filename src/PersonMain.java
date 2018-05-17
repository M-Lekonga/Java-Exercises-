import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {

    public static boolean searchList(ArrayList<Person> obj) {
        String name;
        System.out.println("\n Please Enter Person Name!\n");
        Scanner sc = new Scanner(System.in);
        //I was tempting to add a validator to display not a name when you enter a number//
        while (!sc.hasNext()) {
            System.out.println("That's not a Name!");
            sc.next();
        }
        name = sc.nextLine();

        for (int i = 0; i < obj.size(); i++) {
            if (obj.get(i).getName().equals(name)) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        System.out.println("Welcome to ML Company! Here is a list of our Client.\n");
        Person person1 = new Person("Ruth", 20, "Junior dev");
        Person person2 = new Person("Grace", 23, "Teacher");
        Person person3 = new Person("Tom", 27, "Dev");
        Person person4 = new Person("Peter", 25, "BA");
        Person person5 = new Person("Emily", 21, "Student");
        Person person6 = new Person("Chris", 26, "Consultant");
        Person person7 = new Person("Kate", 23, "Junior Doctor");
        Person person8 = new Person("Dave", 19, "Sales Advisor");
        Person person9 = new Person("Junior", 23, "Account Manager");
        Person person10 = new Person("Becky", 22, "Prime Minister");
        Person person11 = new Person("Harry", 27, "Full stack dev");
        Person person12 = new Person("Greg", 19, "President");
        Person person13 = new Person("Karen", 35, "CEO");
        Person person14 = new Person("Pedro", 30, "IT BA");
        Person person15 = new Person("Conor", 21, "Manager");
        Person person16 = new Person("Daniel", 22, "IT Consultant");
        Person person17 = new Person("Khloe", 23, "Hairdresser");
        Person person18 = new Person("Danielle", 18, "Student ");
        Person person19 = new Person("Julia", 23, "Student");
        Person person20 = new Person("Billy", 37, "Gamer");


        ArrayList<Person> obj = new ArrayList<Person>();

        obj.add(person1);
        obj.add(person2);
        obj.add(person3);
        obj.add(person4);
        obj.add(person5);
        obj.add(person6);
        obj.add(person7);
        obj.add(person8);
        obj.add(person9);
        obj.add(person10);
        obj.add(person11);
        obj.add(person12);
        obj.add(person13);
        obj.add(person14);
        obj.add(person15);
        obj.add(person16);
        obj.add(person17);
        obj.add(person18);
        obj.add(person19);
        obj.add(person20);

        for (Person i : obj) {
            System.out.println(i);
        }
        System.out.println(searchList(obj));

    }

}

