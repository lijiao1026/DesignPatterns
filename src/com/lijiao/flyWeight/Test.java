package com.lijiao.flyWeight;

public class Test
{
    
    public static void main(String[] args)
    {
        FlyWeightFactory flyWeightFactory=new FlyWeightFactory();
        FlyWeight fly1= flyWeightFactory.getFlyWeight("h");
        fly1.createLetter();
        FlyWeight fly2= flyWeightFactory.getFlyWeight("e");
        fly2.createLetter();
        FlyWeight fly3= flyWeightFactory.getFlyWeight("l");
        fly3.createLetter();
        FlyWeight fly4= flyWeightFactory.getFlyWeight("l");
        fly4.createLetter();
        FlyWeight fly5= flyWeightFactory.getFlyWeight("o");
        fly5.createLetter();
        System.out.println("------------");
        System.out.println(flyWeightFactory.getAllFlyWeightSize());;
        System.out.println(fly3==fly4);
    }
    
}
