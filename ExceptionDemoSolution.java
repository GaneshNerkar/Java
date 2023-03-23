class ExceptionDemoSolution
{
    public static void main (String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int no1 = 0;
        int no2 = 0;
        int ans = 0;

        System.out.println("Enter first number");
        no1 = sobj.nextInt();

        System.out.println("Enter second number");
        no2 = sobj.nextInt();

        ans = no1/no2;
        System.out.println("Division is :" + ans);
        
    }
}