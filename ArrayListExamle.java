package Mainest.Arnav;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExamle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<5; i++){
            list.add(input.nextInt());
        }
        System.out.println(list);
    }
}
