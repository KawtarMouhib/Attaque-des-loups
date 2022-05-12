import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    Person p = new Person();
    private int e = 0;

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(30, 20, 32); 
        addObject(p,13,9);
        prepare();
        Greenfoot.playSound("Le hurlement du loup.mp3");
    }
    
    public void act()
    {
        if(e>0) 
            e--;
        else
            e = 6;
            
       if(e == 1)
        {
            
            int i =0;
            int py = Greenfoot.getRandomNumber(getHeight());
            Enemy enemy = new Enemy(-( 2 + Greenfoot.getRandomNumber(2)));
            addObject(enemy,getWidth() + 30, py);
            
         
        }  
    
    }
   
    
    private void prepare()
    {
        Mouton mouton = new Mouton();
        Enemy Enemy=new Enemy();

        addObject(mouton,3,13);
        Mouton mouton2 = new Mouton();
        addObject(mouton2,3,15);
        Mouton mouton3 = new Mouton();
        addObject(mouton3,5,14);
        Mouton mouton4 = new Mouton();
        addObject(mouton4,5,16);
        Mouton mouton5 = new Mouton();
        addObject(mouton5,3,16);
        mouton2.setLocation(3,14);
        removeObject(mouton2);
        addObject(mouton2,3,15);
        //maison.setLocation(2,1);
        House maison2 = new House();

        addObject(maison2,4,3);
        mouton2.setLocation(3,14);
        mouton2.setLocation(3,15);
        mouton2.setLocation(3,14);
        mouton2.setLocation(3,14);
        mouton2.setLocation(3,14);
        mouton5.setLocation(3,15);
        mouton5.setLocation(3,15);
        mouton4.setLocation(5,15);
        Mouton mouton6 = new Mouton();
        addObject(mouton6,5,13);
        Mouton mouton7 = new Mouton();
        addObject(mouton7,4,17);
        Mouton mouton8 = new Mouton();
        addObject(mouton8,4,12);
        mouton7.setLocation(4,16);
        Gazon gazon = new Gazon();
        addObject(gazon,0,0);
        Gazon gazon2 = new Gazon();
        addObject(gazon2,0,19);
        mouton6.setLocation(6,13);
        mouton3.setLocation(6,14);
        mouton4.setLocation(6,15);
        mouton6.setLocation(7,13);
        mouton3.setLocation(7,14);
        mouton4.setLocation(7,15);
        Gazon gazon3 = new Gazon();
        addObject(gazon3,5,14);
        Gazon gazon4 = new Gazon();
        addObject(gazon4,9,14);
        mouton6.setLocation(7,12);
        mouton6.setLocation(7,12);
        mouton6.setLocation(7,12);
        mouton3.setLocation(7,13);
        mouton3.setLocation(7,13);
        mouton4.setLocation(7,14);
        Mouton mouton9 = new Mouton();
        addObject(mouton9,7,16);
        mouton9.setLocation(7,15);
        Arbre arbre = new Arbre();
        addObject(arbre,1,3);
        Arbre arbre2 = new Arbre();
        addObject(arbre2,13,17);
        Gazon gazon5 = new Gazon();
        addObject(gazon5,29,0);
        //Person paysan = new Person();
        //addObject(paysan,13,9);
        Arbre arbre3 = new Arbre();
        addObject(arbre3,15,2);
        Arbre arbre4 = new Arbre();
        addObject(arbre4,28,18);
        Gazon gazon6 = new Gazon();
        addObject(gazon6,29,19);
        Gazon gazon7 = new Gazon();
        addObject(gazon7,23,9);
        Arbre arbre5 = new Arbre();
        addObject(arbre5,29,13);
        arbre5.setLocation(29,13);
        arbre5.setLocation(28,12);
        arbre2.setLocation(11,17);

        mouton8.setLocation(1,8);
        mouton.setLocation(1,10);
        mouton2.setLocation(1,12);
        mouton5.setLocation(1,14);
        mouton7.setLocation(1,16);
        mouton6.setLocation(3,9);
        mouton3.setLocation(3,12);
        mouton4.setLocation(3,14);
        mouton9.setLocation(5,12);

        gazon.setLocation(1,1);
        arbre.setLocation(2,2);
        arbre3.setLocation(9,2);
        gazon.setLocation(2,3);
        gazon4.setLocation(4,8);
        arbre2.setLocation(10,17);
        arbre2.setLocation(9,17);
        arbre5.setLocation(28,1);
        gazon5.setLocation(26,1);
        gazon7.setLocation(25,1);
        arbre4.setLocation(26,18);
    }
}
