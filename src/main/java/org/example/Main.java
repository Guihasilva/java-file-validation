package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<Product>();

        String path =  "C:\\Users\\nowck\\Desktop\\valor.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line  = br.readLine();
            }
            Product x = CaluculationService.max(list);
            System.out.println("Max :");
            System.out.println(x);

        }catch(IOException | IllegalAccessException e){
            System.out.println("Error: " + e.getMessage());
        }





    }
}