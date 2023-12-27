
package JavaSQL;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Hashset
LinkedHashSet
TreeSet

Ap dung trong cac bai toan: 
-xoa,them, tim kiem mot ptu nao do dc thuc hien lai nhieu lan
-cac bai toan lien quan toi cac gtri khac nhau cua mang

+)HashSet
-Chi luu dc cac ptu khac nhau
-dc cai dat = bang bam => toc do tim kiem:O(1)
-HashSet ko co thu tu, tuc la cac ptu trong HashSet co the xuat hien nhieu 
thu tu bat ki
-HashSet chi luu dc cac ptu kieu doi tuong
-Mot so ham thong dung trong HashSet:
add(): them ptu vao set
remove(): xoa ptu khoi set
size(): tra ve so luong ptu trong set
contains(): ktra su ton tai cua 1 ptu trong set
clear(): Xoa moi phan tu trong set
isEmpty(): tra ve true neu set rong, nguoc lai tra ve false;

//LinkedHashSet: tuong tu nhu HashSet tru viec duyet cac ptu theo thu tu

//TreeSet:
-TreeSet chi luu dc cac ptu khac nhau
-TreeSet dc cai dat bang cay do den(Red-Black-Tree), cac ham tim kiem,xoa cua 
TreeSet la LogN
-TreeSet co thu tu la thu tu tang dan
-TreeSet chi luu dc cac ptu kieu doi tuong
-Cac ham thong dung :
floor(x): tra ve ptu lon nhat <= x hoac tra ve null neu ko ton tai
ceiling(x): tra ve ptu nho nhat >= x hoac tra ve null neu ko ton tai
first(): tra ve ptu dau tien trong set
last(): Tra ve ptu cuoi cung trong set
lower(x): tra ve ptu lon nhat nho hon x hoac tra ve null neu ko ton tai
higher(x): tra ve ptu nho nhat lon hon x hoac tra ve null neu ko ton tai

*/
public class hamSet {
    public static void main(String[] args) {
        //HashSet
//        Set<Integer> set1 = new HashSet<>();
//        HashSet<Integer> set2 = new HashSet<>();
//        int a[] = {1,1,2,1,3,1,4,4,2};
//        for(int x:a){
//            set1.add(x);
//        }
        //kich thuoc set
        //System.out.println(set1.size());
        
        //duyet set
//        for(int x:set1){
//            System.out.print(x + " ");
//        }

        //kiem tra su ton tai cua 1 gtri trong set:
//        if(set1.contains(1)){
//            System.out.println("FOUND");
//        }
//        else {
//            System.out.println("no");
//        }

        //LinkedHashSet
        //cac ham tuong tu nhu HashSet, tru viec duyet cac ptu co thu tu
//        HashSet<Integer> set = new LinkedHashSet<>();
//        int[] a = {1,4,4,4,2,1,3,3};
//        for(int x:a){
//            set.add(x);
//        }
//        for(int x:set){
//            System.out.print(x + " ");
//        }

        //TreeSet:
        TreeSet<Integer> set2 = new TreeSet<>();
        int a[] = {1,4,4,4,2,1,3,3};
        for(int x:a){
            set2.add(x);
        }
        for(int x:set2){
            System.out.print(x + " ");
        }
    }
}
