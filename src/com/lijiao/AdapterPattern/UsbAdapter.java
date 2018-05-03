package com.lijiao.AdapterPattern;

public class UsbAdapter extends TypeCer implements Usb
{
    
    @Override
    public void isUsb()
    {
        isTypeC();
    }
    
}
