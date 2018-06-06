package com.lijiao.BridgeMode;

public class Test
{
    
    public static void main(String[] args)
    {
        Game game=new GameStart();
        game.setCharacter(new CharacterA());
        game.createCharacter();
        game.setGameplay(new GameplayA());
        game.playGameplay();
        game.setGameplay(new GameplayB());
        game.playGameplay();
        System.out.println("-------------------------");
        game.setCharacter(new CharacterB());
        game.createCharacter();
        game.setGameplay(new GameplayA());
        game.playGameplay();
        game.setGameplay(new GameplayB());
        game.playGameplay();
    }
    
}
