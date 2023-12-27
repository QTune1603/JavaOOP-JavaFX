
package JavaSQL;

import java.math.BigInteger;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;


//s.length(): tra ve so ki tu trong xau

//charAt():tra ve ki tu o chi so index

//duyer for each : for(char x:s.toCharArray())

//toUpperCase():tra ve xau o dang in hoa, ko lam thay doi xau ban dau

//toLowerCase():tra ve xau o dang in thuong, ko lam thay doi xau

//concat():noi xau ki tu khac vao cuoi xau hien tai
//co the dung toan tu + de noi

//compareTo():so sanh 2 xau theo thu tu tu dien, neu 2 xau bang nhau tra ve
//0, tra ve so am neu xau hien tai nho hon xau can so sanh, nguoc lai tra ve 
//so duong

//compareToignoreCase():bo qua in hoa in thuong khi so sanh

//substring(): tra ve xau con
//subSequence(): tra ve xau con trong nua khoang [,)

//contains():Ktra su ton tai xau con

//split("\\s+"): tach cac tu trong xau
//StringTokenizer():tach cac tu trong xau bang lop

//trim(): loai bo nhung dau cach o dau va cuoi

//su dung lop Character de kiem tra hay chuyen doi: Character. ...
//isDigit(char c) : kiem tra chu so
//isLowerCase(char c): kiem tra chu in thuong
//isUpperCase(char c): kiem tra chu in hoa
//isAlphabetic(char c): kiem tra chu cai
//char toLower(char c): chuyen thanh chu in thuong
//char toUpper(char c): chuyen thanh chu in hoa

//chuyen so thanh xau chi can cong voi 1 xau rong
//chuyen xau thanh so: su dung cac ham parse cua lop Integer,Long...

//dung lop BigInteger de xu li so nguyen lon

//dem tan suat xuat hien: su dung mang 256 ptu / su dung map

public class kieuString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String s = "TRAN QUANG TUNG";
        //System.out.println(s.length());
        //for(int i = 0 ; i < s.length() ; i++){
        //    System.out.print(s.charAt(i) + " ");
        //}
        //String t = s.toUpperCase();
        //String x = s.toLowerCase();
        //System.out.println(s);
        //System.out.println(t);
        //System.out.println(x);
        
//        String s = "java ";
//        String t = "tran quang tung ";
//        String st = s.concat(t);
//        String ts = s+t;
//        System.out.println(st);
//        System.out.println(ts);

//        String s = "tran quang tung";
//        String t = "tRan quang tung";
//        System.out.println(s.compareTo(t));
//        System.out.println(s.compareToIgnoreCase(t));
         
//        String s = "java tran quangtung";
//        System.out.println(s.substring(5));
//        System.out.println(s.subSequence(5, 7));
//        System.out.println(s.contains("tran quangtung"));
        
        //String s = "java tran 1603 quang tung";
//        //cach1:tach cac tu trong xau su dung split
//        String arr[] = s.split("\\s+");
//        for(String x:arr){
//            System.out.println(x);
//        }
//        //cach2: su dung lop StringTokenizer
//        StringTokenizer st = new StringTokenizer(s);
//        while(st.hasMoreTokens()){
//            System.out.println(st.nextToken());
//        }

//        String s = "java    28tech   C++   28tech.com.vn";
//        int digit = 0, lower = 0, upper = 0, special = 0;
//        for(char x : s.toCharArray()){
//            if(Character.isDigit(x)){
//                ++digit;
//            }
//            else if(Character.isLowerCase(x)){
//                ++lower;
//            }
//            else if(Character.isUpperCase(x)){
//                ++upper;
//            }
//            else ++special;
//        }
//        System.out.println(digit + " " + lower + " " + upper + " " + special);

//        int n = 1603;
//        String s = "" + n; //so thanh xau
//        System.out.println(s);
//        System.out.println(Integer.parseInt(s)); //xau thanh so

        //bai toan so lon
//        String s = "189797293798183084824125372752341";
//        int sum = 0;
//        for(char x : s.toCharArray()){
//            sum += x -'0';
//        }
//        System.out.println(sum);

        //xu li so nguyen lon bang lop BigInteger
//        String s1 = "18238128381283812381123123123123";
//        String s2 = "192399239192393";
//        BigInteger num1 = new BigInteger(s1);
//        BigInteger num2 = new BigInteger(s2);
//        System.out.println(num1.add(num2)); //+
//        System.out.println(num1.subtract(num2));//-
//        System.out.println(num1.multiply(num2));//*
//        System.out.println(num1.divide(num2));// /

        //bai toan dem tan suat xuat hien trong xau
        //c1: su dung mang vi cac ki tu co ma ascii tu 0 den 255 nen dung mang 
        //dem co 256 ptu la duoc
//        String s1 = "TranQuangTung1603";
//        int cnt[] = new int[256];
//        for(char x : s1.toCharArray()){
//            cnt[x]++;
//        }
//        for(int i = 0 ; i < 256 ; i++){
//            if(cnt[i] != 0){
//                System.out.println((char)i + " " + cnt[i]);
//            }
//        }
        //c2: su dung map
//        String s = "28tech28te";
//        TreeMap<Character, Integer> map = new TreeMap<>();
//        for(char x : s.toCharArray()){
//            if(map.containsKey(x)){
//                map.put(x,map.get(x) + 1);
//            }
//            else {
//                map.put(x,1);
//            }
//        }
//        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
//        for(Map.Entry<Character, Integer> entry : entrySet){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

        //String da duoc khai bao thi ko the thay doi.
        //muon chen,xoa,them ki tu ta co the su dung lop StringBuilder
        //append(): noi them vao chuoi
        String s = "Le ThUY liNh";
        StringBuilder sb = new StringBuilder("");
        String arr[] = s.split("\\s+");
        for(String x : arr){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for(int j = 1 ; j < x.length() ; j++){
                sb.append(Character.toLowerCase(x.charAt(j)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);//xoa dau cach thua o cuoi
        System.out.println(sb.toString()); //toString: tra ve bieu dien chuoi
    }
}
