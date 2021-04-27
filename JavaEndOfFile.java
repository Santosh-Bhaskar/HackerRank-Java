package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class JavaEndOfFile {
    public static void main(String[] args) {
        ArrayList<String> inputString= new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int counter=1;
        while (scan.hasNext()){
            System.out.println(counter+" "+scan.nextLine());
            counter++;
        }
    }
}
