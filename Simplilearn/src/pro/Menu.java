package pro;

import java.io.File;
import java.util.Scanner;

public class Menu
{

	public static void main(String[] args)
	{
		System.out.println("");
		System.out.println("");
		System.out.println("				********************************				");
		System.out.println("				********************************				");
		System.out.println("						Locked.Me								");
		System.out.println("				********************************				");

		Menu in= new Menu();
		in.menuList();

	}

	// Display Options
	public void menuList()
	{
		try
		{
		
		System.out.println("");
		System.out.println("");
		System.out.println("Enter 1: For List of Files in a Directory");
		System.out.println("Enter 2: For Business level Operations in a Directory");
		System.out.println("Enter 3: For Closing the Application");
		System.out.println("");
		
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter Your choice:- ");  
		String a= sc.next();  
		 
		switch(a)
		{
				case "1":
				{
					listOfFiles();
					
				}
				break;
		case "2":
				{
					//2
					menuList2();
					
				}
				break;
				
				case "3":
				{
					System.out.println(" ");
					System.out.println("Thank you for using this Prototype");
					
				}
				break;
				default:
				{
					System.out.println("You have Entered a INVALID OPTIONS");
				
					System.out.println("Please Enter 1 or 2 or 3 only");
					menuList();
				}
				
		}
		
		sc.close();
		}
		catch(Exception e)  
		{  
			e.printStackTrace(); 
			
		}
	
		
	}
		
		
		
		
	
	
	// Second Level Options
	public void menuList2()
	{
try {
			
			System.out.println("********");
			System.out.println("Enter 1: to Create a file");
			System.out.println("Enter 2: to Delete a file");
			System.out.println("Enter 3: to Search a file");
			System.out.println("Enter 4: Exit ");
			System.out.println("Enter your option::");
			Scanner da = new Scanner(System.in);
			String data = da.next();
		
			
		
			switch(data)
			{
							case "1":
							{
								
								createFile();
								
								
							}
				               break;
							case "2":
							{
								
								delFile();
								
							}
				               break;
							case "3":
							{
								
								searchFile();
							
								
							}
				               break;
							case "4":
							{
							
								System.out.println("you are directed to main Menu");
								menuList();
								
								
							}
							break;
							default :
							{
								System.out.println("You entered invalid Inputs... Please enter valid inputs");
								menuList2();
							}
							da.close();	
					
		}	
			
		
		}
		catch(Exception e)  
		{  
			e.printStackTrace();  
		}		
	}
	
	// ****************1.List of files in a directory**************************8
	public void listOfFiles()
	{
		try
		{
		System.out.println("List of the files in the directory");
    	
		String dir ="C:\\Users\\REVANTH\\eclipse-workspace\\Simplilearn";
		File directory = new File(dir);
		File[] fileList = directory.listFiles();
		if (fileList != null)
		{
			for(File file: fileList)
			{
			System.out.println(file.getName());
			}
		}
		else
		{
			System.out.println("File directory is empty");
		}
		}
		catch(Exception e)  
		{  
			e.printStackTrace(); 
			
		}	
	
	menuList();
	}
	
	// *****************2.1 Creation of a file**************************
	public void createFile()
	{
		{
			try
			{
			
			
			System.out.println("Enter the file name that you want to create:");		
			Scanner in = new Scanner (System.in);
			String filename= in.next();
		
			File f= new File (filename);
				
			if (f.createNewFile()) 
				{
				System.out.println( "You have sucessfully created a new file  :"+"'" +f.getName()+"'"+ " in the directory");
				
				}
			else
				{
					System.out.println( f.getName()+  ":File already exists ");	
				}	
			menuList2();
			in.close();
			}
			
			catch(Exception e)  
			{  
				e.printStackTrace(); 
				System.out.println("File is not created ");
			}		
		}
	}
	
	//*****************2.2 Deletion of a file ****************************
	
	public void  delFile()
	{
		
		try  
		{ 
			File directory = new File("C:\\\\Users\\\\REVANTH\\\\eclipse-workspace\\\\Simplilearn"); 
			System.out.println("Enter the file that you want to Delete");
			Scanner sc = new Scanner(System.in);
			String data = sc.next();
			
			File f = new File(data);
			String in = data;
			
			String[] flist = directory.list(); 
			
			int flag = 0; 
			if (flist == null) 
			{ 
				System.out.println("Empty directory."); 
			} 
			else
			{ 
				for (int i = 0; i < flist.length; i++) 
				{ 
					String filename = flist[i];
					if (filename.equals(in)) 
					{ 
						flag = 1; 
					f.delete();
						{
							System.out.println( "'"+f.getName()+" '"+" file is deleted Sucessfully");
						}
					}
				}
				
			}
			if (flag == 0) 
			{ 
				System.out.println("There is no such File to Delete"); 
			}	
		menuList2();
		sc.close();
		}  
	
	catch(Exception e)  
	{  
		e.printStackTrace();  
	}
		
		
		
	}
	//*****************2.3 Search a file *********************************
	public void searchFile()
	{
		
		 try {
			
		 
			 File directory = new File("C:\\Users\\REVANTH\\eclipse-workspace\\Simplilearn"); 

				
				System.out.println("Enter the file name to search:");
				Scanner sc = new Scanner(System.in);
				String name= sc.nextLine(); 
				// store all names with same name 
				// with/without extension 
				String[] flist = directory.list(); 
				int flag = 0; 
				if (flist == null) { 
					System.out.println("Empty directory."); 
				} 
				else { 

					// Linear search in the array 
					for (int i = 0; i < flist.length; i++) { 
						String filename = flist[i]; 
						if (filename.equals(name)) { 
							System.out.println("'"+filename + "'"+" file founded Sucessfully"); 
							flag = 1; 
						} 
					} 
				} 

				if (flag == 0) { 
					System.out.println("File Not Found"); 
				} 
					
				menuList2();	
				sc.close();
		 }
		 catch(Exception e)  
			{  
				e.printStackTrace();  
				System.out.println("File doesnt found");
			}		
		
		
	}
	
}
