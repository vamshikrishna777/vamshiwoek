class library
{
    String available="ramanujan" ;
    void available()
    {
        System.out.println("the books available are");
       
    }
}
 public class Smartlibrary extends library
{
    String another="pandey";
    public static void main(String args[])
    {
      Smartlibrary obj = new Smartlibrary();
     
      obj.available();
      System.out.println(obj.another);
      System.out.println(obj.available);
    }
}
