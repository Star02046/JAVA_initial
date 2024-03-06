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
//

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a==1) {
            System.out.println("Nameste");
        }
        else if (a==2){
            System.out.println("Hello");
        } else if (a==3) {
            System.out.println("bonjour");

        }
        else{
            System.out.println("Enter no between 1 to 3");
        }

    }

}