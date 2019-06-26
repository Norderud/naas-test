package com.example.demo.controller;

import com.example.demo.domain.TestItem;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;

@RestController
@RequestMapping("/api")
public class TestController {

    @RequestMapping("/tester")
    public Collection<TestItem> getTester(){
        TestItem t1 = new TestItem(1, "Test1");
        TestItem t2 = new TestItem(2, "Test2");
        ArrayList<TestItem> list = new ArrayList();
        list.add(t1);
        list.add(t2);
        return list;
    }
    @RequestMapping("/test")
    public TestItem getTest(){
        return new TestItem(3, "Test3");
    }
}
