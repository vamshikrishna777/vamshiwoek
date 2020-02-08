abstract class library
{
    abstract void book();
    abstract void fine();
    void display()
    {
        System.out.println("THE BOOK IS ISSUED FOR 15 DAYS");
    }
}
class school extends library
{
    void book()
    {
        System.out.println("THE BOOK NAME IS MAHABARATH");
    }
    void fine()
    {
        System.out.println("IF THE BOOK NOT SUBMITTED IN TIME,FINE PER DAY IS RS 10");
    }
}
class collage extends library
{
    void book()
    {
        System.out.println("THE BOOK NAME IS RAMAYANA");
    }
    void fine()
    {
        System.out.println("IF THE BOOK NOT SUBMITTED IN TIME,FINE PER DAY IS RS 20");
    }
}
public class example
{
    public static void main(String args[])
    {
        library c;
        c=new school();
        c.book();
        c.display();
        c.fine();
        c=new collage();
        c.book();
        c.display();
        c.fine();
       
    }
}