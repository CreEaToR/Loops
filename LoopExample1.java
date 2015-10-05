import java.util.Scanner;

public class LoopExample1
{
  public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.out);
	        
	String inputUser = "";
		        
	String inputPass = "";
			         
	String User = "";
				         
	String Pass = "";  
					         
	int x = 0;
						         
	System.out.println("Please create a username and password");
							         
	while(x<1)
	 {
	System.out.println("Username");
									         
	User = input.next();
										         
	System.out.println("Password");
											         
	Pass = input.next();
												         
	System.out.println("Welcome!, Please enter your username and password");
													         
	System.out.println("Username");
															    
	inputUser = input.next();
																    
	System.out.println("Password");
																	    
	inputPass = input.next();
																		    
	if(User == inputUser && Pass == inputPass)
	 {
																			        
	System.out.println("Welcome " + User);
																				        
	x++;
																					          
																						      }
																						          else
																							      {
																							          
																								      System.out.println("Wrong Password or Username, Please try again");
																							          
																									      
																									          }
																										      }
																									          
																											      
																											          
																												      
																												          
																													    }
																													      
																													        
																														  
																														  }
