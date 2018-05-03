package com.lijiao.AdapterPattern;

public class ObjectTest
{
    
    public static void main(String[] args)
    {
        Usb usb=new UsbObjectAdapter(new TypeCer());
        usb.isUsb();
    }
    
}
