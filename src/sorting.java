/*package whatever //do not write package name here */

import java.util.*;

class sorting{
    static int[]  sort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
    static void prn(int a[]){
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");

        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        a=sort(a);
        prn(a);

    }

}