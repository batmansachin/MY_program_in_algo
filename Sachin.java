
import java.util.Scanner;

public class Sachin{
    public void subArry(int[] a,int k,int start,int currenlen,boolean[] p){
    if(k==currenlen){
        for(int i=0;i<a.length;i++){
            if(p[i]){
                System.out.print(a[i]+" ");
            }
        }
        
        System.out.println();
        return;
    }
        if(start==a.length)
            return;
        p[start]=true;
        subArry(a,k,start+1,currenlen+1,p);
        p[start]=false;
        subArry(a,k,start+1,currenlen,p);
    
}
    public static void main(String args[]){
        Sachin s = new Sachin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();
        System.out.println("Enter the value of Array");
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter the size of K");
        int k = sc.nextInt();
        boolean p[] = new boolean[n]; 
        s.subArry(a,k,0,0,p);
    }
}