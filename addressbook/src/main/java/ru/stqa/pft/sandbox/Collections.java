package ru.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        String[] langs = {"Java", "C#", "Python", "PHP"};

        List<String> languages = new ArrayList<String>();
        languages.add("Java");
        languages.add("C#");

        for (String l : languages) {
            System.out.println("I want to learn " + l);
        }
    }


}
