
package JavaSQL;

import java.util.TreeSet;


public class IntSet {
    private TreeSet<Integer> set;
    
    public IntSet(){
        set = new TreeSet<>();
    }
    
    public IntSet(int a[]){
        set = new TreeSet<>();
        for(int i = 0 ; i < a.length ; i++){
            set.add(a[i]);
        }
    }
    
    public IntSet intersection(IntSet b){
        IntSet giao = new IntSet();
        for(int x : this.set){
            if(b.set.contains(x)){
                giao.set.add(x);
            }
        }
        return giao;
    }
    public IntSet union(IntSet b){
        IntSet hop = new IntSet();
        for(int x : this.set){
            hop.set.add(x);
        }
        for(int x : b.set){
            hop.set.add(x);
        }
        return hop;
    }
    
    public String toString(){
        String res = "";
        for(int x : this.set){
            res += x + " ";
        }
        return res;
    }
}
