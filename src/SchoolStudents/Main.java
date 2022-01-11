package SchoolStudents;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanStudentInfo = new Scanner(System.in);
        System.out.println("Hello, enter all the data of the student as follows:");
        System.out.println("Student name:");
        Students students1 = new Students("Boris",12,154,60);
        Students students2 = new Students("Boris",9,94,4);
        Students students3 = new Students("Boris",18,154,50);

        ArrayList<Students> allTheStudents= new ArrayList<Students>();
        ArrayList<Students> allTheYoungestStudents= new ArrayList<Students>();
        LinkedList allTheYoungestStudents2= new LinkedList<String>();
        for (int i = 0; i < 4; i++) {
            allTheStudents.add(students1);
        }
        System.out.println(allTheStudents);
        for (int i = 0; i < allTheStudents.size(); i++) {
            if (allTheStudents.)
            allTheYoungestStudents.add(students1);
        }
        System.out.println(allTheStudents);
    }

}