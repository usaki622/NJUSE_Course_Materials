public class PolynList {

    //多项式相加
    public Node add(Node link1, Node link2) {
        Node a = link1.next;
        Node b = link2.next;
        Node c = new Node();
        Node result = c; //两个引用指向同一个对象

        while(!(a == null||b == null)){
            if(a.exp == b.exp){
                a.coef = a.coef + b.coef;
                if(a.coef != 0){
                    c.next = a;
                    c = a;
                }
                a = a.next;
                b = b.next;
            }else if(a.exp < b.exp){
                c.next = a;
                c = a;
                a = a.next;
            }else if (a.exp > b.exp){
                c.next = b ;
                c = b;
                b = b.next;
            }
        }

        c.next = a == null? b:a;

        return result.next;
    }

}
