//Task to Do:
//        1. Using switch statement Write a JAVA program to input marks of five subjects Physics, Chemistry,
//        Biology, Mathematics and Computer. Calculate percentage and grade according to following:
//        Percentage >= 90% : Grade A Percentage >= 80% : Grade B Percentage >= 70% : Grade C Percentage
//        >= 60% : Grade D Percentage >= 40% : Grade E Percentage < 40% : Grade F
//        2. JAVA Program to find the maximum between two numbers. Using the switch statement.
//        3. JAVA Program to find the maximum between three numbers. Using the switch statement.
//        4. JAVA Program to check whether a number is divisible by 5 and 11 or not. Using the switch statement.
//        5. JAVA Program to check whether a year is a leap year or not. Using switch statement
//        6. JAVA Program to check whether a character is an alphabet or not. Using the switch statement.
//        7. JAVA Program to take the value from the user as input any alphabet and check whether it is vowel or consonant. Using the switch statement.
//        8. JAVA Program to take the value from the user as input any character and check whether it is the alphabet, digit or special character. Using the switch statement.
//        9. JAVA Program to check whether a character is an uppercase or lowercase alphabet. Using the switch statement.
//        10. JAVA Program to take the value from the user as an input week number and print weekday by using the switch statement.
//        11. JAVA Program to take the value from the user as input the month number and print number of days in that month. Using switch statement
//        12. JAVA Program to count the total number of notes in a given amount. Using the switch statement.
//        13. JAVA Program to take the value from the user as input all sides of a triangle and check whether the triangle is valid or not. Using switch statement
//        14. JAVA Program to check whether the triangle is an equilateral, isosceles or scalene triangle. Using switch statement 15. JAVA Program to find all the roots of a quadratic equation. Using switch statement
//        16. JAVA Program to calculate profit or loss. Using switch statement.
//        17. Using switch statement JAVA Program to take the value from the user as input marks of five subjects Physics, Chemistry, Biology, Mathematics, and Computer. Calculate percentage and grade according to the following: Percentage >= 90% : Grade A, Percentage >= 80% : Grade B, Percentage >= 70% : Grade C, Percentage >= 60% : Grade D, Percentage >= 40% : Grade E, Percentage < 40% : Grade F, Using switch statement.
//        18. JAVA Program to take the value from the user as input the basic salary of an employee and calculate its Gross salary according to the following: Basic Salary <= 10000: HRA = 20%, DA = 80%………………………………..Basic Salary <= 20000 : HRA = 25%, DA = 90%………………………………Basic Salary > 20000 : HRA = 30%, DA = 95%.
//        19. JAVA Program to take the value from the user as input electricity unit charges and calculate total electricity bill according to the given condition: For the first 50 units Rs. 0.50/unit…………. For the next 100 units Rs. 0.75/unit…..For the next 100 units Rs. 1.20/unit ……………For unit above 250 Rs. 1.50/unit………An additional surcharge of 20% is added to the bill…….Using the switch statement.
//        20. Write a program that determines a student’s grade. The program will read three types of scores
//        (quiz, mid-term, and final scores) and determine the grade based on the following rules:if the
//        average score =90% =>grade=A…………………..-if the average score >= 70% and grade=B……………………-if the average
//        score>=50% and grade=C……………………..-if the average score grade=F
//        21. Program to take the hours and minutes as input by the user and the show that whether it is AM or PM by using the switch statement.
//        22. Program to convert a positive number into negative number and negative number into a positive number using switch statement
//        23. Write a program to swap the values of two numbers if the values of both variables are not the same using a switch statement.
//        24. Program to Convert even number into its upper nearest odd number Switch Statement


