package InterfaceDemo;
interface Rectangle{
    void displaylength();

}
class Area implements  Rectangle{  
    public void displaylength()
    {
        System.out.println("Display Area");
    }
}
 

public class Interfacee {
    public static void main(String[] args) {
        Rectangle r = new Area();
        r.displaylength();
    }
    
}


