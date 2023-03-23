class Loops
{
    public static void main(String arg[])
    {
        int Arr[] = {10,20,30,40};
        int icnt = 0;

        System.out.println("Traversal of array using for loop");
        for(icnt = 0; icnt < Arr.length; icnt++)   //Same in c,C++,Java
        {
            System.out.println(Arr[icnt]);
        }

        System.out.println("Traversal of array using for loop");
        icnt = 0;
        while(icnt < Arr.length)  //Same in c,C++,Java
        {
            System.out.println(Arr[icnt]);
            icnt++;
        }

        System.out.println("Traversal of array using do while loop");
        icnt = 0;
        do //Same in c,C++,Java
        {
            System.out.println(Arr[icnt]);
            icnt++;
        }while(icnt < Arr.length);

        System.out.println("Traversal of array using for each loop");
        for(int ino : Arr) //only in java
        {
            System.out.println(ino);
        }


    }
}