//        1. Using switch statement Write a JAVA program to input marks of five subjects Physics, Chemistry,
//        Biology, Mathematics and Computer. Calculate percentage and grade according to following:
//        Percentage >= 90% : Grade A Percentage >= 80% : Grade B Percentage >= 70% : Grade C Percentage >= 60%
//        : Grade D Percentage >= 40% : Grade E Percentage < 40% : Grade F
//Task to Do:
//        1. Using switch statement Write a JAVA program to input marks of five subjects Physics, Chemistry,
//        Biology, Mathematics and Computer. Calculate percentage and grade according to following: Percentage
//        >= 90% : Grade A Percentage >= 80% : Grade B Percentage >= 70% : Grade C Percentage >= 60% : Grade D
//        Percentage >= 40% : Grade E Percentage < 40% : Grade F
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        String grade;
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the marks of Physics::");
        int sub1=sc.nextInt();
        System.out.print("Enter the marks of Chemistry::");
        int sub2=sc.nextInt();
        System.out.print("Enter the marks of Biology::");
        int sub3=sc.nextInt();
        System.out.print("Enter the marks of Computer::");
        int sub4=sc.nextInt();
        int total =sub1+sub2+sub3+sub4;
        System.out.print("The total marks obtained is "+total);
        int Percentage=total/4;
        System.out.print("percentage of the student is "+Percentage);
        switch((Percentage >= 80)? 0: (Percentage >= 70)? 1: ( Percentage >= 60)?2
        : ( Percentage >= 40)? 3: (Percentage < 40)? 4:5 ){
            case 0:
                System.out.print("The obtained grade is A");
                break;
            case 1:
                System.out.print("The obtained grade is B");
                break;
            case 2:
                System.out.print("The obtained grade is C");
                break;
            case 3:
                System.out.println("The obtained grade is D");
                break;
            case 4:
                System.out.println("The obtained grade is E");
                break;
            case 5:
                System.out.println("The obtained grade is F");
                break;

        }
    }
}

//        2. JAVA Program to find the maximum between two numbers. Using the switch statement.

class Maxv {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the first number::");
        int c=sc.nextInt();
        System.out.println("Enter the second number::");
        int b=sc.nextInt();

        switch((c<b)?0:(c>b)?1:2){
            case 0:
                System.out.println("Maximum value is"+b);
                break;
            case 1:
                System.out.println("Maximum value is"+c);
                break;
            default:
                System.out.println("both are equal");
        }

    }
}

//        3. JAVA Program to find the maximum between three numbers. Using the switch statement.
class Maxvalueofthre {
    public static void main(String[] args) {

        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the first number::");
        int a=sc.nextInt();
        System.out.println("Enter the second number::");
        int b=sc.nextInt();
        System.out.println("Enter the third number::");
        int c=sc.nextInt();


        switch((a>b&& a>c)?0:(b>a && b>c)?1:(c>a && c>b)?2:3){
            case 0:
                System.out.println("Maximum value is"+a);
                break;
            case 1:
                System.out.println("Maximum value is"+b);
                break;
            case 3:
                System.out.println("Maximum value is"+c);
                break;
            default:
                System.out.println("All are equal");
        }

    }
}

//        4. JAVA Program to check whether a number is divisible by 5 and 11 or not. Using the switch statement.
class Divisivleby {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the any number::");
        int num=sc.nextInt();

        switch((num%5==0 && num%11==0)?0:1){
            case 0:
                System.out.println("Given number is divisible by both 5 and 11");
                break;
            case 1:
                System.out.println("Given number is not divisible by 5 and 11");
                break;

        }

    }
}

//        5. JAVA Program to check whether a year is a leap year or not. Using switch statement
class Leapyear {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the  Year::");
        int year=sc.nextInt();

        switch((year%400==0) ||(year%4==0 && year%100!=0)?0:1){
            case 0:
                System.out.println("Given year is Leap year");
                break;
            case 1:
                System.out.println("Not leap lear");
                break;

        }

    }
}
//        6. JAVA Program to check whether a character is an alphabet or not. Using the switch statement.
class Alphabetornot {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the character::");
        char ch=sc.next().charAt(0);

        switch((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z')?0:1){
            case 0:
                System.out.println("Given character is alphabet");
                break;
            case 1:
                System.out.println("Given character is not a alphabet");
                break;
            default:
                System.out.println("Invalid");


        }

    }
}
// JAVA Program to take the value from the user as input any alphabet and check whether it is vowel or consonant. Using the switch statement.
class vowelornot {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the character::");
        char ch=sc.next().charAt(0);

        switch((ch=='a'|| ch=='e'||ch=='i' || ch=='o'|| ch=='u')||(ch=='A'|| ch=='E'||ch=='I' || ch=='O'|| ch=='U')?0:1){
            case 0:
                System.out.println("Given character is VOWEL");
                break;
            case 1:
                System.out.println("Given character is CONSONANT");
                break;
            default:
                System.out.println("Invalid");


        }

    }
}

