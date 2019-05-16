package com.demo.exception;

public class ExceptionDemo {

	public static void main(String[] args) throws Exception 
	{
		
		ExceptionDemo demo=new ExceptionDemo();
		demo.displayNumbers();
	}
	
	 public void displayNumbers() throws MyException    
     {          
         for(int i=0;i<10;i++)       
         {      
            try{        
             System.out.println(i);           
             if(i==6)           
             {                  
               throw new MyException("My ExceptionOccurred");              
             } 
            }
            catch(Exception e){
           System.out.println( e+" " );
         }     
     }
}
}

