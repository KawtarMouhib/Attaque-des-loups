import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Person extends Actor
{
    
    public Person()
    {
        
        GreenfootImage myimage = getImage();
        int L = (int)myimage.getHeight() * 2;
        int l = (int)myimage.getWidth() * 2;
        myimage.scale(l,L);
        GreenfootImage myImage=getImage();
        int myNewHeight=(int)myImage.getHeight() ;
        int myNewWidth=(int)myImage.getWidth() ;
        myImage.scale(myNewHeight,myNewWidth);
    }
    
    public void act() 
    {
        // Add your action code here.
        mover();
        shooter();
    }    
    
    public void mover ()
    {
        if (Greenfoot.isKeyDown("Up"))
        {
            setLocation( getX(), getY() - 2);
        }
        if (Greenfoot.isKeyDown("Down"))
        {
            setLocation( getX(), getY() + 2);
        }
    }
    
    public void shooter()
    {
        World w = getWorld();
        if (Greenfoot.isKeyDown("space"))
        {
            w.addObject(new Arme(), getX() + 1, getY());
        }
    }
}
