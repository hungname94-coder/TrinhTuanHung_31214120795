package E_Person;

import java.util.ArrayList;

public class PersonList {

    ArrayList<Person> PersonList = new ArrayList<>();
//    ArrayList<Teacher> TeacherList = new ArrayList<>();

    public void addPerson(Person person) {
        PersonList.add(person);
    }

//    public void addTeacher(Teacher teacher) {
//        TeacherList.add(teacher);
//    }

    public void updatePerson(String id) {
        for (int i = 0; i < PersonList.size(); i++) {
            if (PersonList.get(i).getId().equals(id)) {
                PersonList.get(i).updatePerson();
                return;
            }
        }
        System.out.print("id ko tim thay");
    }

    public void deletePersonById(String id) {
        if (PersonList.isEmpty()) {
            System.out.println("0 Person");
            return;
        }
        for (int i = 0; i < PersonList.size(); i++) {
            if (PersonList.get(i).getId().equals(id)) {
                PersonList.remove(i);
                return;
            }
        }
        System.out.println("ko tim thay id: " + id);
    }

    public void findPersonById(String id) {
        for (int i = 0; i < PersonList.size(); i++) {
            if (PersonList.get(i).getId().equals(id)) {
                PersonList.get(i).displayDetails();
                return;
            }
        }
        System.out.println("ko tim thay id: " + id);
    }

    public void displayAll() {
        for (Person person : PersonList) {
            person.displayDetails();
        }
    }

//    public void highest() {
//        int a = 0;
//        for (int i = 0; i < TeacherList.size(); i++) {
//            if (TeacherList.get(i).getBaseSalary() > TeacherList.get(i + 1).getBaseSalary()) {
//                a = i;
//            }
//        }
//        System.out.print("highest: ");
//        TeacherList.get(a).displayDetails();
//    }
}
