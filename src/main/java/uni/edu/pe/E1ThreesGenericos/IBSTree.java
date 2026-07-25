package uni.edu.pe.E1ThreesGenericos;

public interface IBSTree {
    public int getSize();

    public int getHeight();

    public void showPreOrder();

    public void showPreOrder(BSTNode root);

    public void showPostOrder();

    public void showPostOrder(BSTNode root);

    public void showInOrder();

    public void showInOrder(BSTNode root);

    public void showLevelOrder();

    public void insertBSTNode(int key, String elem);

    public void remove(int key);

    public String find(int key);

    public String find(int key, BSTNode root);
}