//        8. JAVA Program to take the value from the user as input any character and check whether it is the
//        alphabet, digit or special character. Using the switch statement.
class Digitspecialornot {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the character::");
        char ch=sc.next().charAt(0);
        switch((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z')?0:(ch>='0' && ch<='9')?1:2){

            case 0:
                System.out.println("Given character is alphabet");
                break;
            case 1:
                System.out.println("Given character is digits");
                break;
            case 2:
                System.out.println("Given character is special");
                break;
            default:
                System.out.println("Invalid");


        }

    }
}
//        9. JAVA Program to check whether a character is an uppercase or lowercase alphabet. Using the switch statement.
class Upperlowercheck {
    public static void main(String[] args) {
        char ch1, ch2;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the character::");
        char ch=sc.next().charAt(0);
        switch((Character.isLowerCase(ch))?0:1){

            case 0:
                System.out.println("Given character is LOWERCASE alphabet");
                break;
            case 1:
                System.out.println("Given character is UPPERCASE alphabet");
                break;
            default:
                System.out.println("Invalid");


        }

    }
}
//        10. JAVA Program to take the value from the user as an input week number and print weekday by using the switch statement.
class Weekday {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number of the weeks::");
        int num=sc.nextInt();
        switch(num){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }


    }
}
//        11. JAVA Program to take the value from the user as input the month number and print number
//        of days in that month. Using switch statement
class monthdays{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int month = scanner.nextInt();
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                System.out.println("total days is 31.");
                break;
            case 2:
                System.out.println("Febraury");
                switch((year%400==0) ||(year%4==0 && year%100!=0)?0:1) {
                    case 0:
                        System.out.println(year + "is Leap year");
                        System.out.println("total days is 29");
                        break;
                    case 1:
                        System.out.println(year + "leap lear");
                        System.out.println("total days is 28");
                        break;
                }
                break;
            case 3:
                System.out.println("March");
                System.out.println("total days is 31.");
                break;
            case 4:
                System.out.println("April");
                System.out.println("total days is 30.");
                break;
            case 5:
                System.out.println("May");
                System.out.println("total das is 31.");
                break;
            case 6:
                System.out.println("June");
                System.out.println("total das is 30.");
                break;
            case 7:
                System.out.println("July");
                System.out.println("total das is 31.");
                break;
            case 8:
                System.out.println("August");
                System.out.println("total das is 31.");
                break;
            case 9:
                System.out.println("September");
                System.out.println("total das is 30.");
                break;
            case 10:
                System.out.println("October");
                System.out.println("total das is 31.");
                break;
            case 11:
                System.out.println("November");
                System.out.println("total das is 30.");
                break;
            case 12:
                System.out.println("December");
                System.out.println("total das is 31.");
                break;
        }
    }
}
//        12. JAVA Program to count the total number of notes in a given amount. Using the switch statement.
//

class CountNotes {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the amount::");
        int note= sc.nextInt();
        int rupee=note%5;
        int num=note/5;

        switch(rupee){
            case 0:
                System.out.println("total number of notes of 5 is"+num);
                break;
            default:
                System.out.println("Invalid entry of rupee");


        }

    }
}
//        13. JAVA Program to take the value from the user as input all sides of a triangle and check whether
//        the triangle is valid or not. Using switch statement.
class Checktriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the first side::");
        int num=sc.nextInt();

        System.out.println("Enter the second side::");
        int num1=sc.nextInt();

        System.out.println("Enter the third side::");
        int num2=sc.nextInt();

        switch((num+num1)>num2||(num+num2)>num1||(num1+num2)>num ?0:1){
            case 0:
                System.out.println("Valid triangle");
                break;
            case 1:
                System.out.println("Invalid triangle");
                break;

        }
    }
}


//        14. JAVA Program to check whether the triangle is an equilateral, isosceles or scalene triangle.
//        Using switch statement
class Sideoftriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the first side::");
        int num=sc.nextInt();

        System.out.println("Enter the second side::");
        int num1=sc.nextInt();

        System.out.println("Enter the third side::");
        int num2=sc.nextInt();

        switch((num==num1 && num==num2 && num1==num2)?0:(num==num1 || num1==num2 || num2==num)?1:2){
            case 0:
                System.out.println("Equivalent triangle");
                break;
            case 1:
                System.out.println("Isosceles triangle");
                break;
            default:
                System.out.println("Scalene Triangle");

        }
    }
}
//15. JAVA Program to find all the roots of a quadratic equation. Using switch statement

