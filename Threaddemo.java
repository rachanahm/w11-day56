class Runnable extends Thread{
  public void run(){
    for(int i=1; i<=10; i++){
      System.out.println(i);
    }
  }
}

class Threaddemo{
  public static void main(String args[]){
    Runnable r=new Runnable();
    r.start();
  }
}
