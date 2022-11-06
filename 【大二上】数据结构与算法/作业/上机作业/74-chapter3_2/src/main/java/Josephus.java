//此oj需要手动引入工具类，直接用会报“编译或运行失败”，如需要用ArrayList，需要手动引入，
//如：import java.util.ArrayList;

//只测试了暴力求解和公式法，都是可以通过的，测试用例比较少，不用担心；
//常见的问题都给了注释，还遇到bug找群里的小伙伴交流一下。

public class Josephus {
    public static int lastRemaining(int n, int m) {//不要更改这里的static修饰符
        // 具体代码写这里
		
		// 另外因为语言级别的问题，菱形操作符里的具体类型全部要写上，不然可能也会报错；
		// 如：ArrayList<Integer> list = new ArrayList<Integer>(n);

        //上面注释其实不用管，用arraylist感觉就脱离了这节课的主题
        //上课的主题是链表，那就用链表好惹qwq
        Node p = new Node(-1);
        Node s = p;

        for(int i = 1;i <= n;i++){
            p.next = new Node(i - 1);
            p = p.next;
        }
        p.next = s.next;

        for(int i = 1;i <= n - 1;i++){
            for(int j = 1;j <= m - 1;j++){
                s = s.next;
            }
            s.next = s.next.next;
        }
        return s.coef;
    }

}

