import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Enemy extends Actor
{
    private int vx =0;
    GameOver game_over = new GameOver();
    
    
    public Enemy()
    {
        GreenfootImage myImage=getImage();
        int myNewHeight=(int)myImage.getHeight()/2;
        int myNewWidth=(int)myImage.getWidth();
        myImage.scale(myNewHeight,myNewWidth);
        turn(90);//permet la rotation
    }
    
     public Enemy(int v)
    {
       vx = v;//permet de faire sortir les loups aleatoirement
    }
    
    public void move()
    {
        setLocation(getX() + vx, getY());//permet le mouvements des loups 
    }

    public void act() 
    {
       move();
       
       World w = getWorld();
       List liste = new ArrayList();
          //permet la disparition des loups
       if(getX()<10)
       {
           liste = getNeighbours(15,true,Mouton.class);
           w.removeObject((Mouton)liste.get(0));//permet la dispaition des moutons
           Greenfoot.playSound("dead.mp3");//ajout du son
           //permet l'affichage de game over
           if ((w.getObjects(Mouton.class)).isEmpty())
           {
               w.addObject(game_over,13,9);
           }
           w.removeObject(this);
       }
    }    
}
