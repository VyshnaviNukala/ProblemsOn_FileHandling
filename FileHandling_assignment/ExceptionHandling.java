import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int result = x/y;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
    }
}
