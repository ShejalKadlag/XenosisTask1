
public class PersonDetails {
    String name;
    int age;

    // Constructor
    public PersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name + "\n Age: " + age);
    }

    public static void main(String[] args) {
        PersonDetails p1 = new PersonDetails("Sejal", 21);
        p1.displayDetails();
    }
}
