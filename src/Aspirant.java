public class Aspirant extends Student{
    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }
    public void getScholarship(){
        int SumStipendia;
        if (averageMark==5){
            SumStipendia=200;
        }
        else {
            SumStipendia=180;
        }
        System.out.println(SumStipendia + " р.");
    }

}
