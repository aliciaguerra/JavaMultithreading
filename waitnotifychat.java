class Chat {
   boolean flag=false;
   
   public synchronized void Question(String msg){
     if(flag) {
       try{
         wait();
       } catch(InterruptedException e){
        e.printStackTrace();
         }
        }
      System.out.println(msg);
      flag=true;
      notify();
      }
      
  public synchronized void Answer(String msg){
  if(!flag) {
   try{
     wait();
     } catch(InterruptedException e) {
      e.printStackTrace();
       }
      }
      
      System.out.println(msg);
      flag=false;
      notfiy();
       }
      }
      
    class T1 implements Runnable{
      chat m;
      String[] s1 = {"Hi", "How are you", "I am also doing fine"};
      
      public T1(Chat m1){
         this.m=m1;
         new Thread(this, "Question").start();
      }
      
      public void run(){
         
      }
      
      
      
       
