package U5T1_Anatomy_of_a_class;

public class Person {
    private String firstName;
    private String lastName;
    private int count;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        count = 0;
    }

    public String getFirstName() {
        return firstName;
    } 

    public String getLastName() {
        return lastName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int newCount) {
        count = newCount;
    }

    public void greeting (Person person2) {
        String greeting = "Hello, my name is " + firstName + "\n";
        greeting += "Hi, my name is " + person2.getFirstName();
        System.out.println(greeting);
        count++;
        person2.setCount(person2.getCount() + 1);
    }
}
