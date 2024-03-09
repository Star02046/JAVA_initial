//variable name age should contain numeric type

/*import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(age);

    }
}


//make a program that takes the radius of a circle as input, calculate its radius and area and print it as an output to the user.

import java.util.Scanner;
public class homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double area = 3.14*r*r;
        System.out.println(area);
    }
}



//Make a program that prints the table of a number that is input by the user.

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a*1);
        System.out.println(a*2);
        System.out.println(a*3);
        System.out.println(a*4);
        System.out.println(a*5);
        System.out.println(a*6);
        System.out.println(a*7);
        System.out.println(a*8);
        System.out.println(a*9);
        System.out.println(a*10);

    }
}

*/

//make a calculator and use the basic mathematics operations...

import java.util.Scanner;
public class homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of month..");
        int a = sc.nextInt();

        switch (a){
            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("Feburary");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("June");
                break;
            case 7 :
                System.out.println("July");
                break;
            case 8 :
                System.out.println("August");
                break;
            case 9 :
                System.out.println("September");
                break;
            case 10 :
                System.out.println("October");
                break;
            case 11 :
                System.out.println("November");
                break;
            case 12 :
                System.out.println("December");
                break;
            default :
                System.out.println("enter upto 12");


        }
    }
}










