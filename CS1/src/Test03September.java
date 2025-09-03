abstract class Payment {
    double amount;
    String transactionId;
    String Time;

    Payment(double amount, String transactionId, String Time) {
        this.amount = amount;
        this.transactionId = transactionId;
        this.Time = Time;
    }

    void generateReceipt() {
        System.out.println("Receipt: Txn " + transactionId + " for amount " + amount);
    }
    abstract void processPayment();}



interface Refundable {
    void refund(double amount);
}

class CabBooking extends Payment implements Refundable{

    CabBooking(double amount, String transactionId, String Time) {
        super(amount, transactionId,Time);
    }
    void processPayment(){
        System.out.println("Processing payment of " + amount);

    }
    public void refund(double amount) {

        System.out.println("Refunding : " + amount);
    }

    public void TimeOfCancel(double amount) {

        System.out.println("Timing of cancel : " + Time);
    }

}

class TrainBooking extends Payment implements Refundable{


    TrainBooking(double amount, String transactionId,String Time) {
        super(amount, transactionId,Time);
    }

    @Override
    void processPayment() {
        System.out.println("Processing payment of " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding : " + amount);

    }

    public void TimeOfCancel(double amount) {

        System.out.println("Timing of cancel : " + Time);
    }
}

class BusBooking extends Payment implements Refundable{

    BusBooking(double amount, String transactionId, String Time) {
        super(amount, transactionId, Time);
    }

    @Override
    void processPayment() {
        System.out.println("Processing payment of " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding : " + amount);
    }

    public void TimeOfCancel(double amount) {

        System.out.println("Timing of cancel : " + Time);
    }
}


public class Test03September {


    public static void main(String[] args) {
        CabBooking P1 = new CabBooking(500,"CAB101","10 AM");

        TrainBooking P2 = new TrainBooking(1200, "TRN202", "08PM");

        BusBooking P3 = new BusBooking(5000,"BUS303", "8:30 AM");

        P1.processPayment(); P1.generateReceipt();
        P2.processPayment(); P2.generateReceipt();
        P3.processPayment(); P3.generateReceipt();

        P1.refund(300);
        P2.refund(1000);
        P3.refund(4600);


    }
}
