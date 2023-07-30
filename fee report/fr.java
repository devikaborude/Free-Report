import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private String name;
    private double feeAmount;

    public Student(int id, String name, double feeAmount) {
        this.id = id;
        this.name = name;
        this.feeAmount = feeAmount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getFeeAmount() {
        return feeAmount;
    }
}

public class FeeReport {
    private List<Student> students;

    public FeeReport() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void generateReport() {
        System.out.println("Fee Report:");
        System.out.println("-----------------------------------------------------");
        System.out.println("Student ID\tStudent Name\t\tFee Amount");
        System.out.println("-----------------------------------------------------");

        for (Student student : students) {
            System.out.printf("%-10d\t%-20s\t%.2f%n", student.getId(), student.getName(), student.getFeeAmount());
        }

        System.out.println("-----------------------------------------------------");
    }

    public static void main(String[] args) {
        FeeReport feeReport = new FeeReport();

        // Adding sample student data
        feeReport.addStudent(new Student(1001, "John Doe", 1500.00));
        feeReport.addStudent(new Student(1002, "Jane Smith", 2000.00));
        feeReport.addStudent(new Student(1003, "Bob Johnson", 1800.00));

        // Generating the report
        feeReport.generateReport();
    }
}
