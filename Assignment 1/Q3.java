// FetchData thread using thread extend method

class FetchData extends Thread {

    @Override                   // overridding the run method
    public void run() {
        try {
            System.out.println("Wait for 5 seconds...");
            Thread.sleep(5000);                             
            System.out.println("FetchData Thread has completed its execution.");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}

// ProcessData thread using Runnable interface

class ProcessData implements Runnable{

    @Override                           // overridding the run ethod
    public void run(){
        try{
            System.out.println("Wait for 10 more seconds...");
            Thread.sleep(10000);
            System.out.println("ProcessData Thread has completed its execution.");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}

public class Q3 {
    public static void main(String[] args) throws InterruptedException {
        FetchData fetchData = new FetchData();
        ProcessData processData = new ProcessData();
        Thread thread = new Thread(processData);
        fetchData.start();                            // fetchData thread will start executing.
        fetchData.join();                            // It will make sure that fetchData is terminated before 
                                                    // the processData is executed.
        thread.start();                             // processData thread will start executing.
    }
}
