package com.learn.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
@RestController
public class tech {
    private int techid;
    private String techname;
    String Lower = "abcdefghijklmnopqrstuvwxyz";
    String Upper = "ABCDEFGHIJKLMNOPQRSTUVWZYS";
    String Number = "0123456789";
    String Punctuation = "!@#$%&*()_+-=[]|,./?><";
    StringBuilder password = new StringBuilder(8);
    Random random = new Random(System.nanoTime());


    public int getTechid() {
        return techid;
    }

    public void setTechid(int techid) {
        this.techid = techid;
    }

    public String getTechname() {
        return techname;
    }

    public void setTechname(String techname) {
        this.techname = techname;
    }
    public void display()
    {
        System.out.println("Tech class done");
    }

    @RequestMapping("/password")
    public StringBuilder password(){
    List<String> charCategories = new ArrayList<>(4);
        charCategories.add(Lower);
        charCategories.add(Upper);
        charCategories.add(Number);
        charCategories.add(Punctuation);
        for (int i = 0; i < 8; i++)
    {
        String charCategory = charCategories.get(random.nextInt(charCategories.size()));
        int position = random.nextInt(charCategory.length());
        password.append(charCategory.charAt(position));
    }
        return password;
    }
}
