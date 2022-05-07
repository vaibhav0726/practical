public class employee{
    int salary;
    String name;
    String designation;

    public employee(int salary, String name, String designation){
        this.designation = designation;
        this.name = name;
        this.salary = salary;
    }
}
class Tree{
    employee data;
    Tree left;
    Tree right;
    Tree(employee data){
        this.data = data;
    }
}
class Test{
    public static Tree root;
    public Tree insert(Tree root,Tree newnode)
    {
        if(root==null)
        {
            root = newnode;
            return root;
        }
        else if(root==null) {
            return newnode;
        }

        else if(root.data.name.compareTo(newnode.data.name) > 1)
        {
            root.left=insert(root.left,newnode);
            return root;
        }
        else
        {
            root.right=insert(root.right,newnode);
            return root;
        }
    }
    public void postorderDisplay(Tree root)
    {
        if(root==null)
        {
            return;
        }
        postorderDisplay(root.left);
        postorderDisplay(root.right);
        System.out.println(root.data.name + " ");
    }
    public static void inorderDisplay(Tree root)
    {
        if(root==null)
        {
            return;
        }
        inorderDisplay(root.left);
        System.out.println(root.data.name + " ");
        inorderDisplay(root.right);
    }
    public void preorderDisplay(Tree root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data.name + " ");
        preorderDisplay(root.left);
        preorderDisplay(root.right);
    }
    public static void main(String[] args) {
        Tree obj1 = new Tree(new employee(10000,"ajay","new employee"));
        Tree obj2 = new Tree(new employee(20000,"vinay","saleman"));
        Tree obj3 = new Tree(new employee(30000,"dinesh","assistent"));
        Tree obj4 = new Tree(new employee(40000,"om","manager"));
        Tree obj5 = new Tree(new employee(50000,"vaibhav","ceo"));
        Test t = new Test();
        obj1 = t.insert(obj1,obj2);
        obj1 = t.insert(obj1,obj3);
        obj1 = t.insert(obj1,obj4);
        obj1 = t.insert(obj1,obj5);
        System.out.println("Inorder :-");
        t.inorderDisplay(obj1);
        System.out.println("preorder :-");
        t.preorderDisplay(obj1);
        System.out.println("postorder :-");
        t.postorderDisplay(obj1);
    }
}

//class Tree{
//    employee root = null;
//    public void insert(employee e){
//        if(root == null){
//            root = e;
//        }
//        else{
//            if(e)
//        }
//    }
//}
