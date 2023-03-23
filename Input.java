import java.util.*;
//import java.util.Scanner;

class Input
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int no1 = 0, no2 = 0, no3 = 0;

        System.out.println("Enter 1st number");
        no1 = sobj.nextInt();

        System.out.println("Enter 2nd number");
        no2 = sobj.nextInt();

        no3 = no1 + no2;

        System.out.println("Addition is:" +no3);
    }
}