import javax.swing.*;
//1.Write a program to take student details as input and display the result.
public class Joptionfile{
    public static void main(String[] args){
        int age;
        String name, address;
        name=JOptionPane.showInputDialog( null,"Enter your name:");
        age=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter your age:"));
        address=JOptionPane.showInputDialog( null,"Enter your address:");

        JOptionPane.showMessageDialog(null,"My name is "+name +"\nMy age is "+age+"\nMy address is "+address);
    }
}
//2.Write a program to take student details as input and display the result.
class Resultfile{
    public static void main(String[] args){
        int sub1,sub2,sub3,sub4;

        sub1=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter social subjects marks:"));
        sub2=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter math subjects  marks:"));
        sub3=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter computer subjects marks:"));
        sub4=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter health subjects  marks:"));
        double total=sub1+sub2+sub3+sub4;
        double pe=total/4;
        JOptionPane.showMessageDialog(null,"The total obtained marks is "+total+"\nThe percentage is "+pe+"%");
        if (pe>80 && pe<=100){
            JOptionPane.showMessageDialog(null,"First class");
        }else if (pe>60 && pe<=80){
            JOptionPane.showMessageDialog(null,"supper class");
        }else if (pe>50 && pe<=60){
            JOptionPane.showMessageDialog(null,"second class");
        }else if (pe>40 && pe<=50){
            JOptionPane.showMessageDialog(null,"third class");
        }else{
            JOptionPane.showMessageDialog(null,"Fail");
        }
    }
}
//class resultfile{
//    public static void main(String[] args){
//        int sub1,sub2,sub3,sub4;
//
//        sub1=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter your first marks:"));
//        sub2=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter your second marks:"));
//        sub3=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter your third marks:"));
//        sub4=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter your fourth marks:"));
//        double total=sub1+sub2+sub3+sub4;
//        double percentage=total/4;
//        JOptionPane.showMessageDialog(null,"The total obtained marks is "+total+"\nThe percentage is "+percentage+"%");
//        String result;
//        result =(percentage>79 && percentage<=100)? JOptionPane.showMessageDialog(null,"First class"):
//                (percentage>60 && percentage<=79)? JOptionPane.showMessageDialog(null,"First class"):
//                (percentage>50 && percentage<=60)? JOptionPane.showMessageDialog(null,"First class"):
//                (percentage>=40 && percentage<=50)? JOptionPane.showMessageDialog(null,"First class":);
//
//    }
//}

//3.Write a program to take two integer inputs from user and print sum and product of them.
class Productsum{
    public static void main(String[] args){
        int num1,num2;

        num1=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter  first number:"));
        num2=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter  second number:"));
        double total=num1+num2;
        double product=num1*num2;
        JOptionPane.showMessageDialog(null,"The sum of two integer is "+total+"\nThe product of two integers is "+product);

    }
}

