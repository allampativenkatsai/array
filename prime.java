import java.util.Scanner;

public class prime {

    public static void printmultiple(int a,int b,int n){

        boolean flag = true ;
        int i = 1 ;
        int j = 1;
        int lcm=0;
        while (flag){
            if(a*i < b*j){
                i++;
            }
            else if(a*i == b*j){
                lcm=a*i;
                flag=false;
            } else if (a*i > b*j) {
                j++;
            }

        }
        for (int k = lcm ; k <= n ; k=k+lcm){
            System.out.println(k);
        }


    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int n = s.nextInt();
     printmultiple(a,b,n);
    }
}
