/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javzad;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author DanPK
 */
public class JavZad {
    

    
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] a = {1,2,3,4,5,6,7,8,9,1,1,1,2,4,8,16,32};
        Zad f = new Zad();
        int[][]b = new int[3][3];
        
        for(int i = 0; i < 3; i ++){
            for(int j = 0; j < 3; j++){
                b[i][j] = 5*i - 3*j;
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        
        f.zad29(a,5);
    }
    
}

class Zad{
        void zad15(int[] a){
        int s = 0;
        int f = 0;
        int ts = 0;
        int tf = 0;
        int l = 0;
        
        for(int i = 1; i < a.length; i++){
            if( a[i] % a[i-1] == 0 && l == 0){
                l = 1;
                ts = i-1;
                tf = i;
            }
            else if(a[i] % a[i-1] == 0){
                tf = i;
                l++;
            }
            else{
                if(f - s < tf - ts){
                    
                f = tf;
                s = ts;
                
                }
                
                l = 0;
            }
            
            
            if(f - s < tf - ts){
                f = tf;
                s = ts;
               
            }
            
        }
        System.out.println(f - s + 1 + "  " + (s + 1) );
        System.out.println(a[s]);
        System.out.println(a[f]);
}
        
        void zad323(){
            
            Scanner scan = new Scanner(System.in);
            int[] a = new int[5];
            
            for(int i = 0; i < 5; i++){
                a[i] = scan.nextInt();
            }
            
            Arrays.sort(a);
            
            for(int i = 0; i < 5; i++){
                System.out.println(a[i]);
            }
            
            if(a[0] ==  a[4]){
                System.out.println("Imposible");
            }
            else if((a[0]  == a[3]) ||(a[1] == a[2] && a[2] == a[4])){
                System.out.println("Four of a King");
                
            }
            else if((a[0] == a[2] && a[3] == a[4]) || (a[2]  == a[4] && a[0] == a[1])){
                System.out.println("Full House");
            }
            else if(a[4] - a[3] == 1 && a[3] - a[2] == 1 && a[2] - a[1] == 1 && a[1] - a[0] == 1){
                System.out.println("Straight");
            }
            else if((a[0] == a[2] || a[1] == a[3] || a[2] == a[4])){
                System.out.println("Three of a King");
            }
            else if((a[0] == a[1] && (a[2] == a[3] || a[3] == a[4])) || (a[1] == a[2] && a[3] == a[4])){
                System.out.println(" 2 pairs");
            }
            else if(a[0] == a[1] || a[1] == a[2] || a[2] == a[3] || a[3] == a[4]){
                System.out.println("1 pair");
            }
            else {
                System.out.println("Nothing");
            }
            
                    
}
        
        void zad422(int[][] a,int n,int m){
            int sumM = a[0][0];
            int sumT = a[0][0];
            
            for(int lx = 1; lx < n; lx++){
                for(int ly = 1; ly < n; ly++){
                    for(int x = 0; x < n - lx + 1; x++){
                         for(int y = 0; y < m - ly + 1; y++){
                            sumT = sum(a,x,y,lx,ly);
                            if(sumT == 12){
                                System.out.println(x + " " + y + " " + lx + " " + ly);
                            }
                            if(sumM < sumT){
                                sumM = sumT;
                            }
                        }
                    }
                }
                    
            }
            
            System.out.println(sumM);
            
            
            
            
            
        }
        
        int sum(int[][] a,int x,int y,int lx,int ly){
            int sum = 0;
            for(int i = x; i < x+lx;i++){
                for(int j = y; j < y + ly; j++){
                    sum += a[i][j];
                }
            }
            
            /*for(int i = 0; i < n - l1;i++){
                for(int j = 0; j < m - l2; j++){
                    
                }
            }*/
            return sum;
        }
        
        void zad29(int[] a,int k){

            for(int i = 0; i<k;i++){
                zad29(a);
                
            }
            
            for(int i = 0; i<a.length;i++){
                System.out.print(a[i] + " ");
                
            }
            
       
        }
        void zad29(int[] a){
            int tmp1 = a[a.length-1];
            int tmp2 = a[0];
            
            for(int i = 0; i < a.length; i++){
                tmp2 = a[i];
                a[i] = tmp1;
                tmp1 = tmp2;
                
                
            }
        }
        
        void zad514(int[] a){
            
            
            for(int i = 0; i < a.length; i++){
                int t = 0;
                
                for(int j = i; j < a.length; j++){
                    if(a[j] > a[i]){
                        t = a[j];
                        break;
                    }
                }
                a[i] =  t;
            }
            
            
            for(int i = 0; i < a.length; i++){
                System.out.print(a[i] + " ");
            }
            
            
        }

}
