package laboratorium1;

import io.vavr.collection.List;

public class StudentService {
    List<Student> students = List.empty();
    public List<Student> getStudents(){
        return this.students;
    }
    public Student addStudent(NewStudent student){
        Student created = new Student(students.size() +1, student.name, student.number, student.section);
        students=students.prepend(created);
        return created;
    }
}
