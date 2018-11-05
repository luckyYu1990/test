package com.example.springboot;

import com.example.springboot.mq.Producer;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CommonTest {
    @Test
    public void testString(){
        String str1 = "a";
        String str2 = "a";
        Assert.assertEquals(true,str1==str2);
        String str3 = new String("a");
        String str4 = new String("a");
        Assert.assertEquals(true,str3==str4);

    }

    @Test
    public void testStringHashCode(){
        String str1 = "a";
        String str2 = "a";
        int h1 = str1.hashCode();
        int h2 = str2.hashCode();
        Assert.assertEquals(true,h1==h2);
        String str3 = new String("a");
        String str4 = new String("a");
        int h3 = str3.hashCode();
        int h4 = str4.hashCode();
        Assert.assertEquals(true,h3==h4);
    }
    @Test
    public void testStringInDiffObject(){
        Test1 t1 = new Test1();
        Test2 t2 = new Test2();
        Assert.assertEquals(true,t1.str==t2.str);
    }

    @Test
    public void testPutMap(){
        Map<String,String> m1 = new HashMap<String,String>();
        String str1 = new String("a");
        String str2 = new String("a");
        m1.put(str1,"b");
        m1.put(str2,"c");
        Assert.assertEquals("c",m1.get(str2));
    }
    @Autowired
    private Producer producer;
    @Test
    public void testMq(){
        for(int i=0;i<100;i++){
            producer.sendMessage("hahahah");
        }
    }
    @Test
    public void testThreadCallable() throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        Future future = pool.submit(()->"s");
        pool.shutdown();
        System.out.print(future.get().toString());
    }
    @Test
    public void testMap(){
        Map map = new HashMap();
        map.put(null,"a");
        System.out.print(map.get(null));
        Map map2 = new Hashtable();
        map2.put(null,"b");
        System.out.print(map2.get(null));
    }
    @Test
    public void testEntity(){
        List<InnerTest> list =new ArrayList<>();
        InnerTest test = new InnerTest();
        test.id = "1";
        list.add(test);
//        for(InnerTest t:list){
//            InnerTest t2 = t;
//            t2.id = "2";
//        }
//        System.out.print(test.id);
        InnerTest[] arr = {test};
        for(int i = 0;i<arr.length;i++){
            InnerTest t2 = arr[i];
            InnerTest t3 = new InnerTest();
            t3.id = "2";
            t2 = t3;
        }
        System.out.println(test.id);
    }

    public class InnerTest{
        public String id;

    }
}
