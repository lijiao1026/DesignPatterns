package com.lijiao.AbstractFactory;

public class Customer
{
    
    public static void main(String[] args)
    {
        //鸡腿堡套餐
        ChickBurgerSetMeal chickBurgerSetMeal=new ChickBurgerSetMeal();
        chickBurgerSetMeal.createSnack();
        chickBurgerSetMeal.createDrinks();
        
        //鳕鱼套餐
        CodHamburgerSetMeal codHamburgerSetMeal=new CodHamburgerSetMeal();
        codHamburgerSetMeal.createSnack();
        codHamburgerSetMeal.createDrinks();
    }
    
}
