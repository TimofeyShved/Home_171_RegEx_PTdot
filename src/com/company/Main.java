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


        // находжения слов в "ковычках" но если не поставить ?,
        // то он найдет ("text" and "text2") одним вариантом,
        // а ещё он не понимает что закончилась строка, не знает \n
        Pattern p2 = Pattern.compile("\".*?\"");
        Matcher m2 = p2.matcher("my \"text\" and \"text2\"");
        while (m2.find()){
            System.out.println(m2.start() +" "+ m2.group()+" ");
        }
        // для убирания \n из строки используют [^\n] unix [^\r\n] windows
        // можно по другому использовать условие
        // "\"[^\r\n]\""
    }
}
