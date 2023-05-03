package abstractt;
 abstract class Forest{
    public abstract void displayTrees();
    
    public void displayFruits()
    {
        System.out.println("Display Fruits");
    }

}
class Amazon extends Forest{
    public void displayTrees()
    {
        System.out.println("Display Amazon forest's Fruits");
    }

}
class Black extends Forest{
    public void displayTrees()
    {
        System.out.println("Display Black forest's Fruits");
    }

}

public class abstraction {
    public static void main(String[] args)
    {
        Forest f=new Amazon();
        // Forest f1=new Black();
        f.displayTrees();
        f.displayFruits();

    }
}
