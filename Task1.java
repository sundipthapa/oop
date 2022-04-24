import java.util.Scanner;

//1.Write a program to take student details as input and display the result.
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=scanner.nextLine();
        System.out.print("Enter your age:");
        int age=scanner.nextInt();
        System.out.print("Enter your address:");
        String address=scanner.next();

        System.out.println("\nyou have entered your name as "+name);
        System.out.println("you have entered your age as "+age);
        System.out.println("you have entered your address as "+address);

    }
}

//2.write a program to calculate sum of four numbers taking user input.
class Summ{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number::");
        double num1=sc.nextDouble();
        System.out.print("Enter second number::");
        double num2=sc.nextDouble();
        System.out.print("Enter third number::");
        double num3=sc.nextDouble();
        System.out.print("Enter four number::");
        double num4=sc.nextDouble();
        double sum=num1+num2+num3+num4;
        System.out.println("\nThe sum of four numbers is"+sum);
    }
}
//3.Write a program to take input of the total marks of four subjects of a student and calculate the total percentage secured.
//THen display the percentage and final result of the student;
class Result{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first subject marks::");
        double num1=sc.nextDouble();
        System.out.print("Enter second subject marks::");
        double num2=sc.nextDouble();
        System.out.print("Enter third subject marks::");
        double num3=sc.nextDouble();
        System.out.print("Enter fourth subject marks::");
        double num4=sc.nextDouble();
        double totalmarks=num1+num2+num3+num4;
        System.out.println("\nThe total marks of four subject is "+ totalmarks);
        double percentage=totalmarks/4;
        System.out.println("The percentage of four subjects are "+ percentage+"%");
        String result;
        result =(percentage>79 && percentage<=100)? "first class":(percentage>60 && percentage<=79)? "supper second class":(percentage>50 && percentage<=60)? "second class":(percentage>=40 && percentage<=50)? "third class":"fail";
        System.out.println("The class obtain is "+ result);
    }
}
//4.Write a program to take two integer inputs from user and print sum and product of them.
class Sumproduct{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number::");
        double num1=sc.nextDouble();
        System.out.print("Enter second number::");
        double num2=sc.nextDouble();
        double sum=num1+num2;
        double product=num1*num2;
        System.out.println("\nThe sum of two numbers is "+sum);
        System.out.println("The product of two numbers is "+product);
    }
}
//5.Take two integer inputs from user. first calculate the sum of two then product of two
//finally, print the sum and product of both obtained results.
class Sumproductsumproduct{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number::");
        double num1=sc.nextDouble();
        System.out.print("Enter second number::");
        double num2=sc.nextDouble();
        double sum=num1+num2;
        double product=num1*num2;
        System.out.println("The sum of two numbers is "+sum);
        System.out.println("The product of two numbers is "+product);
        double sum1=sum+product;
        double product1=sum*product;
        System.out.println("The sum of both obtained results is "+sum1);
        System.out.println("The product of both obtained results is "+product1);
    }
}
//6.Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
class Typecast{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length:");
        double length=sc.nextDouble();
        System.out.print("Enter breadth:");
        double breadth=sc.nextDouble();
        double Area=length*breadth;
        Double so=new Double(Area);
        int areaoftriangle=so.intValue();
        System.out.println("\nThe area of rectangle is "+areaoftriangle);

    }
}
//7.Take name, roll number and field of interest from user and print in the format below: Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
class Take{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=scanner.nextLine();
        System.out.print("Enter your roll number:");
        int roll=scanner.nextInt();
        System.out.print("Enter your field of interest:");
        String interest=scanner.next();

        System.out.println("\nHey, my name is "+name+" and my roll number is "+roll+". My field of interest are "+interest);


    }
}
//8.take side of square from user and print area and perimeter of it. Also, calculate SI, Area of triangle and volume of Cube and Cuboid. take the attributes as user input.
class SquarePerimeter{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter length:");
        double length=scanner.nextDouble();
        double area=length*length;
        double perimeter=4*length;

        System.out.println("\nArea of square is "+area);
        System.out.println("\nArea of square is "+perimeter);

    }
}
class Si{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principal:");
        double principal=sc.nextDouble();
        System.out.print("Enter rate:");
        double rate=sc.nextDouble();
        System.out.print("Enter time:");
        double time=sc.nextDouble();

        double SI=(principal*rate*time)/100;
        System.out.println("\nThe Simple Interest is "+SI);
    }
}
class Cuboidcube{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length:");
        double length=sc.nextDouble();
        System.out.print("Enter breadth:");
        double breadth=sc.nextDouble();
        System.out.print("Enter height:");
        double height=sc.nextDouble();

        double cube=length*length*length;
        double cuboid=length*breadth*height;
        System.out.println("\nThe volume of cube is "+cube);
        System.out.println("\nThe volume of cuboid is "+cuboid);
    }
}
class Trianglearea{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length:");
        double length=sc.nextDouble();
        System.out.print("Enter breadth:");
        double breadth=sc.nextDouble();

        double areaoftriangle=(length*breadth)/2;
        System.out.println("\nThe area of triangle is "+areaoftriangle);

    }
}
//9.Write a program to find the square of a number. as input:2 output:4
class Squareofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        double num = sc.nextDouble();
        double square = num * num;
        System.out.println("\nThe square of given number is " + square);

    }
}
//10.Take two different string input and print them in same line. Eg: input: code input:does  output: codedoes
class Sameline{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first string:");
        String anystring=scanner.nextLine();
        System.out.print("Enter second string:");
        String nextstring=scanner.next();
        System.out.print(anystring);
        System.out.print(nextstring);
    }
}

//11.Take 3 inputs from user and check: all are equal any of two are equal (use && // with ternary operator)
class Threeinput{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number::");
        double num1=sc.nextDouble();
        System.out.print("Enter second number::");
        double num2=sc.nextDouble();
        System.out.print("Enter third number::");
        double num3=sc.nextDouble();
        String re;
        re=(num1==num2 && num1==num3)? "All are equal":(num1==num2 || num2==num3 || num3==num1)? "Any of two are equal":"None of are equal";
        System.out.println(re);
    }
}
//12.Write a program to enter the values of two variables 'a' and 'b' from keyboard and then check if both the conditions 'a<50' and 'a<b' are true.
class Checking{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        double a=sc.nextDouble();
        System.out.print("Enter second number:");
        double b=sc.nextDouble();
        String output;
        output=(a<50 && a<b)? "True":"False";
        System.out.println("The output is "+ output);
    }
}
//13.if the marks of robert in three subjects are entered through keyboard (each out of 100), write a program to calculate his total marks and percentage marks.
class Mark{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks of first subject more than 100:");
        double num1=sc.nextDouble();
        System.out.print("Enter the marks of second subject more than 100:");
        double num2=sc.nextDouble();
        System.out.print("Enter the marks of third subject more than 100:");
        double num3=sc.nextDouble();
        double totalmarks=num1+num2+num3;
        System.out.println("\nThe total marks of four subject is "+ totalmarks);
        double percentage=totalmarks/3;
        System.out.println("The percentage of four subjects are "+ percentage+"%");
    }
}