package uni.edu.pe.E1ThreesGenericos;

public class BSTree implements IBSTree {

    public BSTNode root;
    public int size = 0;

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void showPreOrder() {
        showPreOrder(root);
    }

    @Override
    public void showPreOrder(BSTNode root) {
        if(root == null){
            return;
        }

        System.out.print(root.elem + " ");

        showPreOrder(root.leftChild);
        showPreOrder(root.rightChild);

    }

    @Override
    public void showPostOrder() {
        showPostOrder(root);
    }

    @Override
    public void showPostOrder(BSTNode root) {
        if(root == null){
            return;
        }

        showPostOrder(root.leftChild);
        showPostOrder(root.rightChild);
        System.out.print(root.elem + " ");
    }

    @Override
    public void showInOrder() {
        showInOrder(root);
    }

    @Override
    public void showInOrder(BSTNode root) {
        if(root == null){
            return;
        }

        showInOrder(root.leftChild);
        System.out.print(root.elem + " ");
        showInOrder(root.rightChild);
    }

    @Override
    public void showLevelOrder() {

    }

    @Override
    public void insertBSTNode(int key, String elem) {
        BSTNode newNode = new BSTNode(key, elem);
        if (root == null) {
            root = newNode;
        } else {
            insertBSTNode(root, newNode);
        }
    }

    @Override
    public void insertBSTNode(BSTNode root, BSTNode newNode) {
        if(newNode.key < root.key){
            if(root.leftChild == null){
                root.leftChild = newNode;
                newNode.parent = root;
            } else {
                insertBSTNode(root.leftChild, newNode);
            }
        } else if (newNode.key > root.key) {
            if (root.rightChild == null) {
                root.rightChild = newNode;
                newNode.parent = root;
            } else {
                insertBSTNode(root.rightChild, newNode);
            }
        } else {
            root.elem = newNode.elem;
        }
    }

    @Override
    public void remove(int key) {

    }

    @Override
    public String find(int key) {
        return find(key, root);
    }

    @Override
    public String find(int key, BSTNode root) {

        if (root == null) {
            return null;
        } else if(key < root.key){
            return find(key, root.leftChild);
        } else if (key > root.key) {
            return find(key, root.rightChild);
        } else {
            return (root.elem);
        }
    }
}
