import java.util.Random;

public class program4 {
    public static void main(String[] args) {
    Random rand = new Random();
    int arr3 [] = new int [5];
    for (int i = 0; i < 5; i++)
    {
        arr3[i] = rand.nextInt(20);
        System.out.println(arr3[i]);
    }
    int maxNum = arr3[0];

    for (int j : arr3) {
        if (j > maxNum)
            maxNum = j;
    }
    System.out.println("Maximum number = " + maxNum);

   
    int minNum = arr3[0];

    for (int i : arr3) {
        if (i < minNum)
            minNum = i;
    }
    System.out.println("Minimum number = " + minNum);
}
}

