package com.company;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Phonebook book = new Phonebook();
        book.add("Petrov","+79603552734");
        book.add("Ivanov","+79605552734");
        book.add("Grunin","+79605652734");
        book.add("Ivanov","+79605772734");
        System.out.println("Введите фамилию");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        ArrayList<String> phones = book.get(inputString);
        if(phones == null){
            System.out.println("Фамилия не известна");
            return;
        }
        for (String phone:phones
             ) {
            System.out.println(phone);

        }
    }
}
