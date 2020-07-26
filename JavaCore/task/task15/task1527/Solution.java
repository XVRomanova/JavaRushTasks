package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import com.javarush.task.task15.task1521.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();




        int index = url.indexOf("?");
        String parameters = url.substring(index + 1);
        String[] splittedParameters = parameters.split("&");


        LinkedHashMap<String, String> parametersMap = new LinkedHashMap<String, String>();
        for (String item : splittedParameters) {
            String[] parametersList = item.split("=");
            if (parametersList.length == 1) {
                parametersMap.put(parametersList[0],"");
            }
            else {
                parametersMap.put(parametersList[0], parametersList[1]);
            }
        }

        Set<String> keySet = parametersMap.keySet();
        for (int i = 0; i < parametersMap.size() ; i++) {
            if (i > 0){
                System.out.print(" ");
            }
            else {
                System.out.println(parametersMap.get(keySet));
            }
        }



        if (parametersMap.containsKey("obj")){
            String founded = parametersMap.get("obj");
            System.out.println();
            try {
                double value = Double.parseDouble(founded);
                alert(value);
            }
            catch (Exception e){
                alert(founded);
            }
        }


//        for (SortedMap.Entry<String, String> entry : parametersMap.entrySet()){
//            System.out.println(entry.getKey());
//        }
//



//        for (String item : splittedParameters) {
//            String[] parametersList = item.split("=");
//            if (parametersList[0].equals("obj")) {
//                System.out.println();
//
//                try {
//                    double value = Double.parseDouble(parametersList[1]);
//                    alert(value);
//                } catch (Exception e) {
//                    alert(parametersList[1]);
//                }
//            }
//        }


    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
