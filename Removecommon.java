import java.util.Arrays;

public class Removecommon {

    public static int getStartIndexOfElement(int element,int[] arr){

        for(int i = 0 ; i < arr.length ; i++){
            int arrelement=arr[i];
            if(arrelement==element){
                return i;
            }
        }

        return  -1;
    }

    public static int getLastIndexOfElement(int element,int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            int arrelement = arr[i];
            if (element == arrelement) {
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] res= new int[50];
        int j = 0 ;
        int[] arr = {1,2,2,3};
        for (int i = 0 ; i < arr.length ; i++){
            int element = arr[i];
            int startindex=getStartIndexOfElement(element,arr);
            int lastindex=getLastIndexOfElement(element,arr);
            if(startindex!=lastindex){
                res[j]= element;
                j++;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}