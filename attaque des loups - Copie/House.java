import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Maison here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class House extends Actor
{
    /**
     * Act - do whatever the Maison wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public House(){
        GreenfootImage House1=getImage();
        int myNewHeight=(int)House1.getHeight()*2;
        int myNewWidth=(int)House1.getWidth()*2;
        House1.scale(myNewHeight,myNewWidth);
    }
    public void act() 
    {
        // Add your action code here.
    }    
    
}
