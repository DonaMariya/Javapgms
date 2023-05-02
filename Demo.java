class Employee
{
    int empId;
    String name;
    int salary;
    // String designation;

}

public class Demo{

    public static void main(String[] args) {

    Employee e = new Employee();
    e.empId=007;
    e.name="James";
    e.salary=100000;

    Employee e1=new Employee();
    e1.empId=8;
    e1.name="Bond";
    e1.salary=100000;

    Employee e2=new Employee();
    e2.empId=900;
    e2.name="John";
    e2.salary=150000;

    Employee e3=new Employee();
    e3.empId=100;
    e3.name="Wick";
    e3.salary=100000;

    Employee empArr[] = new Employee[4];
    empArr[0] = e;
    empArr[1] = e1;
    empArr[2] = e2;
    empArr[3] = e3;

    for(Employee emp : empArr)
    {
        System.out.println(emp);
        System.out.println(emp.empId+ " " + emp.name + " " + emp.salary);

    }

}

}