import javax.swing.JOptionPane;

public class EnumDemo{

enum Month{

January,February,March,April,May,June,July,August,September,October,November,December;


}

   public static void main(String args[]){
      
   Month choice[] = {Month.January,Month.February,Month.March,Month.April,Month.May,Month.June,Month.July,Month.August,Month.September,Month.October,Month.November,Month.December};
	    
	       Month select = (Month)JOptionPane.showInputDialog(null, "Select your month", "Month", JOptionPane.INFORMATION_MESSAGE,null,choice,choice[0]);
	          
		     
		        
			   
	switch(select){
	
	case December:
	JOptionPane.showMessageDialog(null,"Do you want to build a snowman?");
	break;
	case January:
	JOptionPane.showMessageDialog(null,"Do you want to build a snowman?");
	break;
	case February:
	JOptionPane.showMessageDialog(null,"Do you want to build a snowman?");
	break;
	case March:
	JOptionPane.showMessageDialog(null,"Happy spring day");
	break;
	case April:
	JOptionPane.showMessageDialog(null,"Happy spring day");
	break;
	case May:
	JOptionPane.showMessageDialog(null,"Happy spring day");
	break;
	case June:
	JOptionPane.showMessageDialog(null,"It’s a summer time");
	break;
	case July:
	JOptionPane.showMessageDialog(null,"It’s a summer time");
	break;
	case August:
	JOptionPane.showMessageDialog(null,"It’s a summer time");
	break;
	case September:
	JOptionPane.showMessageDialog(null,"Welcome to the foliage season!");
	break;
	case October:
	JOptionPane.showMessageDialog(null,"Welcome to the foliage season!");
	break;
	case November:
	JOptionPane.showMessageDialog(null,"Welcome to the foliage season!");
	break;
																	        
  }

	boolean continueLoop = true;
	
	while(continueLoop){
if(!JOptionPane.showInputDialog(null, "Select your account type.", "Account Type", JOptionPane.INFORMATION_MESSAGE, null, choice, choice[3]).equals(JOptionPane.CANCEL_OPTION)){
																		         
																			    JOptionPane.showInputDialog(null, "Select your account type.", "Account Type",JOptionPane.INFORMATION_MESSAGE, null, choice, choice[3]).equals(JOptionPane.CANCEL_OPTION);
	 }
																					    
  }
																					             
																						           
																							         
																								       
																								             
																									           
																										         }
																											    }
