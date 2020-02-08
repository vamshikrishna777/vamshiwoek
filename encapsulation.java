class library
{
    private int sal,m;
    private String headname,s;
    public int getsal(){
        return sal;
    }
   
    public String getheadname(){
        return headname;
    }
    public void setsal(int n){
        sal=n;
    }
   
      public void setheadname(String s){
        headname=s;
    }
    }
public class domain
{
    public static void main(String args[]){
        library obj= new library();
        obj.setsal(5000);
        obj.setheadname("ramu");
        System.out.println("head of library:"+obj.getheadname());
        System.out.println("salary for each employee"+obj.getsal());
    }
}