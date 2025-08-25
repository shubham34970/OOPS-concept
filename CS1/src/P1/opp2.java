// Every class is a user defined datatype

package P1;

import java.util.Scanner;

public class opp2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Employee e[] = new Employee[100];
        for (int i = 0; i<10; i++){
            e[i] = new Employee();
        }


//        Employee e1 = new Employee();
//        e1.nEmp = 1234;
//        e1.sName = "Sameer";
//        e1.nEmp = in.nextInt(); // memory overwrites
//
//        Employee e2 = new Employee();
//        e2.nEmp = 4321;
//        e2.sName = "Suhani";


        System.out.println("eq employee id is "+e2.nEmp);
        System.out.println("eq employee name is "+e2.sName);
        e1.mCalIncomeTx(12345);
        System.out.println();


        System.out.println("eq employee id is "+e1.nEmp);
        System.out.println("eq employee name is "+e1.sName);
        e2.mCalIncomeTx(54321);
        System.out.println();

//        int searchID = 1234




    }

    static class Employee{

        Employee(int empID){
            this.nEmp = empID; // this is the keyword refers to the current object.
        }
        int nEmp;
        String sName;
        long nSal;

        int[] aDesig = new int[10];

        void mCalIncomeTx(long nSal){
            System.out.println("Return Income Tax");
        }
    }
}
