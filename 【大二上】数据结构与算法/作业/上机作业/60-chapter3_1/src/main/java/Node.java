public class Node {
    public int coef;//系数  
    public int exp;//指数  
    public Node next=null;//下个节点  
    public Node(){  
        coef=0;  
        exp=0;  
    }  
    public Node(int coef,int exp){  
        this.coef=coef;  
        this.exp=exp;  
    } 
}
