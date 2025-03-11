package net.jobb;

public class HelloWorld {


    // = singel line comment

    /*
    Multi line comment
     */


    /**
     * kan skriva java kod utan den körs  </B> taggar osv
     */

    // psvm + tab
    public static void main(String[] args) {
        System.out.println("tja");

        int speed;
        speed = 100;

        double salary = 50000.55;
        char grade = 'a';
        char specialChar = '\u2764';   // <3
        boolean isActive = true;
        boolean isReserved = true;

        long balance = 5000000000L;
        double area = 20.55;
        int setNumber = 100;
        int studentId = 5000;

        System.out.println("speed: " + speed);
        System.out.println("-----------------------");

        int number1 = 10;
        int number2 = 5;

        int additionResult = number1 + number2;
        System.out.println("addition: " + additionResult);

        // *    /%

        // divison vs modules
        int division = number1 / number2;
        System.out.println(division);


    }
}
