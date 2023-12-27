
package JavaSQL;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.logging.Logger;

class SinhVien {
    private String ten,ma;
    private int diem1,diem2,diem3;
    private double tb = (diem1*3 + diem2*3 + diem3*3)/3;

    
    public SinhVien(String ten, String ma, int diem1, int diem2, int diem3) {
        this.ten = chuanHoa(ten);
        this.ma = ma;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public double getTb() {
        return tb;
    }
    
    public void in(){
        System.out.print(ma + " " + ten + " " + tb + " ");
    }
    
    
    public String chuanHoa(String s){
        StringBuilder sb = new StringBuilder(ten);
        String a[] = s.trim().split("\\s+");
        for(String x:a){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for(int j = 1 ; j < x.length(); j++){
                sb.append(Character.toLowerCase(x.charAt(j)));
            }
            sb.append("");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}

public class DrivenClass  {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SinhVien a[] = new SinhVien[n];
        for(int i = 0 ; i < n ; i++){
            String s = sc.nextLine();
            int diem1 = Integer.parseInt(sc.nextLine());
            int diem2 = Integer.parseInt(sc.nextLine());
            int diem3 = Integer.parseInt(sc.nextLine());
            String tmp = String.format("%03d" , i + 1);
            tmp = "SV" + tmp;
            a[i] = new SinhVien(tmp,s,diem1,diem2,diem3);
        }
        Arrays.sort(a, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien t, SinhVien t1) {
                if(Math.floor(t.getTb()) > Math.floor(t1.getTb())){
                    return 1;
                }
                return -1;
            }
            
        });
        for(int i = 0 ; i < n ; i++){
            a[i].in();
            System.out.print(i+1);
            System.out.println("");
        }
    }
}
