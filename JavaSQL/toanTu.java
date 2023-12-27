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
public class toanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -100;
        System.out.println(Math.abs(n));
        System.out.println(Math.min(10, 20));
        System.out.println(Math.max(30, 50));
        System.out.println(Math.pow(2, 10));
        System.out.println(Math.sqrt(178));
        System.out.println(Math.cbrt(27));//can bac 3
        System.out.println(Math.ceil(20.5)); // lam tron len
        System.out.println(Math.floor(20.70)); // lam tron xuong
        System.out.println(Math.round(2.8)); // lam tron dua vao phan thap phan
        System.out.println(Math.round(2.2)); // = 2
        System.out.println(Math.min(10, Math.min(30,5)));
    }
}
