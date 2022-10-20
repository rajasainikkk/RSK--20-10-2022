package com.exception.bll;

public class CheckFileExtensionClass 
{
	public static void main(String[] args) 
	{

		String students[] = {"Raja ","Amit ","Vikram "};
		String files[] = {"notes.java","raj.txt","",};
		
		String name="";
		try {
			int i=0;
			for(String file:files)
			{
				int number = checkFileExtension(file);
				
				if(number == 1)
					System.out.println("Hello "+students[i]+" Your file is a java file. So your score is 1 ");
				else
					System.out.println("Hello "+students[i]+" Your file is not a java file. So your score is 0 ");
				i++;
				name=students[i];
			}
			
		}
		catch(NullException ex) {
			System.out.println("Hello "+name +" Your have send a null. Your score is -1");
			System.err.println("NullException :"+ex.getMessage());
		}
		catch(EmptyException ex) {
			System.out.println("Hello "+name +" Your have send a empty. Your score is -1");
			System.err.println("EmptyException : " +ex.getMessage());
		}
		catch(Exception ex) {
			System.out.println("Your score is -1");
			System.out.println("Error :"+ex.getMessage());
		}


	}
	//Function for check file extension
	public static int checkFileExtension(String fileName) throws EmptyException, NullException{
		
		if(fileName==null) {
			throw new NullException("This is null String");
		}
		if(fileName.isEmpty()) {
			throw new EmptyException("This is empty String");
		}
		
		String file="";
		//This loop used for get (.java) string from filename and store file variable 
		//if you don't want to use for loop so you can use endsWith() method.
		for(int i=fileName.length()-1; i>=fileName.length()-5; i--)
		{
			if(i>0)
			file = fileName.charAt(i) + file;
			
		}
		if(file.equals(".java"))
			return 1;
		
		return 0;
	}
	
}
