package src;

import java.util.Scanner;

public class TriangleShape {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter side 1. side 2 and side 3 of triangle");
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();

        if(side1==side2 && side2==side3){
            System.out.println("Equilateral Triangle");
}           else  if((side1==side2) ||(side2==side3)) {
            System.out.println("Isosceles Triangle");
        }else {
            System.out.println("Scalene Triangle");
}
}
}