/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ekanshjain.flightnetwork.eliminate;

/**
 *
 * @author E
 */
class prob2 {
    Node rear;    
    
    public prob2()
    {
        rear = null;        
    }

    @Override
    public String toString()
    {
        if(rear==null)
            return " ";
        Node temp = rear.next;
        String retval = "";
        
        do
        {
            retval= (retval + temp.data.toString() + " ");
            temp = temp.next;
        }while(temp!=rear.next);       
        
        return retval;
    }

    public boolean isEmpty()
    {
        return (rear==null);
    }

    public void clear()
    {
        rear=null;
    }

    public void add(String st)
    {
        try{
        Node temp = new Node(st,null);
        if(rear==null)
        {
            temp.next = temp;
            rear = temp;
        }
        else
        {
            temp.next = rear.next;
            rear.next = temp;
        }
        rear = rear.next;
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public boolean get_when_one(){
        Node temp,temp1;
        temp = rear;
        temp1 = rear.next;
        if(temp1.next == temp.next){
            return true;
        }   
        return false;
    }

    public String delete()
    {
        if(isEmpty())
            return "empty list";
        
        String temp = rear.next.data;
        System.out.println("deleted: " + rear.next.data);
        rear.next = rear.next.next;
        
        return temp;
    }
    
    public void getnext(){
        rear = rear.next;
    }
}