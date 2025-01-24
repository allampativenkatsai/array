import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Removeele {

    public void remove() {
        List<Integer> inputlist=Arrays.asList(1,2,2,3);
        List list = new ArrayList<>();

        inputlist.stream().forEach(e-> list.add(e));





     ListIterator iterator= list.listIterator();

     while (iterator.hasNext()){
         Integer element =(Integer) iterator.next();
         int startindex = list.indexOf(element);
         int lastindex = list.lastIndexOf(element);

         if(lastindex==startindex){
             iterator.remove();
         }
     }
        System.out.println(list);

    }
    public static void main(String[] args) {
        Removeele r = new Removeele();
        r.remove();
    }
}
