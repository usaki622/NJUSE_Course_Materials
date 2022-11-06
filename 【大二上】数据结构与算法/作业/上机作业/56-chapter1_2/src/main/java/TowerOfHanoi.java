public class TowerOfHanoi {
    public void Hanoi(int n) {
        move(n,'A','C','B');
    }

    public void move(int n, char a, char b, char c) {
        if(n != 1){
            move(n-1,a,c,b);
            System.out.println("Move disk "+n+" from "+a+" to "+c);
            move(n-1,b,a,c);
        }else{
            System.out.println("Move disk "+n+" from "+a+" to "+c);
        }
    }
}