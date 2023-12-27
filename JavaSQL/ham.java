/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSQL;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ham {
    //1
    public static int ham1(int x) {
        if(x < 2) return 0;
        for(int i = 2 ; i <= Math.sqrt(x) ; i++){
            if(x % i == 0) return 0;
        }
        return 1;
    }
    //2
    public static int ham2(int x) {
        int sum = 0;
        while(x != 0){
            sum += x%10;
            x /= 10;
        }
        return sum;
    }
    //3
    public static int ham3(int x) {
        int sum = 0;
        while(x != 0){
            int r = x%10;
            if(r%2 == 0){
                sum += r%10;
            }
            x /= 10;
        }
        return sum;
    }
    //4
    public static int ham4(int x) {
        int sum = 0;
        while(x != 0){
            int r = x%10;
            if(r == 2 || r == 3 || r == 5 || r == 7){
                sum += r;
            }
            x /= 10;
        }
        return sum;
    }
    //5
    public static int ham5(int x) {
        int sum = 0;
        while(x != 0){
            sum = sum*10 + x%10;
            x /= 10;
        }
        return sum;
    }
    //6
    public static int ham6(int x) {
        int cnt = 0;
        for(int i = 2 ; i <= Math.sqrt(x) ; i++){
            if(x % i != 0) {
                cnt++;
                while(x % i == 0){
                    x /= i;
                }
            }
        }
        if(x > 1) cnt++;
        return cnt;
    }
    //7
    public static int ham7(int x) {
        int ans = 0;
        for(int i = 2 ; i <= Math.sqrt(x) ; i++){
            if(x % i == 0){
                ans = i;
                while(x % i == 0){
                    x /= i;
                }
            }
        }
        if(x > 1) ans = x;
        return ans;
    }
    //8
    public static int ham8(int x) {
        while(x != 0){
            int r = x%10;
            if(r == 6) return 1;
            x /= 10;
        }
        return 0;
    }
    //9
    public static int ham9(int x) {
        int sum = 0;
        while(x != 0){
            sum += x%10;
            x /= 10;
        }
        if(sum % 8 == 0) return 1;
        return 0;
    }
    //10
    public static int giaiThua(int x) {
        int gt = 1;
        for(int i = 1 ; i <= x ; i++){
            gt *= i;
        }
        return gt;
    }
    public static int ham10(int x) {
        int sum = 0;
        while(x != 0){
            int r = x%10;
            sum += giaiThua(r);
            x /= 10;
        }
        return sum;
    }
    //11
    public static int ham11(int x) {
        int r = x % 10;
        x /= 10;
        while(x != 0){
            int l = x%10;
            if(l != r) return 0;
            x /= 10;
        }
        return 1;
    }
    //12
    public static int ham12(int x) {
        int r = x%10;
        x /= 10;
        while(x != 0){
            int l = x % 10;
            if(l > r) return 0;
            x /= 10;
        }
        return 1;
    }
    //13
    public static int ham13(int x) {
        int cnt = 0;
        int m = x;
        while(m != 0){
            cnt++;
            m /= 10;
        }
        int sum = 0;
        while(x != 0){
            int r = x%10;
            sum += (int)Math.pow(r, cnt);
            x /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ham1(n));
        System.out.println(ham2(n));
        System.out.println(ham3(n));
        System.out.println(ham4(n));
        System.out.println(ham5(n));
        System.out.println(ham6(n));
        System.out.println(ham7(n));
        System.out.println(ham8(n));
        System.out.println(ham9(n));
        System.out.println(ham10(n));
        System.out.println(ham11(n));
        System.out.println(ham12(n));
        System.out.println(ham13(n));
        
    }
}
