package samplearrays;

import java.util.Arrays;
import java.util.Comparator;

public class ManageStudent {


    // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {
        Student oldest=students[0];
        for(Student student: students){
            if(student.getAge()>oldest.getAge()){
                oldest=student;
            }

        }

        return oldest;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {
        int count=0;
        for(Student std:students){
            if(std.getAge()>=18) count++;
        }
        return count;

    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
        int sumGrades=0;
        for(Student std:students){
            sumGrades+=std.getGrade();
        }
        double average=(double)sumGrades/students.length;

        return average;

    }

    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {
        for(Student s: students){
            if(s.getName().equalsIgnoreCase(name)){
                return s;
            }
        }
        return null;


    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {
        //Bubble sort:

        for (int i = students.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (students[j].getGrade() < students[j + 1].getGrade()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }

            }


        }
    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {
        for(Student s:students){
            if(s.getGrade()>=15){
                System.out.println(s.getName());
            }
        }

    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {
        for(Student s:students){
            if(s.getId()==id){
                s.setGrade(newGrade);
                return true;
            }
        }
        return false;

    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {
        for(int i=0;i<students.length;i++){
            for(int j=i+1;j< students.length;j++){
                if(students[i].getName().equals(students[j].getName())){
                    return true;
                }
            }
        }
        return false;

    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {
        Student[] newStudents=new Student[students.length+1];
        for(int i=0;i<students.length;i++){
            newStudents[i]=students[i];
        }
        newStudents[students.length]=newStudent;
        return newStudents;

    }

    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students

        Student[] arr = new Student[5];
        arr[0] = new Student(1, "Ali");
        arr[1] = new Student(2, "Sara", 20);
        arr[2] = new Student(3, "Yassmin", 19, 16);
        arr[3] = new Student(4, "Hamza", 17, 14);
        arr[4] = new Student(5, "Abdelilah", 20, 20);


        // Print all
        System.out.println("== All Students ==");
        for (Student s : arr) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest
        System.out.println("The oldest");
        System.out.println(ManageStudent.findOldest(arr));


        // 3) Count adults
        System.out.println("The Adults");
        System.out.println(ManageStudent.countAdults(arr));


        // 4) Average grade
        System.out.println("Average");
        System.out.println(ManageStudent.averageGrade(arr));



        // 5) Find by name
        System.out.println("Searching : Yassmin?");
        System.out.println(ManageStudent.findStudentByName(arr,"Yassmin"));


        // 6) Sort by grade desc
        // sort function
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : arr) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(arr);

        // 8) Update grade by id
        // function
        //System.out.println("\nUpdated id=4? " + updated);
        //System.out.println(findStudentByName(arr, "Dina"));

        // 9) Duplicate names


        // 10) Append new student


        // 11)  Student Matrix

        Student[][] classes=new Student[2][3];

        classes[0][0] = new Student(11, "Ali");
        classes[0][1] = new Student(22, "Sara", 20);
        classes[0][2] = new Student(33, "Yassmin", 19, 16);

        classes[1][0] = new Student(44, "Hamza", 17, 14);
        classes[1][1] = new Student(55, "Abdelilah", 20, 20);
        classes[1][2] = new Student(66, "Nora", 18, 17);
        System.out.println("--Print the names of all students class by class");

        for(int i=0;i<2;i++){
            System.out.println("__Class: "+(i+1)+"__");
            for(int j=0;j<3;j++){
                System.out.println(classes[i][j].getName());
            }
        }

        System.out.println("The Top Student in Each Class");
        sortByGradeDesc(classes[0]);
        System.out.println("Class 1 :");
        System.out.println(classes[0][0]);
        sortByGradeDesc(classes[1]);
        System.out.println("Class 2 :");
        System.out.println(classes[1][0]);




    }
}