//4.Take two integer inputs from user. first calculate the sum of two then product of two
//finally, print the sum and product of both obtained results.
class Resultobtained{
    public static void main(String[] args){
        int num1,num2;

        num1=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter your first number:"));
        num2=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter your second number:"));
        double total=num1+num2;
        double product=num1*num2;
        JOptionPane.showMessageDialog(null,"The sum of two integer is "+total+"\nThe product of two integers is "+product);
        double total1=total+product;
        double product1=total*product;
        JOptionPane.showMessageDialog(null,"The sum of two obtained results is "+total1+"\nThe product of two iobtained results is "+product1);


    }
}
//5.Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
class typecast{
    public static void main(String[] args){
        int length,breadth;
        length=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter length:"));
        breadth=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter breadth:"));
        double area=(length*breadth);
        Double so=new Double(area);
        int areaofrectangle=so.intValue();
        JOptionPane.showMessageDialog(null,"The area of rectangle is "+areaofrectangle);

    }
}
//6.Take name, roll number and field of interest from user and print in the format below:
// Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
class Datafile{
    public static void main(String[] args){
        int roll;
        String name, interest;
        name=JOptionPane.showInputDialog( null,"Enter your name:");
        roll=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter your roll number:"));
        interest=JOptionPane.showInputDialog( null,"Enter your field of interest:");

        JOptionPane.showMessageDialog(null,"Hey,My name is "+name +"and my roll number is "+roll+". My field of interest is "+interest);
    }
}
//7.take side of square from user and print area and perimeter of it. Also, calculate SI, Area of triangle and volume of Cube and
// Cuboid. take the attributes as user input.
class Perimeter{
    public static void main(String[] args){
        int length;
        length=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter length:"));
        double area=(length*length);
        double perimeter=4*length;
        JOptionPane.showMessageDialog(null,"The area of square is "+area+"The perimeter of square is "+perimeter);

    }
}
class SimpleInterest{
    public static void main(String[] args){
        int principal,rate,time;
        principal=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter principal:"));
        rate=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter rate:"));
        time=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter time:"));
        double SI=(principal*rate*time)/100;
        JOptionPane.showMessageDialog(null,"The simple interest is "+SI);
    }
}
class Areaoftriangle{
    public static void main(String[] args){
        int length,breadth;
        length=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter length:"));
        breadth=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter breadth:"));
        double area=(length*breadth)/2;
        JOptionPane.showMessageDialog(null,"The area of triangle is "+area);

    }
}
class Volume{
    public static void main(String[] args){
        int length,breadth,height;
        length=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter length:"));
        breadth=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter breadth:"));
        height=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter height:"));
        double vcube=length*length*length;
        double vcuboid=length*breadth*height;
        JOptionPane.showMessageDialog(null,"The volume of cube is "+vcube+"The volume of cuboid is "+vcuboid);

    }
}
//8.Write a program to find the square of a number. as input:2 output:4
class NumSquare{
    public static void main(String[] args){
        int num1;
        num1=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter any number:"));
        double square=num1*num1;
        JOptionPane.showMessageDialog(null,"The square of given number is "+square);

        }
}
//9.Take two different string input and print them in same line. Eg: input: code input:does  output: codedoes
class onfile{
    public static void main(String[] args){
      String string1, string2;
        string1=JOptionPane.showInputDialog( null,"Enter any string:");
        string2=JOptionPane.showInputDialog( null,"Enter another string:");

        JOptionPane.showMessageDialog(null,string1+string2);
    }
}
//10.Take 3 inputs from user and check: all are equal any of two are equal (use && // with ternary operator)
class Check{
    public static void main(String[] args){
        int num1,num2,num3;

        num1=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter first input:"));
        num2=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter second input:"));
        num3=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter third input:"));
        if ((num1==num2 && num1==num3)){
            JOptionPane.showMessageDialog(null,"All are equals");
        }else if(num1==num2 || num2==num3 || num3==num1){
            JOptionPane.showMessageDialog(null,"Any of the two are equals ");
        }else{
            JOptionPane.showMessageDialog(null,"None of are equals ");
        }

    }
}
//11.Write a program to enter the values of two variables 'a' and 'b' from keyboard and then check if both the conditions
// 'a<50' and 'a<b' are true.
class conditions{
    public static void main(String[] args){
        int a,b;

        a=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter first value:"));
        b=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter second value:"));

        if (a<50 && a<b) {
            JOptionPane.showMessageDialog(null, "True");
        }else{
            JOptionPane.showMessageDialog(null,"False");
        }

    }
}
//12.if the marks of robert in three subjects are entered through keyboard (each out of 100), write a program to
// calculate his total marks and percentage marks.
class Resultrecord{
    public static void main(String[] args){
        int sub1,sub2,sub3;

        sub1=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter your social marks more than 100:"));
        sub2=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter your science marks more than 100:"));
        sub3=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter your health marks more than 100:"));
        double total=sub1+sub2+sub3;
        double pe=total/3;
        JOptionPane.showMessageDialog(null,"The total obtained marks is "+total+"\nThe percentage is "+pe+"%");

    }
}
//3.Write a program to sum of four numbers for user input.
class sumoffournum{
    public static void main(String[] args){
        int num1,num2,num3,num4;

        num1=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter your first number:"));
        num2=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter your second number :"));
        num3=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter your third number:"));
        num4=Integer.parseInt(JOptionPane.showInputDialog( null,"Enter your fourth number:"));
        double total=num1+num2+num3+num4;
        JOptionPane.showMessageDialog(null,"The sum of four integer is "+total);

    }
}