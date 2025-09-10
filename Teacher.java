public class Teacher {
    private String subject;
    private String name;
    private double salary;
    private int age;

    //Constuctor
    public Teacher(String subject, String name, double salary, int age) {
        this.subject = subject;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    //Methods
    public void print() {
        System.out.println("Subject: " + subject);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        }
    //Getter and Setter
    public String getSubject() {
        return subject;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }
}