/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSQL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class sortArray {
    
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        //de dang nguyen thuy moi dung dc comparator
//        Integer a[] = new Integer[n];
//        for(int i = 0 ; i < n ; i++){
//            a[i] = sc.nextInt();
//        }
//        //Arrays.sort(a);  sort toan bo mang
//        Arrays.sort(a, new Comparator<Integer>(){
//            @Override
//            public int compare(Integer t, Integer t1) {
//                //-1 hoac 1, so am so duong
//                // neu muon t dung truoc t1 sau khi sap xep => return -1
//                // neu muon t1 dung sau t2 sau khi sap xep => return 1
////                if(t > t1){
////                    return -1;
////                }
////                else {
////                    return 1;
////                }
//                // t-t1: tang dan //so am
//                // t1-t: giam dan //so duong
//                
//                //tri tuyet doi tang dan
//                if(Math.abs(t) < Math.abs(t1)){
//                    return -1;
//                }
//                else return 1;
//            }
//        });
//        for(int x:a){
//            System.out.print(x + " ");
//        }

        //sort trong ArrayList
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            int tmp = sc.nextInt();
            a.add(tmp);
        }
        Collections.sort(a, new Comparator<Integer>(){
            @Override
            public int compare(Integer t, Integer t1) {
                return t-t1;
            }
            
        });
        for(int x:a){
            System.out.print(x + " ");
        }
    }
}
