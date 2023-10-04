package com.example.singlaslantgithubactions.Services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.singlaslantgithubactions.Model.CoinFlip;
import com.example.singlaslantgithubactions.Model.RoundResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
public class HelloServiceTest {

    private HelloService helloService;
    @BeforeEach
    void setHelloService(){
        helloService = new HelloService();
    }
    @Test
    void returnHelloReturnsHello(){
        assertEquals(helloService.returnHello(), "red red red");
    }
}
