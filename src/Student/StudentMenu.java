package Student;

public class StudentMenu {
    private String studentId;
    private String studentName;
    private String studentDept;

    public StudentMenu(String studentDept,String studentId, String studentName) {
        this.studentDept = studentDept;
        this.studentId=studentId;
        this.studentName=studentName;
    }

    public String getStudentDept() {
        return studentDept;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}
