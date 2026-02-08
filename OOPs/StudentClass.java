package OOPs;

public class StudentClass {
    public static class Student{
        String name;
        int rollno;
        double percentage;
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Shayab";
        s1.rollno = 87;
        s1.percentage = 80.5;

        System.out.println(s1.name+"  "+s1.rollno+"  "+s1.percentage);

        Student s2 = new Student();
        s2.name = "Rahman";
        s2.rollno = 100;
        s2.percentage = 96.5;
        System.out.println(s2.name+" "+s2.rollno+" "+s2.percentage);

    }
}
