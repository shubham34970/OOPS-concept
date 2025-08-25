package P1;

public class oop {
    public static void main(String[] args) {

//        creating an object in java:
        Student st1 = new Student(); // here Student() is called the constructor
        st1.Name = "Sameer";
        st1.rollno = 01;


        Student st2 = new Student();
        st2.Name = "Aradhya";
        st2.rollno = 02;

        Student st3 = new Student();
        st3.Name = "Harsh";
        st3.rollno = 03;

        System.out.println("1st Student Name is "+st1.Name);
        System.out.println("1st Student Branch is "+st1.Branch);
        System.out.println();

        System.out.println("2nd Student Name is "+st2.Name);
        System.out.println("2nd Student Branch is "+st2.Branch);
        System.out.println();

        System.out.println("3rd Student Name is "+st3.Name);
        System.out.print("3rd Student Branch is "+st3.Branch);
        System.out.println();

    }
    static class Student{
        // Attributes = Properties = state = variable
        String Name;
        long rollno;
        String Branch = "CS";// By default ye same he le liya sabka
        char Section = 'D'; // By default D de diya aur hamne char liya aur String nhi liya
                            // for better memory utilisation
        int[] Marks = new int[10];

        // Methods = function in C but accessed through dot operator = procedure
        void checkResult(){

            System.out.print("Hello");
        }
    }
}
