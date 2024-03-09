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
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter your choice..");
        int choice = sc.nextInt();


        switch (choice){
            case 1 :
                int sum = a+b;
                System.out.println(sum);
                break;
            case 2 :
                int sub = a-b;
                System.out.println(sub);
                break;
            case 3 :
                int mul = a*b;
                System.out.println(mul);
                break;
            case 4 :
                float div = a/b;
                System.out.println(div);
                break;
            case 5 :
                int mode = a%b;
                System.out.println(mode);
                break;
            default :
                System.out.println("enter the between 1 to 5");




        }
    }
}










