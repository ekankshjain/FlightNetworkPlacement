/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ekanshjain.flightnetwork.stack;

/**
 *
 * @author E
 */
import java.io.*;

public class Stack
{
    
	public static void main(String args[])
	{
            int popout,choice,data,cont=1;
            StackTest s = new StackTest();
            long data1,max=9999999999L;
           
		
	do{
            System.out.println("1. Push(Stack)");
            System.out.println("2. Pop(Stack)");
            System.out.println("3. Pattern");
            System.out.print("Enter yr choice: ");
            choice = takeinput();
            
            switch(choice)
            {
                case 1:
                {
                    do{
                        System.out.print("Enter the data between 0 and 9 (0-9) : ");
                        data = takeinput();
                        System.out.println();
                        if(!(data>-1 &&data<10)){
                            System.out.println("Invalid input.");                    
                        }
                    }while(!(data>-1 && data<10));
                    s.push(data);
                    break;
                }
                case 2:{
                    popout = s.pop();
                    break;
                }
                case 3:{
                    StackTest s1 = new StackTest();
                    do{
                        
                        System.out.print("Enter the pattern(max 10 digit): ");
                        data1 = takelinput();
                        System.out.println();
                        if(!(data1>10 && data1<=max)){
                            System.out.println("Invalid input.");                    
                        }
                    }while(!(data1>10 && data1<max));
                    
                    s1.pattern(data1);
                    break;
                }
                default:{
                    System.out.println("Invalid choice.");
                    break;
                }    
            }
            if(choice==1 || choice==2){
                s.display();
            }
            
            do{
               System.out.print("Do you want to continue(1 - Yes , 0 - No): ");
               cont=takeinput(); 
               System.out.println();
                if(!(cont>-1 &&cont<2)){
                    System.out.println("Invalid input.");                    
                }
            }while(!(cont>-1 &&cont<2));                        
        }while(cont==1);
		
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
        
        public static long takelinput(){
            long op=-1;
            String input = null;
            try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
               input = is.readLine();
            op = Long.parseLong(input);
            }catch(NumberFormatException e){
                System.out.println("Not a valid number: " + input);
            }catch(Exception e){
                System.out.println("Unexpected IO error:" + e);
            }
            return op;
        }       
}

