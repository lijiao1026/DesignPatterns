package com.lijiao.BridgeMode;

public abstract class Game
{
    private Character character;
    private Gameplay gameplay;
    public Character getCharacter()
    {
        return character;
    }
    public void setCharacter(Character character)
    {
        this.character = character;
    }
    public Gameplay getGameplay()
    {
        return gameplay;
    }
    public void setGameplay(Gameplay gameplay)
    {
        this.gameplay = gameplay;
    }
    // 具体的实现交给实现部分处理
    public void createCharacter(){
        character.createCharacter();
    }
    // 具体的实现交给实现部分处理
    public void playGameplay(){
        gameplay.playGameplay();
    }
    // 抽象的方法，留给继承实现
    public abstract void openGame();
    
}
