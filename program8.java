import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.*;
public class program8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(21);
        list.add(111);
        list.add(0);
        list.add(6867);
        list.add(5);
        list.add(33);
        
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        }
    }
        




