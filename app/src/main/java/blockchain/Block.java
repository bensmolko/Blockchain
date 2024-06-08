package blockchain;
import java.util.ArrayList;
import java.util.Arrays;

public class Block{
    private String prev;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    private int nonce = 0;

    public Block(){

    }

    public Block(String prev, ArrayList<Transaction> transactions){
        this.prev=prev;
        this.transactions=transactions;
    }

    public String getPrev(){
        return prev;
    }

    public ArrayList<Transaction> getTransactions(){
        return transactions;
    }

    public int getNonce(){
        return nonce;
    }

    public void changeHash(){
        nonce++;
    }

    


}