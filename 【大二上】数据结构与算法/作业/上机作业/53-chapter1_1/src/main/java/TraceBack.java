import java.util.HashSet;

public class TraceBack {
    int[] a = new int[10000];
    HashSet<HashSet<Integer>> b = new HashSet<HashSet<Integer>>();
    HashSet<Integer> c = new HashSet<Integer>();
    boolean flag = true;


    public HashSet<HashSet<Integer>> traceBack(int n, int k){
        if(flag){
            a[0] = k;
        }
        if(k == 0){
            b.add(new HashSet<Integer>(c));
            return b;
        }
        flag = false;
        for(int i = n;i >= k;i--){
            a[k] = i;
            if(k > 1){
                traceBack(i-1,k-1);
            }else{
                for(int j = a[0];j > 0;j--){
                    c.add(a[j]);
                }
                b.add(new HashSet<Integer>(c));
                c.clear();
            }
        }
        return b;
    }
}
