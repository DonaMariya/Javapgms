package Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(51);
        for(int n:list){
            // System.out.println(n);
        }
        // System.out.println(list);
        // Set<Integer> set = new HashSet<>();
        Set<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(1);
        set.add(2);
        set.add(22);
        set.add(19);
        set.add(1);
        System.out.println(set);
        // for(int n: set){
        //     System.out.println(n);
        // }

        // Iterator<Integer> itr = set.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }
        Map<String, Integer> empWages = new HashMap<>();
            empWages.put("John",007);
            empWages.put("Wick",234);
            empWages.put("Sherlock",007);
            empWages.put("Holmes",234);
            System.out.println(empWages);
            System.out.println(empWages.get("John"));
            System.out.println(empWages.keySet());

        for(String name: empWages.keySet()) {
            System.out.println(name + "--->" + empWages.get(name));
        }

        // for(Integer salary: empWages.values()) {
        //     System.out.println(salary + "--->");
        // }




    }
}
