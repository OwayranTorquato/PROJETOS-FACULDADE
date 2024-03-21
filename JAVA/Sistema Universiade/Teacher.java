import java.util.List;
import java.util.ArrayList;

class Teacher extends Person {
    private String department;
    private List<Subject> taughtSubjects;

    public Teacher(String name, int age, String department) {
        super(name, age);
        this.department = department;
        this.taughtSubjects = new ArrayList<>();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Subject> getTaughtSubjects() {
        return taughtSubjects;
    }

    public void setTaughtSubjects(List<Subject> taughtSubjects) {
        this.taughtSubjects = taughtSubjects;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", department='" + department + '\'' +
                ", taughtSubjects=" + taughtSubjects +
                '}';
    }
}
