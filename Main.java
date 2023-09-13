package com.subha;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //write a code here
        System.out.println("Hello world!");
        String name = "Subhajit";
        System.out.println(name);
        String neighbour = name;
        System.out.println(neighbour);

        /*
        Java Data Type
        > primitive : to show simple value

            byte:
            Meaning: 2's complement integer
            Size: 1 byte
            Range: -128 to 127

            short:
            Meaning: 2's complement integer
            Size: 2 bytes
            Range: -32,768 to 32,767

            int:
            Meaning: Integer numbers
            Size: 4 bytes
            Range: -2,147,483,648 to 2,147,483,647

            long:
            Meaning: 2's complement integer for larger values
            Size: 8 bytes
            Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

            float:
            Meaning: Floating-point number
            Size: 4 bytes
            Range: Typically can represent numbers with up to 7 decimal digits of precision. The actual range depends on the specific floating-point format used.

            double:
            Meaning: Double-precision floating-point number
            Size: 8 bytes
            Range: Typically can represent numbers with up to 16 decimal digits of precision. Like float, the actual range depends on the specific floating-point format used.

            char:
            Meaning: Character
            Size: 2 bytes
            Range: Char data type is typically used to represent individual characters such as letters (both uppercase and lowercase), digits, special symbols, and control characters. It can store a single character from the character set, which includes letters (A-Z, a-z), digits (0-9), and special characters (e.g., @, #, $).

            bool:
            Meaning: Boolean
            Size: 1 byte (though the size may vary depending on the programming language and system)
            Range: Represents a Boolean value, which can be either true or false. It is often used in logical operations and conditions to make decisions in code.
            */
            byte age1 = -128;
            byte age2 = 127;
            short age3 = 180;
            int phone = 891871674;
            long phone1 = 8918716744L;
            float pi = 3.14F;
            char latter = '@';
            boolean isAdult = true;
            System.out.println(age1);
            System.out.println(phone1);

             /*

        > non-primitive : to show complex value
        These are of variable size & are usually declared with a ‘new’ keyword.

        Eg : String, Arrays
            */
        String name1 = "Apu";
        System.out.println(name1.length());

        //string

        //concatenate
         String name2 = "Subhajit";
         String name3 = "Ghosh";
         String name4 = name2+" "+name3;
        System.out.println(name4);

        //charAt
        String name5 = "Babujit";
        System.out.println(name5.charAt(3));

        //length
        String name6 = "Aman";
        System.out.println(name6.length());

        //replace
        String name7 = "Babujit";
        String name8 = name7.replace('b','s');
        System.out.println(name8);

        /* The String is immutable, so its value cannot be changed. */

        //substring
        String name9 = "Subhajit and Babujit";
        System.out.println(name9.substring(5,9));

        // Arrays
        // Arrays in Java are like a list of elements of the same type i.e. a list of integers, a list of booleans etc.

        /* Creating an Array (method 1) - with new keyword */
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;
        System.out.println(marks[1]);

        /* Creating an Array (method 2) */
        int[] markss = {98, 97, 95};

        //length in Array
        System.out.println(marks.length);

        //sort in Array
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        // 2D Array
        int[][] finalMarks = {{89, 84, 99},{89, 99 , 97}};
        System.out.println(finalMarks[1][1]);

        // Casting
        /*
        Casting in java is the assigning values of one type to another.
        Casting in Java is of 2 types:
         */

        //Implicit casting
        //This casting is done by java implicitly i.e. on its own.
        // It is assigning smaller values to larger data types.
        float price = 100.00F;
        int gst = 18;
        float finalPrice = price + gst;
        System.out.println(finalPrice);

        // Explicit casting
        // This casting is done by the programmer. It is assigning larger values to smaller data types.
        int price1 = 100;
        float gst1 = 18.00F;
        int finalPrice1 = price1 + (int)gst1;
        System.out.println(finalPrice1);

        // Constants
        // A constant is a variable in Java which has a fixed value i.e. it cannot be assigned a different value once assigned.
        final float PI = 3.14F;

        // Operators
        /*
        There are 4 types of operators in Java :
        Arithmetic Operators
        Assignment Operators
        Comparison/Relational Operators
        Comparison/Relational Operators
        Logical Operators
         */

        //Arithmetic Operators

        // ‘+’ Add
        int a = 30;
        int b = 40;
        int sum = a + b;
        System.out.println(sum);

        // ‘-’ Subtract
        int a1 = 30;
        int b1 = 40;
        int diff = a - b;
        System.out.println(diff);

        // ‘*’ Multiply
        int a2 = 30;
        int b2 = 40;
        int mul = a * b;
        System.out.println(mul);

        // ‘/’ Divide
        int a3 = 30;
        int b3 = 40;
        int div = a / b;
        System.out.println(div);

        // ‘%’ Modulo - Remainder of a/b
        int a4 = 30;
        int b4 = 40;
        int modulo = a % b;
        System.out.println(modulo);

        // Unary Operators
        int a5 = 30;
        a5++;
        a5--;
        System.out.println(a5++);
        System.out.println(a5--);
        System.out.println(a5);
        System.out.println(++a5);
        System.out.println(--a5);

        // Assignment Operators

        /*

        = :
        Operation: Assigns the value of the right operand to the left operand.
                Example: A = B assigns the value of B to A.

        += :
        Operation: Adds the right operand to the left operand and assigns the result to the left operand.
        Example: A += B is equivalent to A = A + B.

        -= :
        Operation: Subtracts the right operand from the left operand and assigns the result to the left operand.
        Example: A -= B is equivalent to A = A - B.

        *= :
        Operation: Multiplies the right operand with the left operand and assigns the result to the left operand.
        Example: A *= B is equivalent to A = A * B.

        /= :
        Operation: Divides the left operand by the right operand and assigns the result to the left operand.
        Example: A /= B is equivalent to A = A / B.

         */
        int A = 10;
        int B = 5;

        // Using the = (Assignment Operator)
        int result1 = A; // result1 is assigned the value of A (result1 = 10)

        // Using the += (Addition Assignment Operator)
        A += B; // A is updated to A + B (A = 10 + 5, A = 15)

        // Using the -= (Subtraction Assignment Operator)
        A -= B; // A is updated to A - B (A = 15 - 5, A = 10)

        // Using the *= (Multiplication Assignment Operator)
        A *= B; // A is updated to A * B (A = 10 * 5, A = 50)

        // Using the /= (Division Assignment Operator)
        A /= B; // A is updated to A / B (A = 50 / 5, A = 10)

        System.out.println("result1: " + result1);
        System.out.println("A: " + A);

        // Comparison/Relational Operators

        /*
        == (Equality Operator):
        Operation: Gives true if the two operands are equal.
                Example: A == B is true if the values of A and B are equal.

        != (Inequality Operator):
        Operation: Gives true if the two operands are not equal.
                Example: A != B is true if the values of A and B are not equal.

        > (Greater Than Operator):
        Operation: Gives true if the left operand is greater than the right operand.
                Example: A > B is true if the value of A is greater than the value of B.

        < (Less Than Operator):
        Operation: Gives true if the left operand is less than the right operand.
                Example: A < B is true if the value of A is less than the value of B.

        >= (Greater Than or Equal To Operator):
        Operation: Gives true if the left operand is greater than or equal to the right operand.
                Example: A >= B is true if the value of A is greater than or equal to the value of B.

<= (L   ess Than or Equal To Operator):
        Operation: Gives true if the left operand is less than or equal to the right operand.
                Example: A <= B is true if the value of A is less than or equal to the value of B.
         */

        int C = 10;
        int D = 5;

        // Using the == (Equality Operator)
        boolean isEqual = (C == D); // isEqual is true if C is equal to D (false in this case)

        // Using the != (Inequality Operator)
        boolean isNotEqual = (C != D); // isNotEqual is true if C is not equal to D (true in this case)

        // Using the > (Greater Than Operator)
        boolean isGreaterThan = (C > D); // isGreaterThan is true if C is greater than D (true in this case)

        // Using the < (Less Than Operator)
        boolean isLessThan = (C < D); // isLessThan is true if C is less than D (false in this case)

        // Using the >= (Greater Than or Equal To Operator)
        boolean isGreaterOrEqual = (C >= D); // isGreaterOrEqual is true if C is greater than or equal to D (true in this case)

        // Using the <= (Less Than or Equal To Operator)
        boolean isLessOrEqual = (C <= D); // isLessOrEqual is true if C is less than or equal to D (false in this case)

        System.out.println("isEqual: " + isEqual);
        System.out.println("isNotEqual: " + isNotEqual);
        System.out.println("isGreaterThan: " + isGreaterThan);
        System.out.println("isLessThan: " + isLessThan);
        System.out.println("isGreaterOrEqual: " + isGreaterOrEqual);
        System.out.println("isLessOrEqual: " + isLessOrEqual);

        // Logical Operators

        /*
        && (Logical AND Operator):
        Operation: Gives true if both operands are true (non-zero in the case of numerical operands).
        Example: (A && B) is true if both A and B are true or non-zero. Otherwise, it's false.

        || (Logical OR Operator):
        Operation: Gives true if at least one of the two operands is true (non-zero in the case of numerical operands).
        Example: (A || B) is true if either A or B (or both) is true or non-zero. It's false only if both A and B are false or zero.

        ! (Logical NOT Operator):
        Operation: Reverses the logical state of the operand. If the operand is true, ! makes it false, and if the operand is false, ! makes it true.
        Example: !A is true if A is false, and !A is false if A is true.
         */
        boolean E = true;
        boolean F = false;

        // Using the && (Logical AND Operator)
        boolean andResult = (E && F); // andResult is true if both E and F are true (false in this case)

        // Using the || (Logical OR Operator)
        boolean orResult = (E || F); // orResult is true if either E or F is true (true in this case)

        // Using the ! (Logical NOT Operator)
        boolean notResultE = !E; // notResultE is the opposite of E (false in this case)
        boolean notResultF = !F; // notResultF is the opposite of F (true in this case)

        System.out.println("andResult: " + andResult);
        System.out.println("orResult: " + orResult);
        System.out.println("notResultE: " + notResultE);
        System.out.println("notResultF: " + notResultF);

        // Math class

        //MAX
        int G = 10;
        int H = 20;
        System.out.println("Max number : "+Math.max(G, H));

        //MIN
        int I = 10;
        int J = 20;
        Math.min(I,J);
        System.out.println("Min number : "+Math.min(I,J));

        //Random
        int randomNumber = (int)(Math.random()*100);
        System.out.println(randomNumber);

        // Input
        // How to take an input in Java ?
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");

        // Read input from the user
        int number = scanner.nextInt();

        // Display the input
        System.out.println("You entered: " + number);

        // input for string for single word
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter you name: ");
        String nameSave = sc.next();
        System.out.println(nameSave);

        // input for line in string
        Scanner scc = new Scanner(System.in);
        System.out.println(" Enter you Paragraph or sentence: ");
        String line = scc.nextLine();
        System.out.println(line);

        // Conditional stt
        boolean isSunUp = false;
        if(isSunUp)
            System.out.print("Day");
        else
            System.out.println("Night");

        Scanner age = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int agee = age.nextInt();
        if (agee>19)
            System.out.println("Your are eligible for vote");
        else
            System.out.println(" you are not eligible for vote");

        // Conditional Statements - switch
        int day = 1;
        switch (day) {
            case 1 :
                System.out.println("Monday");
            case 2 :
                System.out.println("TuesDay");
            default:
                System.out.println("wed - Sun");

        // For Loops
        for(int i = 1; i<= 100; i = i+1){
            System.out.println(i);
        }

        // While loops
        int i = 100;
        while(i >= 1){
            System.out.println(i);
            i = i-1;
        }

        }

        // Do While
        int k = 100;
        do{
            System.out.println(k);
            k = k - 1;
        } while(k >= 1);
        // in do while loop, we first run the operation and then we check conditions
        // but in loop, we first check the condition and then run code...

        //Break & Continue
        int i = 0;
        while(true){
            if(i==3){
                i=i+1;
                continue;
            }
            System.out.println(i);
            i = i+1;
            if (i > 5){
                break;
            }
        }

    }


}