public class TestThread {
 public static Object Lock1 = new Object();
 public static Object Lock2 = new Object();
 
 public static void main(String args[]) {
  ThreadDemo T1 = new ThreadDemo1();
  ThreadDemo T2 = new ThreadDemo2();
  T1.start();
  T2.start();
  }
  
  private static class ThreadDemo1 extends Thread {
