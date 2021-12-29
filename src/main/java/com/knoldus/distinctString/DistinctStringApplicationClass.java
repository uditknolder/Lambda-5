package com.knoldus.distinctString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DistinctStringApplicationClass {
    public static List<String> getDistinctStrings(List<String> stringList){

        Function<List<String>, List<String>> distinctStrings = string -> string.stream()
                .distinct()    
                .sorted()      
                .collect(Collectors.toList()); 
        return distinctStrings.apply(stringList);
    }
    public static void main(String[] arguments) {

        List<String> list= new ArrayList<>();
        System.out.println("Enter your String :");
        Scanner string_input =new Scanner(System.in);
        String line1 = string_input.nextLine();

        String[] stringList3= line1.split("\\s");
        Collections.addAll(list, stringList3);

        System.out.println("Distinct Values are : " +DistinctStringApplicationClass.getDistinctStrings(list));
    }
}
