package com.lijiao.CombinatorialPattern;

public class Test
{
    public static void main(String[] args)
    {
        //创建根节点
        Composite composite=new Composite("根节点");
        composite.print();
        //创建树枝节点
        Composite branch=new Composite("树枝节点1");
        composite.add(branch);
        //创建叶子节点
        Leaf leaf=new Leaf("叶子节点1");
        Leaf leaf2=new Leaf("叶子节点2");
        composite.add(leaf);
        branch.add(leaf2);
        //递归遍历获得树
        display(composite);
    }
    
    public static void display(Composite root)
    {
        for(Component c:root.getChildren()){
            if (c instanceof Leaf)
            {
                c.print();
            }else{
                c.print();
                 display((Composite)c);
            }
            }
    }
}
