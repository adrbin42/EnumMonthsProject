package com.example;

import com.example.common.Month;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Please enter the name of a starting month : ");
        for (Month eachMonth : Month.values()){
            System.out.println(eachMonth);
        }

        Scanner scanner = new Scanner(System.in);
        String monthEntered = scanner.nextLine();
        String userSelectedMonth;
        userSelectedMonth = monthEntered.toUpperCase();
        System.out.println("The month you entered was: " + userSelectedMonth);

        List<Month> monthArrayList = new ArrayList<>();
        int index = 0;

        for(Month eachMonth : Month.values()){
           if(eachMonth.toString().equals(userSelectedMonth)){
               index = eachMonth.ordinal();
           }
        }

        for(int i = index;i<Month.values().length;i++){
            monthArrayList.add(Month.values()[i]);
        }

        System.out.println("Your months are as follows: "+ monthArrayList);
        System.out.println(monthArrayList);
    }
}
