package MidtearmJavaExam;

public class Project1 {

    // main method
    // midterm exam, fail confirm /All ans is wrong and full of error/Sorry

    public static void main(String[] args) {


  // QUESTION 2:
        //     * Create a method to return an int-array
        //     * after removing a given int-value from a given int array.
        //     *
        //     * Input array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Input Number: 24
        //     * Returned array: {32, 14, 98, 56, 148, 78}
        //     *
        //     * Input array:     {1, 2, 4, 3, 1, 6, 1}    Input Number: 11
        //     * Returned Array:  {1, 2, 4, 3, 1, 6, 1}

        double[] arr = new double [ 10];    // Creating an array of 10 elements
        arr[0]= 32;
        arr [1]=14 ;
        arr [2]= 24;
        arr [3]= 98;
        arr [4] = 24;
        arr[5] =56;
        arr [6] = 148;
        arr [7] = 24;
        arr [8] = 78;
        arr [9] = 24;
        return new arr[] {32,14,98,56,148,78};     //returns array
    }

    {
        int[] arr=returnArray();
        System.out.println(Arrays.toString(arr));   //returns the string representation of the object
    }

    int[] my_array = {1, 2, 4, 3, 1, 6, 1} ;  // Input Number: 11
    int[]returnArray = {1, 2, 4, 3, 1, 6, 1};
    System.out.println("Index position of 0 is: " + findIndex(returnArray);

    //  Question 1:
    //     * Scenario: Traffic ticketing system
    //     * Write a method, that will print (not return) the points to be charged against
    //     * the license for over speeding.
    //     *
    //     *    1. Speed Limit = 70
    //     *    2. Every 5 miles over the speed limit will add 1 point
    //     *    3. If user speed is such that system shows 12 points for a speed
    //     *      then print, license is suspended
    //     *
    //     *  Example:
    //     *      user speed = 74 ; 0 points
    //     *      user speed = 78 ; 1 points  // 70-75(1) 75-78(0) = 1
    //     *      user speed = 88 ; 3 points  // 70-75(1) 75-80(1) 80-85(1) 85-88(0) = 3
    //     *      user speed = 178 ; 21 points (License suspended).
    //     *      user speed = 70 ; Thank you for driving within the speed limit.


    int Speed = 70;
    double spd = 170*(Speed);
    String point = "";
    if () >=74.0){
        point = "0";
    }
    else if () >=78.0){
    point = "1";
    }
    else if () >=88.0)

    {
        point = "3";

    }
    else if () >=178.0){
    point = "21";
    }
    else if () >=70.0){
     point = "0";
        System.out.println("user speed #"+user+". Your speed of  "+points[drivers]+" out of "+ highSpeed);
        System.out.println("Your Speed: "+points);
        System.out.println("Your Speed: "+points);
}
}
