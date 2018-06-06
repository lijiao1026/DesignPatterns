package com.lijiao.CombinatorialPattern;

public abstract class Component
{
    private String name;
    public Component(String name){
        this.name=name;
    }
    public void print(){
        System.out.println(name);
    }
}
