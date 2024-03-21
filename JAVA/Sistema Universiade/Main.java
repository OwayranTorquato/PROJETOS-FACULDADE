import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
         //Criando objeto da classe Teacher.
         Teacher teacher1 = new Teacher("Fernando", 35, "Computer Science");

        //Criando lista de cursos oferecidos;
        List <Subject> offeredSubjects = new ArrayList<>();

        //Adicionando Disciplinas oferecidas
        offeredSubjects.add(new Subject("Java Programing", "JV01", 80, teacher1,new ArrayList<>()));
        offeredSubjects.add(new Subject("Database Management", "CS102", 35, teacher1, new ArrayList<>()));

        //Criando uma lista de estudantes matriculados
        List<Student> enrolledStudents = new ArrayList<>();
        enrolledStudents.add(new Student("Owayran", 25, "154422", new ArrayList<>(), new ArrayList<>(), new ArrayList<>()));
        enrolledStudents.add(new Student("Maria", 23, "154423", new ArrayList<>(), new ArrayList<>(), new ArrayList<>()));

        //Criando objeto da classe course1
        Course course1 = new Course("Computer Science", 40, offeredSubjects, enrolledStudents);
        
        // teste para exibir informações
        System.out.println("course1 Name: " + course1.getName());
        System.out.println("course1 Duration: " + course1.getDuration() + " years");
        System.out.println("Offered Subjects:");
        for (Subject subject : course1.getOfferedSubjects()) {
            System.out.println("- " + subject.getName() + " (" + subject.getCode() + ")");
        }
        System.out.println("Enrolled Students:");
        for (Student student : course1.getEnrolledStudents()) {
            System.out.println("- " + student.getName() + " (Registration Number: " + student.getRegistrationNumber() + ")");
        }

        
        
    }
}
