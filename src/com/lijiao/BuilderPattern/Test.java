package com.lijiao.BuilderPattern;

public class Test
{
    
    public static void main(String[] args)
    {
        SetMealDirector setMealDirector=new SetMealDirector();
        SetMeal setMeal=setMealDirector.constructBuilder(new ChickenBurgerBuilder());
        System.out.println(setMeal.getStapleFood());
        System.out.println(setMeal.getSnack());
        System.out.println(setMeal.getDrinks());
    }
    
}
