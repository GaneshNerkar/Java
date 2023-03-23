class Arithmatic
{
    public int Division(int A, int B) throws ArithmaticException
    {
        int Ans = 0;
        Ans = A/B;
        return Ans
    }
}
class ThrowsDemo()
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter first number");
        int no1 = sobj.nextInt();
        System.out.println("Enter second number");
        int no2 = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();

        try
        {
            int Ret = aobj.Division(no1,no2);
            System.out.println("Division is:"+Ret);
        }
        catch(ArithmaticException obj)
        {
            System.out.println("Exception Occured");
            System.out.println(obj);
        }

    }
}