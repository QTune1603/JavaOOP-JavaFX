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
public class vongLap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//      for(int i = 1; i <= 5 ; i++ ){
//          System.out.println("lap vinh vien");
//      }
//        for(;;){
//            int n = sc.nextInt();
//            if(n >= 0) break;
//            else {
//                System.out.println("Nhap lai");
//            }
//        }
//        outer : for(int i = 1 ; i <= 3 ; i++){
//            for(int j = 1 ; j <= 5 ; j++){
//                System.out.println(i + " " + j);
//                if(i == 2 && j == 3){
//                    //break;//chi dung vong for o trong
//                    break outer;//dung ca 2 vong for
//            }
//        }
          for(int i = 1 ; i <= 5 ; i++){
              if(i % 2 == 0){
                  continue;
              }
              System.out.println("abc");
          }
    }
        
}
