class Maths
{
    public int no1;
    public int no2;

    public Maths()
    {
        System.out.println("Inside default constructor");
        no1 = 0;
        no2 = 0;

    }
    public Maths(int a, int b)
    {
        System.out.println("Indide parametrised constructor");
        no1 = a;
        no2 = b;
    }

    public int Addition()
    {
        int ans = 0;
        ans = no1 + no2;
        return ans;
    }

    public int Substraction()
    {
        int ans = 0;
        ans = no1 - no2;
        return ans;
    }

} // end of maths class


class Demo
{
    public static void main(String args[])
    {
        System.out.println("Inside main Function");

        Maths mobj = new Maths();
        Maths mobj2 = new Maths(10,11);

        int ret = 0;
        ret = mobj.Addition();
        System.out.println("Addition is :" + ret);

        ret = mobj2.Addition();
        System.out.println("Addition is:" + ret);
    }

}