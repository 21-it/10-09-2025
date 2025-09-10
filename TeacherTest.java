public class TeacherTest {
    public static void main(String[] args) {
        //Object Teacher
        Teacher teacher1 = new Teacher("Math", "Alice", 50000, 30);
        Teacher teacher2 = new Teacher("Science", "Bob", 55000, 40);

        System.out.println("=== Data Guru ===");
        teacher1.print();
        System.out.println("----------------");
        teacher2.print();
        System.out.println("----------------");
    }
}
