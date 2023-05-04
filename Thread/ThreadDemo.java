package Thread;
class ThreadOne extends Thread{ 
    public void run(){
for (int i=0; i<5; i++){
 System.out.println("thread one "+i);
 }

}

}
class ThreadTwo extends Thread{ 
public void run(){
for (int i=0; i<5; i++){
System.out.println("thread two "+i);

}

}

}

public class ThreadDemo {

 public static void main(String[] args) {

ThreadOne td1 = new ThreadOne();

ThreadTwo td2 = new ThreadTwo();

td1.start();

 td2.start();

}

}
