package HW17;

public class Students {
    String name;
    int mathGrade;
    int englishGrade;
    int javaGrade;

    public Students(String name, int mathGrade, int englishGrade, int javaGrade) {
        this.name = name;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.javaGrade = javaGrade;
    }

    void averageGrade(){
        int result =(mathGrade+englishGrade+javaGrade)/3;
        System.out.println(name+" average mark: "+result);


    }
}
