package Tree;

public class PrintLeftView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeTravesal bt = new TreeTravesal();
		bt.insert(1);
		bt.insert(2);
		bt.insert(4);
		bt.insert(5);
		bt.insert(3);
		
		bt.inorder();
		System.out.println();
		
		
	}
	
    static int maxlevel=0;
    void leftView(Node root)
    {
        if(root==null)
            return ;
        
        maxlevel=0;
        leftviewutil(root,1);
    }
    
    void leftviewutil(Node node,int level){
        if(node==null)
            return ;
        
        if(maxlevel<level){
            System.out.print(node.data+" ");
            maxlevel=level;
        }
        
        leftviewutil(node.left,level+1);
        leftviewutil(node.right,level+1);
        
        return ;
        
    }

}
