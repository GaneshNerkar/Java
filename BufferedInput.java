class BufferedInput
{
    public static void main(String A[])
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter your name :");
        String name = bobj.readLine();

        System.out.println("Enter your age :");
        int name = Integer.parseInt(bobj.readLine());

        System.out.println("Enter your Marks :");
        float Marks = Float.parseFloat(bobj.readLine());
    }
}