import java.util.Scanner;
public class palindrome {
    static boolean kataPalindrome(String kata) {
        int left = 0;
        int right = kata.length()-1;
        while (left<right) {
            if (kata.charAt(left) != kata.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("           Latihan Palindrome");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("       Di Susun Oleh : Kelompok 4");
        System.out.print("\n Masukan Kalimat : ");
        String kata = input.nextLine();
        if (kataPalindrome(kata))
            System.out.print(kata+ " Adalah Kalimat Palindrome");
        else
            System.out.print(kata+ " Bukanlah Kalimat Palindrome");
    }
}