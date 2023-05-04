
package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// class Employee implements Comparable<Employee>{
//     int age;
//     String name;

//     public Employee(int age, String name){
//         this.age = age;
//         this.name = name;
//     }

//     @Override
//     public int compareTo(Employee o) {
//         if(this.age > o.age){
//             return -1;
//         }else {
//             return 1;
//         }
//     }
// }

// public class ComparatorDemo {
//     public static void main(String[] args) {
//         List<Employee> list = new ArrayList<>();
//         list.add(new Employee(21, "Emp 1"));
//         list.add(new Employee(22, "Emp 2"));
//         list.add(new Employee(23, "Emp 3"));
//         list.add(new Employee(28, "Emp 4"));
//         list.add(new Employee(24, "Emp 5"));
//         list.add(new Employee(29, "Emp 1"));

//         Collections.sort(list);
//         for(Employee e: list){
//                         System.out.println(e.name + " : "+ e.age);
//                     }
//     }
// }

class Employee{
    int age;
    String name;

    public Employee(int age, String name){
        this.age = age;
        this.name = name;
    }


}

public class ComparatorDemo {
    public static void main(String[] args) {
        Comparator<Employee> comp = (obj1, obj2) -> obj1.age > obj2.age? 1: -1;
        
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(21, "Emp 1"));
        list.add(new Employee(22, "Emp 2"));
        list.add(new Employee(23, "Emp 3"));
        list.add(new Employee(29, "Emp 4"));
        list.add(new Employee(24, "Emp 5"));
        list.add(new Employee(22, "Emp 8"));
        Collections.sort(list, comp);
        for(Employee e: list){
            System.out.println(e.name + " : "+ e.age);
        }
    }
}