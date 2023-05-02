class Tree{
    public void display(){
        System.out.println("Tree");
    }
}
class Fruit extends Tree{
    public void display(){
        super.display();
        System.out.println("Fruit");
    }
}
class Apple extends Fruit{
    public void display(){
        super.display();
        System.out.println("Apple");
    }
}
public class Multi
{
    public static void main(String args[])
    {
    Apple a = new Apple();
    a.display();

}
}