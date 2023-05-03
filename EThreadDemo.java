class EvenThread extends Thread{
  public void run(){
    for(int i=2; i<=10; i+=2){
      System.out.println(i);
    }
  }
}

class EThreadDemo{
  public static void main(String args[]){
    EvenThread r=new EvenThread();
    r.start();
  }
}
