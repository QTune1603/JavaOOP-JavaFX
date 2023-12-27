/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author DELL
 */
public class CodePtit {
    public static boolean checkSnt(long n) {
        if(n < 2) return false;
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static long[] fibo = new long[100];
    
    public static void sinh() {
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2 ; i < 100 ; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
    }
    
    public static boolean check(long n) {
        for(long i : fibo){
            if(i == n){
                return true;
            }
            else if(i > n) {
                return false;
            }
        }
        return false;
    }
    
    public static void ptSnt(long n) {
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            int cnt = 0;
            if(n%i == 0){
                while(n%i == 0){
                    cnt++;
                    n /= i;
                }
                System.out.print(i + "(" + cnt + ")" + " ");
            }
        }
        if(n != 1) System.out.print(n + "(1)");
    }
    
    public static long solve(String s) {
        long n = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            switch(c){
                case '0':
                case '8':
                case '9':
                    n *= 10;
                    break;
                case '1':
                    n = n*10+1;
                    break;
                default:
                    return 0;
            }
        }
        return n;
    }
    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b,a%b);
    }
    
    public static int lcm(int a, int b) {
        return a*b/gcd(a,b);
    }
    public static  long maxUocSnt(long n) {
        long res = 0;
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            while(n % i == 0){
                res = i;
                n /= i;
            }
        }
        if(n != 1) res = n;
        return res;
    }
    
    public static int sumk(long n) {
        int sum = 0;
        while(n != 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    
    private int tuSo;
    private int mauSo;
    
    public CodePtit(int tuSo, int mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    public CodePtit nhan(CodePtit other){
        int newTuSo = this.tuSo * other.tuSo;
        int newMauSo = this.mauSo * other.mauSo;
        int ucln = gcd(newTuSo, newMauSo);
        
        newTuSo /= ucln;
        newMauSo /= ucln;
        
        return new CodePtit(newTuSo, newMauSo);
    }
    
    public String toString(){
        if(mauSo == 1)
            return Integer.toString(tuSo);
        return tuSo + "/" + mauSo;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tuSoX = sc.nextInt();
        int mauSoX = sc.nextInt();
        int tuSoY = sc.nextInt();
        int mauSoY = sc.nextInt();
        
        CodePtit x = new CodePtit(tuSoX,mauSoX);
        CodePtit y = new CodePtit(tuSoY,mauSoY);
        
        CodePtit ketQua = x.nhan(y);
        
        System.out.println(ketQua);
    }
}
