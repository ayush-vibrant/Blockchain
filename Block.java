import java.util.Arrays;

public class Block {
    private int previousBlockHash;
    private String[] transactions;
    private int currrentBlockHash;

    public Block (int previousBlockHash, String[] transactions){
        this.previousBlockHash = previousBlockHash;
        this.transactions = transactions;

        Object[] contents = {Arrays.hashCode(transactions), previousBlockHash};
        this.currrentBlockHash = Arrays.hashCode(contents); 
        // If someone tries to tamper to with previousBlockHash or with transactions, currrentBlockHash will be completely different
    }

    public int getPreviousBlockHash{
        return previousBlockHash;
    }

    public int getTransactions{
        return transactions;
    }
    public int getCurrrentBlockHash{
        return currrentBlockHash;
    }
}