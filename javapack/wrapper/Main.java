package javapack.wrapper;
public class Main {
    public static void main(String[] args){

        Class c = new Class1();
        c.display();
        System.out.println(c.getClass());

        Class1 d =(Class1)c;
        System.out.println(d.getClass());

        int num = 10;

        Integer n1 = num;
        System.out.println(n1.getClass().getName());
        int n2 = n1;
        System.out.println(n2);
        
}
}