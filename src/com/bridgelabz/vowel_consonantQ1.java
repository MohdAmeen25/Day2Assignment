package com.bridgelabz;

import java.util.Scanner;

public class vowel_consonantQ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            String ch=sc.next();
            switch (ch) {
                case "a":
                    System.out.println("a is vowel");
                    break;
                case "e":
                    System.out.println("e is vowel");
                    break;
                case "i":
                    System.out.println("i is vowel");
                    break;
                case "o":
                    System.out.println("o is vowel");
                    break;
                case "u":
                    System.out.println("u is vowel");
                    break;
                default:
                    System.out.println(ch + " is consonant");

            }
        }
    }

