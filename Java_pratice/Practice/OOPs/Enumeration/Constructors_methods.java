package Practice.OOPs.Enumeration;

enum Student{
    Akshai(20, 15 , 'A'), Kumar(15, 10 , 'A'), Jatka(45 , 23, 'O');
    // These are the methods in the enum.

    private final int age;
    private final int Roll_no;
    private final char Grade;
    // This two necessary for the creating a constructor in the enum.

    Student(int age , int Roll_no, char grade){
        this.age = age ;
        this.Roll_no = Roll_no;
        Grade = grade;
    }

    //to acces the particluar age or the Roll_no need to getter because it is private.
    // No setter available because, it is final variable.

    public int getAge() {
        return age;
    }

    public char getGrade() {
        return Grade;
    }

    public int getRoll_no() {
        return Roll_no;
    }

}

public class Constructors_methods {
    public static void main(String[] args) {
        Student stud;
        stud = Student.Akshai;
        System.out.println(stud);
        System.out.println(stud.getAge()); // to access the age of the student.
        System.out.println(stud.getRoll_no());// similarly for thr roll_no
    }
}
