package com.example.singlaslantgithubactions.Services;

import org.springframework.stereotype.Component;

@Component
public class HelloService {
    public String returnHello(){
        return "HELLO!!!";
    }
    //Cool comment in master which I hope gives a merge conflict
}
