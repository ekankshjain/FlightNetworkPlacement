/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ekanshjain.flightnetwork.stack;

/**
 *
 * @author E
 */
class StackTest
{
	int top;
	int item [] = new int[9];

	StackTest()
	{
		top = -1;
	}
        
	void push(int data)
	{
            int a=0;
		if(top == 9)
			System.out.println("Stack Overflow.");
                else{
                    if(top==-1){
                        item[++top] = data;
                        System.out.println("PUSH: " + data);
                    }
                    else{
                        a = item[top];
                        if(data == (a+1))
                        {
                            item[++top] = data;
                            System.out.println("PUSH: " + data);
                        }
                    }
                }
	}

	int pop()                
	{
            int pop;
		if(top < 0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
                else
                {
                    pop=item[top--];
                    System.out.println("POP : " + pop);
                    return pop;
                }
	}
        
        void display(){
            int i;
            System.out.print("Display Stack: ");
            for( i=-1; i<top-1; i++)
                System.out.print(item[i+1] + ", ");
            System.out.print(item[i+1] + " ");
            System.out.println();
            System.out.println();
        }
        
        void pattern(long pat){
            int valid=0;
            String str = Long.toString(pat);
            int st,pre; 
            int a,b,i,cntr=0;
            st=pre=0;
            
            for(i=0;i<str.length();i++){
                a = Character.getNumericValue(str.charAt(i));
                if(i==0){                
                b=Character.getNumericValue(str.charAt(i+1));
                if((a+1)!=b){                        
                        valid++;
                    }
                }
                
                if(i>0){                    
                    b=Character.getNumericValue(str.charAt(i-1));
                    if((a+1)==b){                        
                        valid=0;
                    }
                    else{
                        pre=st;
                        st=i;
                        if(st!=0){
                            patpp(st,pre,str);
                        }
                        valid++;
                        if(valid==2){
                         cntr=1;
                        }
                    }
                }
            }
            pre=st;
            st=i;
            patpp(st,pre,str);
            
                System.out.println("");                
            if(valid==0 && cntr!=1)
                System.out.println("valid pattern");                
            else
                System.out.println("Invalid pattern");
        }
        
        
        
        void patpp(int st,int pre, String str){
            int i;
            for(i=(st-1);i>=pre;i--){
            push(Character.getNumericValue(str.charAt(i)));
            }
            for(i=pre;i<st;i++){
            pop();
            }
        }
}
