package com.example.wordcounter;

import org.springframework.web.bind.annotation.*;

@RestController
public class WordCountController {

    @PostMapping("/count")
    public String countWords(@RequestBody String text) {
        if (text == null || text.trim().isEmpty()) {
            return "0";
        }
        String[] words = text.trim().split("\s+");
        return String.valueOf(words.length);
    }
}