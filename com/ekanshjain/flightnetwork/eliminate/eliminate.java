/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ekanshjain.flightnetwork.eliminate;

/**
 *
 * @author E
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class eliminate{    
    
    public static void main(String[] args)
    {
        prob2 x = new prob2();
        int m,i,j; 
        String data;
        System.out.print("Enter M: ");
        m = takeinput();

        for(i=0;i<m;i++){
            System.out.println("Enter only string data.");
            System.out.print("Enter data(" + i + "): ");
            data = datainput();
            x.add(data);
        }
        get_winner(m,x);
    
    
    }
    
    public static int takeinput(){
            int op=-1;
            String input = null;
            try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            input = is.readLine();
            op = Integer.parseInt(input);
            }catch(NumberFormatException e){
                System.out.println("Not a valid number: " + input);
            }catch(Exception e){
                System.out.println("Unexpected IO error:" + e);
            }
            return op;
    }
    
    public static String datainput(){
            
            String input = null;
            try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            input = is.readLine();
            
            }catch(Exception e){
                System.out.println("Unexpected IO error:" + e);
            }
            return input;
    }
    
    public static int del(prob2 x){
        int rval=0;
        if(!(x.get_when_one())){
        x.delete();
        rval = 1;
        }
        return rval;
    }
    
    public static void get_winner(int m, prob2 x){
        int n,i,rval=0;
        do{
            System.out.print("Enter N: ");
            n = takeinput();
            System.out.println();
            if(!(n>0 &&n<m)){
                System.out.println("Invalid input.");                    
            }
        }while(!(n>-1 &&n<m));
        
        for(i=0;i<n;i++){               
        if(i==n-1){
            rval=del(x);            
            i=0;
            if(rval==0)
                break;
        }        
        x.getnext();
    }   
    System.out.println("");
    System.out.println("Winner is: " + x);    
    }
}
