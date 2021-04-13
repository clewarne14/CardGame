package main;

import java.util.*;

public class table{
    private Stack<card> played;


    public table(){
        played = new Stack<card>();
    }
    public Stack<card> getPlayed(){
        return played;
    }
    
}
