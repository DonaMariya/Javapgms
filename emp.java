class Employee
{
    int id;
    String Name;


public String getName() 
{ return Name; }
public void setName(String  Z) 
{ this.Name = Z; }
 
public int getid()
{ return id; }
 
public void setid(int id) 
{ this.id = id; }
}
public class emp
{
    public static void main(String[] args)
    {
        Employee e=new Employee();
        e.Name="James Bond";
        e.id=007;
        
        e.getName();
        e.setName("James");
        e.getid();
        e.setid(007);
        
        

    }
}
