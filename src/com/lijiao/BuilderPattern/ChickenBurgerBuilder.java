package com.lijiao.BuilderPattern;

public class ChickenBurgerBuilder implements SetMealBuilder
{
    
    SetMeal setMeal;
    
     public ChickenBurgerBuilder()
    {
        setMeal=new SetMeal();//创建一个套餐实例，用来调用set方法
    }
    @Override
    public void buildStapleFood()
    {
        setMeal.setStapleFood("烹饪鸡腿汉堡");
    }
    
    @Override
    public void buildSnack()
    {
       setMeal.setSnack("烹饪薯条");
    }
    
    @Override
    public void buildDrinks()
    {
       setMeal.setDrinks("烹饪可乐");
    }
    
    @Override
    public SetMeal buildSetMeal()
    {
        return setMeal;//返回一个套餐实例
    }
    
}