class quadretice {
    public static void main(String[] args) {
        double firstroot, secondroot, singleroot;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the value of a::");
        int a=sc.nextInt();

        System.out.println("Enter the value of b::");
        int b=sc.nextInt();

        System.out.println("Enter the value of c::");
        int c=sc.nextInt();
        int determinant=(b*b)-(4*a*c);
        double square=Math.sqrt(determinant);

        switch((determinant>0)?0:(determinant==0)?1:2){
            case 0:
                firstroot=(+b+square)/(2*a);
                secondroot=(+b-square)/(2*a);
                System.out.println("The roots are"+firstroot+ "and" + secondroot);
                break;
            case 1:
                singleroot=(+b)/(2*a);
                System.out.println("Root is "+ singleroot);
                break;
            default:
                System.out.println("No root");

        }
    }
}

// 16. JAVA Program to calculate profit or loss. Using switch statement.

class Profitloss {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the cost price::");
        int cp=sc.nextInt();

        System.out.println("Enter the selling price::");
        int sp=sc.nextInt();
        int profit=sp-cp;
        int loss=cp-sp;

        switch((sp>cp)?0:1){
            case 0:
                System.out.println("Profit amount is " + profit);
                break;
            case 1:
                System.out.println("Loss amount is " + loss);
                break;

        }
    }
}



//        17. Using switch statement JAVA Program to take the value from the user as input marks of five
//        subjects Physics, Chemistry, Biology, Mathematics, and Computer. Calculate percentage and grade
//        according to the following: Percentage >= 90% : Grade A, Percentage >= 80% : Grade B, Percentage
//        >= 70% : Grade C, Percentage >= 60% : Grade D, Percentage >= 40% : Grade E, Percentage < 40% :
//        Grade F, Using switch statement.
class Marksofsub {
    public static void main(String[] args) {
        String grade;
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the marks of Physics::");
        int sub1=sc.nextInt();
        System.out.print("Enter the marks of Chemistry::");
        int sub2=sc.nextInt();
        System.out.print("Enter the marks of Biology::");
        int sub3=sc.nextInt();
        System.out.print("Enter the marks of Computer::");
        int sub4=sc.nextInt();
        int total =sub1+sub2+sub3+sub4;
        System.out.print("The total marks obtained is "+total);
        int Percentage=total/4;
        System.out.print("percentage of the student is "+Percentage);
        switch((Percentage >= 80)? 0: (Percentage >= 70)? 1: ( Percentage >= 60)?2
                : ( Percentage >= 40)? 3: (Percentage < 40)? 4:5 ){
            case 0:
                System.out.print("The obtained grade is A");
                break;
            case 1:
                System.out.print("The obtained grade is B");
                break;
            case 2:
                System.out.print("The obtained grade is C");
                break;
            case 3:
                System.out.println("The obtained grade is D");
                break;
            case 4:
                System.out.println("The obtained grade is E");
                break;
            case 5:
                System.out.println("The obtained grade is F");
                break;

        }
    }
}
//        18. JAVA Program to take the value from the user as input the basic salary of an employee and
//        calculate its Gross salary according to the following: Basic Salary <= 10000: HRA = 20%, DA =
//        80%………………………………..Basic Salary <= 20000 : HRA = 25%, DA = 90%………………………………Basic Salary > 20000 :
//        HRA = 30%, DA = 95%.

