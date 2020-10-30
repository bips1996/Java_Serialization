//Biplaba Samantaray 18MCMC05 MCA-V

import LinkedList.* ;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable ;


public class LinkedSerialization {
	public static void main(String[] args)
	{
		LinkedList l1 = new LinkedList() ;
		l1.insert(l1, 1) ;
		l1.insert(l1, 2) ;
		l1.insert(l1, 3) ;
		l1.insert(l1, 4) ;
		l1.insert(l1, 5) ;
		l1.insert(l1, 6) ;
		l1.insert(l1, 7) ;
		l1.insert(l1, 8) ;
		l1.insert(l1, 9) ;
		l1.insert(l1, 10) ;
		
		LinkedList l2 = new LinkedList();
		l2.insert(l2, 50) ;
		l2.insert(l2, 51) ;
		l2.insert(l2, 52) ;
		l2.insert(l2, 53) ;
		l2.insert(l2, 54) ;
		l2.insert(l2, 55) ;
		l2.insert(l2, 56) ;
		l2.insert(l2, 57) ;
		l2.insert(l2, 58) ;
		l2.insert(l2, 59) ;
		
		
		
		LinkedList l3 = new LinkedList() ;
		l3.insert(l3, 100) ;
		l3.insert(l3, 101) ;
		l3.insert(l3, 103) ;
		l3.insert(l3, 104) ;
		l3.insert(l3, 105) ;
		l3.insert(l3, 106) ;
		l3.insert(l3, 107) ;
		l3.insert(l3, 108) ;
		l3.insert(l3, 109) ;
		l3.insert(l3, 110) ;
		
		
		LinkedList l4 = new LinkedList() ;
		l4.insert(l4,300) ;
		l4.insert(l4,301) ;
		l4.insert(l4,302) ;
		l4.insert(l4,303) ;
		l4.insert(l4,304) ;
		l4.insert(l4,305) ;
		
        String filename = "file.txt"; 
          

        try
        {    
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream obout = new ObjectOutputStream(file); 
              
            obout.writeObject(l1); 
            obout.writeObject(l2);
            obout.writeObject(l3);
            obout.writeObject(l4);
            
            obout.close(); 
            file.close(); 
              
            System.out.println("Object Serialized"); 
  
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("Exception caught : IOException"); 
        }
            
        LinkedList ob = null; 
        LinkedList ob2 =null ;
        LinkedList ob3 =null ;
        LinkedList ob4 =null ;
        
        try
        {    
            
            FileInputStream file = new FileInputStream(filename); 
            ObjectInputStream fin = new ObjectInputStream(file); 
              
            
            ob = (LinkedList)fin.readObject();
            ob2 = (LinkedList)fin.readObject();
            ob3 = (LinkedList)fin.readObject(); 
            ob4 = (LinkedList)fin.readObject(); 
            
            System.out.println("Object Deserialised\nOUTPUT : ");
            
            ob.printList(ob);
            ob.printList(ob2);
            ob.printList(ob3);
            ob.printList(ob4);
            
            fin.close(); 
            file.close(); 
            
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("Exception caught : IOException"); 
        } 
          
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("Exception caught : Class Not Found "); 
        } 
	}
}


