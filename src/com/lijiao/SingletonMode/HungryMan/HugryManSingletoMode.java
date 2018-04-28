package com.lijiao.SingletonMode.HungryMan;

public class HugryManSingletoMode
{
    private HugryManSingletoMode(){System.out.println("饿汉式单例");}
    private static HugryManSingletoMode hugryManSingletoMode=new HugryManSingletoMode();
    public static HugryManSingletoMode getInstance(){
        return hugryManSingletoMode;
    }
}
