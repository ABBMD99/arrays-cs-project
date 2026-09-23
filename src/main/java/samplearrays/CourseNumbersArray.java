package samplearrays;


import java.util.Arrays;

public class CourseNumbersArray {
    public static int[] addNewCourse(int[] courses,int newCourse){
        int[] updatedCourses= Arrays.copyOf(courses,courses.length+1);
        updatedCourses[courses.length]=newCourse;
        return updatedCourses;

    }
    public static void printUpdatedCourses(int[] updatedCourses){
        System.out.println(Arrays.toString(updatedCourses));

    }
    public static boolean checkCourses(int[] courses,int course){
        for(int cour : courses){
            if( cour==course)
                return true;
        }
        return false;
    }



    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};

        int[] updatedCourses=CourseNumbersArray.addNewCourse(registeredCourses,3090);
        CourseNumbersArray.printUpdatedCourses(updatedCourses);
        System.out.println(CourseNumbersArray.checkCourses(registeredCourses,1020));
        System.out.println(CourseNumbersArray.checkCourses(registeredCourses,9999));


    }
}
