# DSandAlgoTrees

Level Order Traversal using iterative approach 
/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 *
 
 Algorithm:

printLevelorder(tree)
1) Create an empty queue q
2) temp_node = root /start from root /
3) Loop while temp_node is not NULL
    a) print temp_node->data.
    b) Enqueue temp_node’s children 
      (first left then right children) to q
    c) Dequeue a node from q.

 */
class Node{
         int val;
        Node left;
        Node right;
    public Node(int val)
    {
      this.val = val;
    }            
  }

class Solution {
  public static void main(String[] args) {
    
    Node node = new Node(3);
    node.left = new Node(4);
    node.right = new Node(8);
    node.left.left = new Node(1);
    node.left.right = new Node(2);
    node.right.left = new Node(6);
    node.right.right = new Node(7);
   levelOrderTraversal(node);
  }
  public static void levelOrderTraversal(Node root)
  {
   Queue<Node> q = new LinkedList<Node>();
    Node temp = root;
    while(temp != null)
    {
       
      System.out.print(temp.val);
      
      if(temp.left != null)
      {
        q.add(temp.left);
       }
      if(temp.right != null)
      {
       q.add(temp.right); 
      }
      temp = q.poll();    
  }
}
  }
