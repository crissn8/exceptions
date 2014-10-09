package edu.upc.eetac.dsa.csanchez.exercici1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import edu.upc.eetac.dsa.csanchez.exercici1.BigNumberException;

public class LeerFichero {
	
	
	public static void main(String [] arg) throws Exception {
		 
	      File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	   
	      try {
	         // Apertura del fichero
	         archivo = new File ("C:\\Users\\Cristina\\Documents\\numeros.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         // Lectura del fichero
	         String linea;        
	         while((linea=br.readLine())!=null){
	        	 	
	         		int num=Integer.parseInt(linea); 
	         
	         if (num>1000){
	        	 throw new BigNumberException();
	         }else{
	        	 System.out.println(linea);
	         	}
	        }
	       }
	   
	      
	       
	      catch(IOException e){
	          System.out.println("Error E/S: el fichero no existe");
	      }     catch(Exception BigNumberExcpetion ){
	    	 System.out.println(" El documento contiene un numero mayor que 1000");
	     }

	      finally{
	         try{
	        	 if(null !=fr ) {
	        		 fr.close();
	        	 }       	
	         }catch (Exception e2){
	        	 e2.printStackTrace();
	         }
	      }
		}
	}
	
	


