
package JavaSQL;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

//Map luu 1 cap key-value
//Ko co 2 key giong nhau, value co the trung nhau
//Map co the tim kiem nhanh
//Map co the dung key lam index de truy cap vao value tuong ung
//Map trong java chi luu cac phan tu la object

//Ap dung map:
//Cac bai toan lien quan den tan suat cua cac phan tu
//Cac bai toan can tim kiem, them, xoa phan tu mot cach nhanh chong
//Dung map thay cho cac bai toan su dung mang danh dau khi du lieu khong dep

//HashMap: duoc cai dat bang hash table
//Cac ham pho bien cua HashMap:
//put(key,val): them cap key,value vao map
//size(): tra ve kich thuoc cua map
//isEmpty(): kiem tra map rong
//clear(): xoa toan bo phan tu trong map
//containsKey(x): Ktra su ton tai cua phan tu x trong tap key
//containsValue(x): ktra su ton tai cua x trong tap value
//get(x): tra ve value tuong ung voi key x
//remove(x): xoa cap phan tu co key la x khoi map
//replace(x,y): thay the cap phan tu(x,y)

//LinkedHashMap : khac HashMap o cho co thu tu, key duoc sap xep theo thu tu
//ban them no vao trong map

//TreeMap duoc cai dat bang cay do den, key trong TreeMap duoc sap xep theo thu
//tu tang dan
//TreeMap co them cac ham sau:
//firstKey(): tra ve key dau tien trong map
//lastKey():tra ve ket cuoi cung
//FirstEntry(): tra ve cap phan tu dau tien trong map
//lastEntry(): tra ve cap phan tu cuoi cung
//floorKey(x): tra ve key lon nhat nho hon hoac bang x
//floorEntry(x):tra ve cap phan tu co key lon nhat nho hon hoac bang x
//ceilingKey(x):tra ve key nho nhat lon hon hoac bang x
//ceilingEntry(x):tra ve phan tu co key nho nhat lon hon hoac bang x

public class CtdlMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        HashMap<Integer, Integer> map = new HashMap<>();
//        map.put(1,2);
//        map.put(1,3);
//        map.put(3,4);
//        map.put(2,5);
//        map.put(2,3);
//        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
//        for(Map.Entry<Integer, Integer> entry : entrySet){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
        
        //dem cac gia tri khac nhau trong map
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int a[] = {1,1,2,1,2,3,1,2};
//        for(int x:a){
//            map.put(x, 1);
//        }
//        System.out.println(map.size()); //3

        //kiem tra su ton tai cua nhieu ptu trog tap hop
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int a[] = {1,1,2,1,2,3,1,2};
//        for(int x:a){
//            map.put(x,1);
//        }
//        int q = sc.nextInt();
//        while(q-- > 0){
//            int x = sc.nextInt();
//            if(map.containsKey(x)){
//                System.out.println("FOUND");
//            }
//            else {
//                System.out.println("NOT FOUND");
//            }
//        }

//        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
//        int a[] = {4,1,1,2,1,2,3,1,2};
//        for(int x:a){
//            if(map.containsKey(x)){
//                int tanSuat = map.get(x);
//                map.put(x, tanSuat+1);
//            }
//            else {
//                map.put(x,1);
//            }
//        }
//        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
//        for(Map.Entry<Integer, Integer> entry:entrySet){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int a[] = {4,1,1,2,1,2,3,1,2};
        for(int x:a){
            if(map.containsKey(x)){
                int tanSuat = map.get(x);
                map.put(x, tanSuat+1);
            }
            else {
                map.put(x,1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer, Integer> entry:entrySet){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
    }
}
