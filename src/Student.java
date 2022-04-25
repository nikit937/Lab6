public class Student {
    String firstName, lastName, group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public void getScholarship(){
        int SumStipendia;
        if (averageMark==5){
            SumStipendia=100;
        }
        else {
            SumStipendia=80;
        }
        System.out.println(SumStipendia + " р.");
    }
}
