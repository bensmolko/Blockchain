package blockchain;
import java.time.LocalDateTime;

public class Transaction{
    private String paid;
    private double amount;
    private String recieved;
    private LocalDateTime dateTime;
    private int hashCode;

    public Transaction(String paid, double amount, String recieved){
        this.paid=paid;
        this.amount=amount;
        this.recieved=recieved;
        
        dateTime = LocalDateTime.now();

    }

    public String getPaid(){
        return paid;
    }

    public double getAmount(){
        return amount;
    }

    public String getRecieved(){
        return recieved;
    }

    public LocalDateTime getDateTime(){
        return dateTime;
    }

}