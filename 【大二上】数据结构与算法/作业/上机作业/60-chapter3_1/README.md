多项式加法:
用链表实现多项式加法

完成函数  public Node add(Node link1, Node link2)
提示：link1 link2 分别为两条链表的头节点(多项式从下一个节点开始，若为空多项式，则仅含头节点)
函数请返回结果多项式的第一个节点，不要返回头节点。

Node定义:
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

