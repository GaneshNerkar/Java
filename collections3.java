class Book
{
    public String Name;
    public int Price;
    
    public Book(String s, int i)
    {
        this.Name= s;
        this.price = i;
    }

    public Void display()
    {
        System.out.println("Book name :"+this.Name+"price"+this.price);
    }
}


class collections3
{
    public static void main(String arg[])
    {
        LinkedList<Book>obj = new LinkedList<Book>();

        obj.add(new Book("Let us C",400));
        obj.add(new Book("Data Structures",400));
        obj.add(new Book("C++",980));
        obj.add(new Book("Web development",790));

        Iterator iobj = lobj.iterator();
        Book bref = null;

        System.out.println("Elements of LinkedList are");

        while(iobj.hasNext())
        {
            bref = (Book)iobj.next();
            bref.display();
        }

        lobj.clear();

    }

}