class Salarys {
    public static void main(String[] args) {
        double hra, da,grosssalary;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the Your salary::");
        int wages= sc.nextInt();
        switch((wages<=10000)?0:(wages<=20000)?1:2){
            case 0:
                hra=wages*0.2;
                da= wages*0.8;
                grosssalary=hra+da+wages;
                System.out.println("Total wages is "+ grosssalary);
                break;
            case 1:
                hra=wages*0.250;
                da= wages*0.9;
                grosssalary=hra+da+wages;
                System.out.println("Total wages is "+ grosssalary);
                break;
            default:
                hra=wages*0.3;
                da= wages*0.95;
                grosssalary=hra+da+wages;
                System.out.println("Total wages is "+ grosssalary);
                break;


        }

    }
}
//        19. JAVA Program to take the value from the user as input electricity unit charges and calculate
//        total electricity bill according to the given condition: For the first 50 units Rs. 0.50/unit………….
//        For the next 100 units Rs. 0.75/unit…..For the next 100 units Rs. 1.20/unit ……………For unit above
//        250 Rs. 1.50/unit………An additional surcharge of 20% is added to the bill…….Using the switch statement.
class Consumption {
    public static void main(String[] args) {
        double units, amount, sur_amount,total_bill;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the consumed unit::");
        units=sc.nextInt();
        switch((units<=50)?0:(units<=150)?1:(units<=250)?2:3){
            case 0:
                amount=units*0.50;
                sur_amount=amount*0.2;
                total_bill=sur_amount+amount;
                System.out.println("Total electricity bill amount is " + total_bill);
                break;
            case 1:
                amount=25+(units-100)*0.75;
                sur_amount=amount*0.2;
                total_bill=sur_amount+amount;
                System.out.println("Total electricity bill amount is " + total_bill);
                break;
            case 2:
                amount=25+75+(units-150)*1.20;
                sur_amount=amount*0.2;
                total_bill=sur_amount+amount;
                System.out.println("Total electricity bill amount is " + total_bill);
                break;
            default:
                amount=25+75+150+(units-250)*1.50;
                sur_amount=amount*0.2;
                total_bill=sur_amount+amount;
                System.out.println("Total electricity bill amount is " + total_bill);
                break;

        }
    }
}
//        20. Write a program that determines a student’s grade. The program will read three types of scores
//        (quiz, mid-term, and final scores) and determine the grade based on the following rules:if the
//        average score =90% =>grade=A…………………..-if the average score >= 70% and grade=B……………………-if the average
//        score>=50% and grade=C……………………..-if the average score grade=F
//        21. Program to take the hours and minutes as input by the user and the show that whether it is AM or
//        PM by using the switch statement.
class Exammaks {
    public static void main(String[] args) {
        String grade;
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the marks of quiz::");
        int quiz=sc.nextInt();
        System.out.print("Enter the marks of midterm::");
        int midterm=sc.nextInt();
        System.out.print("Enter the marks of finalterm::");
        int finalterm=sc.nextInt();
        int total =quiz+midterm+finalterm;
        System.out.print("The total marks obtained is "+total);
        int Percentage=total/4;
        System.out.print("percentage of the student is "+Percentage);
        switch((Percentage >= 90)? 0: (Percentage >= 70)? 1: ( Percentage >= 60)?2
                : ( Percentage >= 40)? 3: (Percentage < 40)? 4:5 ){
            case 0:
                System.out.print("The obtained grade is A");
                break;
            case 1:
                System.out.print("The obtained grade is B");
                break;
            case 2:
                System.out.print("The obtained grade is C");
                break;
            case 3:
                System.out.println("The obtained grade is D");
                break;
            case 4:
                System.out.println("The obtained grade is E");
                break;
            case 5:
                System.out.println("The obtained grade is F");
                break;

        }
    }
}
//        21. Program to take the hours and minutes as input by the user and the show that whether
//        it is AM or PM by using the switch statement.
class Minhour {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the hours ::");
        int hour=sc.nextInt();
        System.out.println("Enter the minute ::");
        int min=sc.nextInt();

        switch((hour>=1 && hour<=12)?0:(hour>12 && hour<=24)?1:2){
            case 0:
                System.out.println(hour +"is AM");
                break;
            case 1:
                System.out.println(hour +"is PM");
                break;
            default:
                System.out.println("INVALID");
        }

    }
}
//        22. Program to convert a positive number into negative number and negative number into a positive
//        number using switch statement
class Positivenegative {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the any integer ::");
        int num=sc.nextInt();
        int value=(Math.abs(num));

        switch((num>0)?0:1){
            case 0:
                System.out.println("Negative number of given positive number is "+ (~(value-1)));
                break;
            case 1:
                System.out.println("Positive number of given negative number is"+ value);
                break;
            default:
                System.out.println("INVALID");
        }

    }
}
//        23. Write a program to swap the values of two numbers if the values of both variables are not the
//        same using a switch statement.
class Swapingvariable {
    public static void main(String[] args) {
        int temp, variable1, variable2;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the first variable ::");
        variable1=sc.nextInt();
        System.out.println("Enter the second variable ::");
        variable2=sc.nextInt();

        System.out.println("Before swap");
        System.out.println("first variable = "+ variable1 );
        System.out.println("second variable = "+ variable2 );

        temp=variable1;
        variable1=variable2;
        variable2=temp;

        switch((variable1!=variable2)?0:1){
            case 0:

                System.out.println("First variable after swapping "+ variable1);
                System.out.println("First variable after swapping "+ variable2);
                break;
            case 1:
                System.out.println("Same variable is not accepted");
                break;

        }

    }
}
//        24. Program to Convert even number into its upper nearest odd number Switch Statement

class nearest {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the even number:");
        int num=sc.nextInt();
        switch((num%2)){
            case 0:
                System.out.println("The nearest odd number of enter even number is " + (num+1));
                break;
            default:
                System.out.println("Invalid");

        }
    }
}
