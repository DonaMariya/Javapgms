
class ThreadOne implements Runnable{ 
    public void run(){
for (int i=0; i<5; i++){
 System.out.println("thread one "+i);
 try{
    Thread.sleep(10000);
 }
 catch(InterruptedException e){
    e.printStackTrace();
 }
 }

}

}
// class ThreadTwo extends Thread{ 
// public void run(){
// for (int i=0; i<5; i++){
// System.out.println("thread two "+i);

// }

// }

// }

 class ThreadDemo {

 public static void main(String[] args) {

    Runnable ch2 = ()->{
        for (int i=0; i<5; i++){
             System.out.println("thread two "+i);
             try{
                Thread.sleep(10000);
             }
             catch(InterruptedException e){
                e.printStackTrace();
             }
    }
    };

ThreadOne ch1 = new ThreadOne();

// ThreadTwo td2 = new ThreadTwo();
Thread t1 = new Thread(ch1);

Thread t2 = new Thread(ch2);

t1.start();

 t2.start();

}

}