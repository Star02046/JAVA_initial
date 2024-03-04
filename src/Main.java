//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//
//        if(age>18){
//            System.out.println("adult");
//
//        }
//        else {
//            System.out.println("not adult");
//        }
//
//
//    }

//check even or odd

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a==b){
            System.out.println("equal");
        } else if (a>b) {
            System.out.println("a is greater");

        } else {
            System.out.println("a is smaller");
        }

    }
}
