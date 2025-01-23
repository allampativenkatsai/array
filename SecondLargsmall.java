public class SecondLargsmall {
    public static void main(String[] args) {


    int[] a = {1,5,167,2,499};
    int minf =Integer.MAX_VALUE;
    int mins = Integer.MAX_VALUE;
    int maxf =Integer.MIN_VALUE;

    int maxs=0;

        for(int i = 0 ; i < a.length ; i++){
        if(maxs < a[i]){
            if(maxf<a[i]){
                maxs=maxf;
                maxf=a[i];
            }
            else{
                maxs=a[i];
            }
        }
        if(mins > a[i]){
            if(minf> a[i]){
                mins=minf;
                minf=a[i];
            }
            else{
                mins=a[i];
            }
        }

    }
    System.out.println(mins);

    }

}
