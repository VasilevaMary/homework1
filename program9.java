import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class program9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a string like text~num: ");
        String str = in.nextLine();
        String[] comands = str.split(" ");
        LinkedList<String> texttext = new LinkedList<String>();
        for (String comand : comands) {
            System.out.println(comand);
            String[] components = comand.split("~");
            for (String comand_1 : components) {
                System.out.println(comand_1);
            }
            int i = Integer.parseInt(components[1]);
            
            if (components[0].equals("print")){
                System.out.println(texttext.get(i));
                texttext.remove(i);
            }
            else texttext.add(i, components[0]);
            
            System.out.println("Текущее состояние" + texttext);
        } 
        
       
        
    }
}