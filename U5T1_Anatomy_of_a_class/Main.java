package U5T1_Anatomy_of_a_class;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Adam", "Jones");
        Person person2 = new Person("John", "Smith");

        person1.greeting(person2);

        System.out.println(person1.getCount());
        System.out.println(person2.getCount());



        person2.greeting(person1);

        System.out.println(person1.getCount());
        System.out.println(person2.getCount());



        Person person3 = new Person("Amy", "Jordan");
        person3.greeting(person2);

        System.out.println(person1.getCount());
        System.out.println(person2.getCount());
        System.out.println(person3.getCount());

        
    }
}
