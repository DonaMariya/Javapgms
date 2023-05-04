package Exceptions;
class Demo
{
    public void display(){
        System.out.print( " error:354566");
    }

}
 class errExcept extends Exception{
    public errExcept(String s){
    super(s);
    }

}



public class ExceptionDemo {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        Demo d=new Demo();
        d=null;
        try
        {
            // b=a/0;
            if(b==0){
                throw new errExcept("INVALID");

            }
            
        }
        
         catch (Exception e) {
            System.out.print( " error"+e.getMessage());
            
        }
        // catch(Exception e)
        // {
        //     System.out.print( " error"+e.getMessage());
        // }
        // catch(ArithmeticException e)
        // {
        //     System.out.print( " error"+e.getMessage());
        // }
        // catch(NullPointerException e)
        // {
        //     System.out.print( " error"+e.getMessage());
        // }
        }
    
}
