import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> spook = new ArrayList<>();
        spook.add(new Student("Сергей","Бочкарев", "3", 3));
        spook.add(new Student("Валентина", "Петровская", "1", 5));
        spook.add(new Aspirant("Максим", "Смирнов", "2", 4));
        spook.add(new Aspirant("Елена", "Армаева", "5", 5));
        for (Student student : spook){
            student.getScholarship();
        }
    }
}
