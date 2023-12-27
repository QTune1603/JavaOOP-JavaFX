
package JavaSQL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//tim kiem tuyen tinh(linearSearch) O(n)
//tim kiem nhi phan(binarySearch) O(logn)

public class search {
    
    public static boolean linearSearch(int a[], int n, int x){
        for(int i = 0 ; i < n ; i++){
            if(x == a[i]){
                return true;
            }
        }
        return false;
    }
    
    public static boolean linearSearch2(ArrayList<Integer> a, int n, int x){
        for(int i = 0 ; i < n ; i++){
            if(x == a.get(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //linearSearch
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for(int i = 0 ; i < n ; i++){
//            a[i] = sc.nextInt();
//        }
//        int x = sc.nextInt();
//        if(linearSearch(a,n,x)){
//            System.out.println("FOUND");
//        }
//        else System.out.println("NOT FOUND");

        //contains trong arrayList su dung linearSearch
//        ArrayList<Integer> a = new ArrayList<>();
//        int n = sc.nextInt();
//        for(int i = 0 ; i < n ; i++){
//            int tmp = sc.nextInt();
//            a.add(tmp);
//        }
//        int x = sc.nextInt();
//        if(linearSearch2(a,n,x)){
//            System.out.println("found");
//        }
//        else System.out.println("not");

        //binarySearch: chi ap dung cho mang da sap xep tang dan
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0  ; i < n ; i++){
            int x = sc.nextInt();
            a.add(x);
        }
        if(Collections.binarySearch(a, 5) >= 0){
            System.out.println("found");
        }
        else System.out.println("not");
    }
}
