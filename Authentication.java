/**
 * @author Muntaqim Elahi
 * Purpose: To successfully authorize username and password to display text accordingly
 * created by me22810 on 09/04/2017
 */

import java.util.Scanner;
public class Authentication {
    public static void main (String[] args) {
        String username, password;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your username");
        username = keyboard.next();
        System.out.println("Enter your password");
        password = keyboard.next();
        System.out.println("Hello" + username + ",Welcome to CSC200 class! and Your password is " + password);
    }
}
