package com.lijiao.AdapterPattern;

public class UsbObjectAdapter implements Usb
{
    private TypeC typec;
    public UsbObjectAdapter(TypeC typeC)
    {
        this.typec=typeC;
    }
    
    @Override
    public void isUsb()
    {
        typec.isTypeC();
    }
    
}
