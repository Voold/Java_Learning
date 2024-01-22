package firstStep;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionMap {
    public static void collectionmap(){
        System.out.println("-------COLLECTION_MAP-------");

        //НАДО БУДЕТ УГЛУБИТЬСЯ

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(50);
        numbers.add(1,30);
        System.out.println(numbers.size());
        System.out.println(numbers.get(1));
        numbers.remove(1);

        for (Integer el : numbers) System.out.println(el);
        numbers.clear();

        LinkedList<Float> nums = new LinkedList<>(); // динамическое оновление быстрее

        nums.add(5.6f);
        nums.add(4.7f);

        for(Float el: nums) System.out.println(el);

    }
}
