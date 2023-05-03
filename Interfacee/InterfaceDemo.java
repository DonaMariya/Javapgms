package Interfacee;
interface Sample{
    int calculate(int n);
}

public class InterfaceDemo {
    public static void main(String[] args){
        Sample s=(int n) -> n+1;
        System.out.println(s.calculate(1));

    }
    
}
