public class ThreadDemo {
 public static void main(String args[]){
  Runnable hello = new DisplayMessage("Hello");
  Thread thread1 = new Thread(hello);
  thread1.setDaemon(true);
  
