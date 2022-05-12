import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arme here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arme extends Actor
{
    
    public Arme()
    {
        GreenfootImage myimage = getImage();
        int L = (int)myimage.getHeight()/2;
        int l = (int)myimage.getWidth();
        myimage.scale(l,L);
    }
    
    public void act() 
    {
        // Add your action code here.
        World w = getWorld();
        move(1);
        if(isAtEdge())
        {
            w.removeObject(this);//supprime l'arme lorsqu'il arrive à la fin
        }
        else
        {
            if(isTouching(Enemy.class))
            {
                removeTouching(Enemy.class);//supprime le loup
            }
        }
    }    
}
