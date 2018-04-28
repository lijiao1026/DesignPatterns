package com.lijiao.SingletonMode.Slacker;

public class SlackerSingletonMode
{
    private SlackerSingletonMode(){System.out.println("懒汉式单例");};
    private static volatile   SlackerSingletonMode slackerSingletonMode=null;
    public static  SlackerSingletonMode getInstance(){
        if (slackerSingletonMode==null)
        {
            synchronized (SlackerSingletonMode.class)
            {
                if (slackerSingletonMode==null)
                {
                    slackerSingletonMode=new SlackerSingletonMode();
                }
            }
        }
        return slackerSingletonMode;
    }
    /*private static class InnerObjct{
        private  static SlackerSingletonMode slackerSingletonMode=new SlackerSingletonMode();
    }
    public static SlackerSingletonMode getInstance()
    {
        return InnerObjct.slackerSingletonMode;
    }*/
}
