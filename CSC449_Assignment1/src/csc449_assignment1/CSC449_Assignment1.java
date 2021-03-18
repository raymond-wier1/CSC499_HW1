package csc449_assignment1;
import java.util.Scanner; 
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class CSC449_Assignment1 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            FileReader sort = new FileReader("Sort_Me.txt");
            Scanner file = new Scanner(sort);
            List<String> Names=new ArrayList<>();
            while( file.hasNextLine() ) {
                Names.add(file.nextLine());
            }
            System.out.println("1: Sort by length and alphabetical order from shortest to longest and A to Z");
            System.out.println("2: Sort by length and alphabetical order from longest to shortest and Z to A");
            System.out.println("Press enter after typing either 1 or 2");
            int s = in.nextInt();
            while(s != 2 && s != 1) {
                System.out.println("Please enter either 1 or 2");
                s = in.nextInt();
            }
            switch(s) {
                case 1:
                    Names.sort(Comparator.comparing(String::length).thenComparing(String::compareTo));
                    System.out.println(Names);
                    break;
                case 2:
                    Names.sort(Comparator.comparing(String::length).thenComparing(String::compareTo));
                    Collections.reverse(Names);
                    System.out.println(Names);
                    break;
                default:
                    break;
                    
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CSC449_Assignment1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
