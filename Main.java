import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public int n ;
    protected int d ;
    private int h;

public  static void ram(int[] a,int n) {
    int start = 0 ;
    int end = n-1;
    while (start<end){
        if(a[start] >0 && start<end){
            start++;
        }
        if(a[end]==0 && start<end){
            end--;
        }
        if(a[start]==0 && a[end]>0 && start<end) {
            a[start] = a[end];
            a[end]=0;
            start++;
            end--;
        }

    }


    }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = {0,00000,9};
       int n=a.length;
       ram(a,n);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));


}}