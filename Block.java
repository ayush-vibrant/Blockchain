import java.util.Arrays;

public Class Block {
    private int previousBlockHash;
    private String[] transactions;
    private int currrentBlockHash;

    public Block (int previousBlockHash, String[] transactions){
        this.previousBlockHash = previousBlockHash;
        this.transactions = transactions;

        Object[] contents = {Arrays.hashCode(transactions), previousBlockHash};
        this.currrentBlockHash = Arrays.hashCode(contents);

    }
}