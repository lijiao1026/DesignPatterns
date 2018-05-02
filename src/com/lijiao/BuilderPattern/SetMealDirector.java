package com.lijiao.BuilderPattern;

public class SetMealDirector
{
    public SetMeal constructBuilder(ChickenBurgerBuilder chickenBurgerBuilder)
    {
        chickenBurgerBuilder.buildStapleFood();
        chickenBurgerBuilder.buildSnack();
        chickenBurgerBuilder.buildDrinks();
        return chickenBurgerBuilder.buildSetMeal();
    }
}
