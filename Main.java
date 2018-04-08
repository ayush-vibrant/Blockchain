import java.util.ArrayList;

public class Main {

    ArrayList<Block> blockchain = new ArrayList<>();
    public static void main (String[] args){
        /* 
        The more blocks are added to genesis block, tampering the blockchain becomes harder and harder,
        because previous hash would be based on prevoius block and so on...
        */
        String[] genesisTransaction = {"Alex sent 5 ETH to Ayush", "Ayush sent 3 ETH to Bob"};
        Block genesis = new Block(0, genesisTransaction);

        // can create any number of Blocks.

        String[] block2Transaction = {"Bob sent 5 ETH to Alex", "Eve received 10 ETH from Ayush"};
        Block block2 = new Block(genesis.getCurrrentBlockHash, block2Transaction);

        // If someone tries to change any transaction in Blockchain 
        // e.g. say in genesisTransaction then change would be visible in whole Blockchain.
    }
}