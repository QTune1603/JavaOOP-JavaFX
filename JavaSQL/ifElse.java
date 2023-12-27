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
public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = 'A';
        if(Character.isUpperCase(c)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
