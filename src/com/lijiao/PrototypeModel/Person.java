package com.lijiao.PrototypeModel;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable
{
    private String name;
    private List<String> hands;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public List<String> getHands()
    {
        return hands;
    }
    public void setHands(List<String> hands)
    {
        this.hands = hands;
    }
    @Override
    protected Person clone()
        throws CloneNotSupportedException
    {
        String name=this.name;
        List<String> hands=new ArrayList<>(this.hands);
        Person person=new Person();
        person.setName(name);
        person.setHands(hands);
        return person;
    }
    @Override
    public String toString()
    {
        return "Person [name=" + name + ", hands=" + hands + "]";
    }
    
}
