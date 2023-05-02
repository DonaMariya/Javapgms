class C{
    public C()
    {
        System.out.println("C constructor");
    }
    public void show()
    {
        System.out.println("showw"); 
    }
}


public class Anony{
    public static void main(String args[])
    {
        new C().show();
    }
}