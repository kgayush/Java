// Message class

class Message {
    String text;
    boolean isEmpty;

    public synchronized String read() {                 // synchronized function read
        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return this.text;                           
    }

    public synchronized void write(String myText) {             // synchronized function write
        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        this.isEmpty = false;
        this.text = myText;
    }
}

// Writer thread using thread extend method

class Writer extends Thread {
    Message message;

    Writer(Message myMessage) {
        this.message = myMessage;
    }

    @Override
    public void run() {
        try {
            message.write("Hello World!");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}

// Reader thread using thread extend method

class Reader extends Thread {
    Message message;

    Reader(Message myMessage) {
        this.message = myMessage;
    }

    @Override
    public void run() {
        try {
            String myMessage = message.read();
            System.out.println(myMessage);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        Message myMessage = new Message();
        Writer writer = new Writer(myMessage);
        Reader reader = new Reader(myMessage);
        writer.start();
        reader.start();
    }
}
