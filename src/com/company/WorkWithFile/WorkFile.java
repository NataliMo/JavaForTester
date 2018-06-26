package com.company.WorkWithFile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class WorkFile {
    public static void main(String[] args) throws IOException{
        //читаем файл с набором слов
        List <String> line = Files.readAllLines(Paths.get("input.txt"), StandardCharsets.UTF_8);

            //for (String lines :line )
               //System.out.println(line);

        System.out.println("Сортируем список:");
            Collections.sort(line);
        for (String sorts: line)
            System.out.println(sorts);

        //Посчитать сколько раз каждое слово встречается в файле
        System.out.println("Вывод повотрений:");

        Scanner er = new Scanner(new File("input.txt"));
        String str = er.nextLine();
        String[] words = str.split("\\s+");
        HashMap<String, Integer> wordToCount = new HashMap<>();

        for (String word : words) {
            if(!word.isEmpty()) {
                Integer count = wordToCount.get(word);
                if(count == null)
                    count = 0;

                wordToCount.put(word, ++count);
            }
        }
        for(String word : wordToCount.keySet())
            System.out.println(word + ": " + wordToCount.get(word));

        HashMap.Entry <String, Integer> maxRepeat = null;

        for (HashMap.Entry<String, Integer> entry : wordToCount.entrySet()) {
            if (maxRepeat == null || entry.getValue().compareTo(maxRepeat.getValue())>0 )
                maxRepeat =entry;
        }


        System.out.println("Слово с максимальным колличеством повторений " + maxRepeat);


    }

        }


   // }


