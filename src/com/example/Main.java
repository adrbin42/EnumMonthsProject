package com.example;

import com.example.common.Month;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Please select a starting month : ");
        for (Month eachMonth : Month.values()){
            System.out.println(eachMonth);
        }

        Scanner scanner = new Scanner(System.in);
        String userSelectedMonth = scanner.nextLine();

//      List<Month> list = new ArrayList<Month>();
    }
}
