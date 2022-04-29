package functionalInterfaces;

public class SendingThread extends Thread{
    private String message;
    
    Sender sender;
    SendingThread(String msg, Sender send){
    	this.message = msg;
    	this.sender = send;
}
    public void run() {
    	synchronized(sender) {
    		sender.send(message);
    	}
    }
}