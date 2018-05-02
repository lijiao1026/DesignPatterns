package com.lijiao.PrototypeModel;

import java.util.ArrayList;
import java.util.List;

public class PersonDemo
{
    
    public static void main(String[] args) throws CloneNotSupportedException
    {
        List<String> hands=new ArrayList<String>();
        hands.add("左手");
        //第一个对象
        Person person=new Person();
        person.setHands(hands);
        person.setName("男人");
        System.out.println(person.toString());
        //第二个对象
        Person person2=person.clone();
        System.out.println(person2.toString());
        person2.setName("女人");
        hands.add("右手");
        System.out.println(person.toString());
        System.out.println(person2.toString());
    }
    
}
