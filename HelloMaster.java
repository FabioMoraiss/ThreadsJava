public class HelloMaster {
    public void lestGetSomeHellos(int threadsNumber ) {

        Thread[] ts = new Thread[threadsNumber];
        
        for(int i = 0; i<threadsNumber; i++) {
           ts[i]= new Thread(new HelloFromThread(i));
           ts[i].start();
        }
       

        System.out.println("threads criadas");
    }
}
