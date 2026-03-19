package E_Person;

import java.util.ArrayList;

public class TeacherList {

    ArrayList<Teacher> TeacherList = new ArrayList<>();

    public void addTeacher(Teacher teacher) {
        TeacherList.add(teacher);
    }

    public void highest() {
        int a = 0;
        for (int i = 0; i < TeacherList.size(); i++) {
            if (TeacherList.get(i).getBaseSalary() > TeacherList.get(i + 1).getBaseSalary()) {
                a = i;
            }
        }
        System.out.print("highest: ");
        TeacherList.get(a).displayDetails();
    }
}
