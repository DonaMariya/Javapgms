class Employee
{
    int id;
    String Name;
    static String desig;

static
{
    desig="fdfg";
}
}
public class stat
{
    public static void main(String[] args)
    {
        Employee e=new Employee();
        e.Name="James Bond";
        e.id=007;
        System.out.println(e.desig);

    }
}
