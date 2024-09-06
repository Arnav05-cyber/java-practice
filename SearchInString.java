package Mainest.Arnav;

import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        char s = input.next().charAt(0);
        search(a,s);
    }
    static void search(String a, char s){
        for(int i = 0; i<a.length(); i++){
            if(a.charAt(i) == s){
                System.out.println(i);
            }
        }
    }
}
