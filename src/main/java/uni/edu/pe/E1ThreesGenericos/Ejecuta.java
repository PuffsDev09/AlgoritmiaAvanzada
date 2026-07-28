package uni.edu.pe.E1ThreesGenericos;

public class Ejecuta {

    static void main(String[] args) {
        BSTree arbolinho = new BSTree();

        arbolinho.insertBSTNode(8, "8");
        arbolinho.insertBSTNode(3, "3");
        arbolinho.insertBSTNode(10, "10");
        arbolinho.insertBSTNode(1, "1");
        arbolinho.insertBSTNode(6, "6");
        arbolinho.insertBSTNode(14, "14");
        arbolinho.insertBSTNode(4, "4");
        arbolinho.showPreOrder();
        System.out.println(" ");
        arbolinho.showInOrder();
        System.out.println(" ");
        arbolinho.showPostOrder();
        System.out.println(" ");
        System.out.println(arbolinho.find(8));
        arbolinho.insertBSTNode(8, "Holaa");
        System.out.println(arbolinho.find(8));
        System.out.println(" ");
        arbolinho.showInOrder();
    }

}
