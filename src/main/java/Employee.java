public class Employee {
    public String id;
    public String firstName;
    public String lastName;
    public String country;
    public String age;

    public Employee() {
    }

    public Employee(String id, String firstName, String lastName, String country, String age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                '}';
    }
}
