package com.lijiao.CombinatorialPattern;

import java.util.ArrayList;

public class Composite extends Component
{

    public Composite(String name)
    {
        super(name);
    }
    private ArrayList<Component> components=new ArrayList<Component>();
    
    public void add(Component component){
        this.components.add(component);
    }
    
    public void remove(Component component){
        this.components.remove(component);
    }
    
    public ArrayList<Component> getChildren(){
        return this.components;
    }
    
    
}
