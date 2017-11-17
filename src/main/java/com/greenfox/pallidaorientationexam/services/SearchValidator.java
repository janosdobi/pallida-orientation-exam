package com.greenfox.pallidaorientationexam.services;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SearchValidator {

    private List<Character> enabledChars;

    public SearchValidator() {
        this.enabledChars = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '-', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
    }

    public boolean validateSearch(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input.toLowerCase());
        for (int i = 0; i < sb.length(); i++) {
            if (!enabledChars.contains(sb.charAt(i))||sb.length()>7) {
                return false;
            }
        }
        return true;
    }
}