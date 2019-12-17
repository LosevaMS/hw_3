package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{

       /* String text = ""; //читаем с файла
        Scanner in = new Scanner(new File("D:/Java/hw_3/text.txt"));
        while(in.hasNext())
            text += in.nextLine() + "\r\n";
        in.close(); */
            String text = "In India, credibility is often linked with status." +
                    " One form of status comes from having attended a well-respected" +
                    " educational institution: education is an extremely important way " +
                    "to establish authority and credentials. Another indicator of status " +
                    "is the position one holds within a company and, in turn, the status of the company itself.";
        text = text.toLowerCase();
        text = text.replaceAll("\\W", " ");

            Map<String, Integer> map = new HashMap<>();
            for (String s : text.split(" ")) {
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            }
            map.remove("");
            System.out.println(map);

    }
}
