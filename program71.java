import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
public class program71 {
    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();

numbers.add(11);
numbers.add(45);
numbers.add(12);
numbers.add(32);
numbers.add(36);

System.out.println("Список чисел: " + numbers);

for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
    Integer number = iterator.next();
    if (number % 2 == 0) {
        System.out.println("Четное число: " + number);
        iterator.remove();
    }

}

Collections.sort(numbers);
System.out.println("Список без четных чисел: " + numbers);
    }
}
