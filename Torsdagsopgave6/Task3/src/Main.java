import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> passedCourses1 = new ArrayList<>();
        passedCourses1.add("Java 1.0");

        ArrayList<String> canTeach1 = new ArrayList<>();
        canTeach1.add("Java 1.0");

        ArrayList<String> canTeach2 = new ArrayList<>();
        canTeach1.add("Java 1.1");




        Student student1 = new Student("Sofus", passedCourses1);
        Student student2 = new Student("Victor", passedCourses1);

        Teacher teacher1 = new Teacher("Tess", canTeach1);
        Teacher teacher2 = new Teacher("Jesper", canTeach1);
        Teacher teacher3 = new Teacher("Erik", canTeach2);


        ArrayList<Person> persons = new ArrayList<>();
        persons.add(student1);
        persons.add(student2);
        persons.add(teacher1);
        persons.add(teacher2);
        persons.add(teacher3);

        for (Person person : persons) {
            boolean result = person.addCourse("Java 1.0");
            if (!result) {
                if (person instanceof Student) {
                    System.out.println(person.getName() + " har allerede bestået dette kursus.");
                } else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " kan ikke undervise i dette fag.");
                }
            }
        }
    }
}