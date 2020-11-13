package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner Name = new Scanner(System.in);
        Scanner schet = new Scanner(System.in);
        BankAccount bk = new BankAccount(Name.nextLine(), schet.nextInt());
        while (true) {
            try {
                if (bk.getName().contains("1") | bk.getName().contains("2") | bk.getName().contains("3") | bk.getName().contains("4")
                        | bk.getName().contains("5") | bk.getName().contains("б") | bk.getName().contains("7")
                            | bk.getName().contains("8") | bk.getName().contains("9") | bk.getName().contains("0")) {
                    throw new IllegalArgumentException();
                }
                else{
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Ваше имя содержит цифру(ы). Введите корректное имя");
            }
            Scanner scanner = new Scanner(System.in);
            bk.reName(scanner.nextLine());
        }
    }
}