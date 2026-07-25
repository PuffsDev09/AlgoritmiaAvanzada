package uni.edu.pe.E1ThreesGenericos;

public class BSTNode {

    public int key;
    public String elem;

    public BSTNode parent = null;
    public BSTNode leftChild = null;
    public BSTNode rightChild = null;

    public BSTNode(int key, String elem) {
        this.key = key;
        this.elem = elem;
    }


}
