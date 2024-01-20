package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // Использование точки
        // точка это любой символ

        // вычислим дату
        // день/месяц-год
        Pattern p1 = Pattern.compile("\\d\\d.\\d\\d.\\d\\d");
        Matcher m1 = p1.matcher("20/01-24");
        while (m1.find()){
            System.out.println(m1.start() +" "+ m1.group()+" ");
        }
        // что бы этого избежать то можно
        // "\\d\\d[-/.]\\d\\d[-/.]\\d\\d"

    }
}
