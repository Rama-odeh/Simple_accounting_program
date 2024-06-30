//Simple accounting program 
package F101;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FinalProject101 {
	
	 static Scanner on=new Scanner(System.in);

	public static void main(String[] args) {
		
	FinalProject101 ob=new FinalProject101();
	   ob.check();  
	}
	
//method  to verify the user name and password
public void check() {
		
	String name,password;
	System.out.println("Enter Username:");
	name=on.nextLine();
	if(name.equals("Ahmad")) {
		System.out.println("Enter Password:");
		password=on.nextLine();
		if(password.equals("Ahmad@33"))
		{
			count();
				
		}
		 else
			System.out.println("The password is incorrect");
		}
		else
			System.out.println("The username is incorrect..Try agin");
}



//method to enter expenses, sales and tax calculation
public static void count() {
	//variable to sum salesOperation and expenses
	 double  sales=0.0;
	double expense=0.0;
	//use array to enter salesOperation and expenses
	int []salesOperations=new int [20];
    int[]expenses=new int[5];
    
    //for loop to enter salesOoperation
  for(int x=0;x<salesOperations.length;x++) {
 	   System.out.println("Enter selling number "+ (x+1) +":" );
 	   salesOperations[x]=on.nextInt();
 	  sales+= salesOperations[x];
    }
    
   //for loop to enter expenses
  for(int x=0;x<expenses.length;x++) {
	 System.out.println("Enter expenses number "+ (x+1)+":" );
	 expenses[x]=on.nextInt();
	 expense+=expenses[x];
 }
 
  //calculate netSales and taxSales 
  double netSales=sales-expense;
  double taxRate=netSales*0.16;
  
  System.out.println("taxRate= "+taxRate);
  
 FinalProject101 ob1=new FinalProject101();
  ob1.checkSalesExpense(sales,expense);
 ob1.message(sales,expense,taxRate);

}

//method to show appropriate message 
 public  void checkSalesExpense(double sales,double expense){
	  if(expense>sales) 
		  JOptionPane.showMessageDialog(null, "Sales are greater than expenses, management must intervene");
	  
	  else if(sales>=1000)
		  JOptionPane.showMessageDialog(null, "Thanks for the excellent sale");
	  
	  else if(sales<1000)
		
		  JOptionPane.showMessageDialog(null, "problem" +" ",
				  " Sales less from 1000" , JOptionPane.WARNING_MESSAGE);
	  	}

 
 //method to show sales, expense and taxRate uses JFrame
 public  void message(double sales,double expense,double taxRate) {
	
	    JFrame frame=new JFrame();
	   frame.setTitle("Accountant program");
	   frame.setSize(400,400);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   JPanel panel=new JPanel();
	   JLabel label1,label2,label3;
	   label1=new JLabel("Sales= "+sales);
	   label2=new JLabel("    Expense= "+expense);
	   label3=new JLabel("    TaXRate= "+taxRate);
	   panel.add(label1);
	   panel.add(label2);
	   panel.add(label3);
	   frame.add(panel);
	   frame.setVisible(true);
	}
		
}
