class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> ans = new ArrayList<>();
      
      if(root==null)
      {
          return ans;
      }
      
      Queue<Node> q = new LinkedList<>();
      
      q.add(root);
      
      while(!q.isEmpty())
      {
          
          int s = q.size();
          
          for(int i=0;i<s;i++)
          {
              Node rem = q.remove();
              
              if(i==0)
              {
                  ans.add(rem.data);
              }
              
              if(rem.left!=null)
              {
                  q.add(rem.left);
              }
              if(rem.right!=null)
              {
                  q.add(rem.right);
              }
          }
          
      }
      
      return ans;
      
    }
}
