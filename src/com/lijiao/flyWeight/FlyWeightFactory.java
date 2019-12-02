package com.lijiao.flyWeight;

import java.util.HashMap;

public class FlyWeightFactory
{
    private HashMap<String, FlyWeight> allFlyWeight=new HashMap<String, FlyWeight>();
    public FlyWeightFactory(){
        
    };
    public FlyWeight getFlyWeight(String letter)
    {
        FlyWeight flyWeight=allFlyWeight.get(letter);
        if (flyWeight==null)
        {
            flyWeight=new ConcreteFlyWeight(letter);
            allFlyWeight.put(letter, flyWeight);
        }
        return flyWeight;
    }
    
    public int getAllFlyWeightSize()
    {
        return allFlyWeight.size();
    }
}
