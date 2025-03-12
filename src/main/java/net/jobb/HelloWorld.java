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

        int subtractionResult = number1 - number2;
        System.out.println("Subtraction:" + subtractionResult);

        int division = number1 + number2;
        System.out.println("Division: " + division);

        int modules = number1 % number2;
        System.out.println("Modules: " + modules);

        int counter = 0;
        System.out.println(++counter);  // 1

        int num1 = 500, num2 = 200, num3 = 10;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);


        // (== , != , < , > , <=, >=)


        boolean isEqual = num1 == num2; // false
        System.out.println("is Equal:" + isEqual);
        boolean isGreaterThan = num1 > num2; // false


        int age = 15;
        if (age >= 18) {
            System.out.println("You are of age");

        } else {
            System.out.println("you are under age");
        }


        int marks = 85;
        if (marks >= 90){
            System.out.println("Grade A");
        } else if (marks >=80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 60) {
            System.out.println("Grade F");
        }



        int dayOfWeek = 2;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        String name = "Michel";
        String lastName = "Dahl";
        name = name.concat(" ").concat(lastName); // Michel Dahl
        System.out.println(name);

        //  name = name + " "  +lastName; är samma sak som concat
        System.out.println("--------------------------------");

        Person object1 = new Person();
        object1.firstName = "Michel";
        object1.lastName = "Dahl";


        Person object2 = new Person();
        object2.firstName = "erik";
        object2.lastName = "erikssson";


        Person object3 = new Person();
        object3.firstName = "emil";
        object3.lastName = "emilsson";


        System.out.println(object1.fullName());
        System.out.println(object2.fullName());
        System.out.println(object3.fullName());




    }
}
