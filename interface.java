interface workers
{
 final int count=15;
 void display();
}
public class noofworkers implements workers
{
   public void display(){
       System.out.println("TOTAL NUMBER OF EMPLOYEES ARE:");
   }
   public static void main(String args[])
   {
       noofworkers obj= new noofworkers();
       obj.display();
       System.out.println(count);
       
   }
}
