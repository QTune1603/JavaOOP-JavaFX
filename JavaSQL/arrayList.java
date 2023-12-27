
package JavaSQL;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        //add(): them 1 ptu o cuoi arraylist
        
        //get(): lay ra 1 ptu o chi so
        
        //size(): lay ra size cua arraylist
        
        //clear(): xoa toan bo ptu trong araylist
        
        //isEmpty(): ktra arraylist co rong khong
        
        //contains(): ktra su ton tai cua 1 gia tri trong arr O(n)
        
        //remove(index): xoa 1 phan tu khoi chi so index
        
        //remove(object): xoa 1 ptu thong qua gia tri, neu 1 arr nhieu ptu object,
        //thi ham nay chi xoa vi tri dau tien
        
        //toArray(): tra ve mang chua cac object tuong tu nhu trong arrlist
        
        //indexOf(): tra ve chi so dau tien cua 1 ptu trong arrlist
        //neu chi so nay ko xuat hien tra ve -1
        
        //forEach(): cung cap mot ap dung ham nao do voi lan luot cac ptu
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            int x = sc.nextInt();
            arr.add(x);
        }
        //arr.remove(4); //xoa ptu o chi so 4
        //arr.remove((Object)3); //xoa chi so co gia tri la 3
        //neu co nhieu so 3 xuat hien thi chi xoa dc so 3 dau tien
        arr.forEach((i) -> System.out.print(i + " "));;
       }
}
