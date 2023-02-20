public class program5 {
public static void main (String[] args) {
    String s = "aa456654aa";
    s = s.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
    if (s.toLowerCase().equals((new StringBuilder(s)).reverse().toString().toLowerCase()))
        System.out.println("Строка является палиндромом " + s);
    else
        System.out.println("Строка не является палиндромом :( " + s);
} 
}