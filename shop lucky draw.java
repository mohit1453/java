import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner myObj = new Scanner (System.in);
      System.out.println ("Enter the Customer Name");

    String userName = myObj.nextLine ();
      System.out.println ("Enter the Bill Number");

    String bill = myObj.nextLine ();
      System.out.println ("Enter the Purchased Amount");
    int puram = myObj.nextInt ();
    if (bill.contains ("[a-zA-Z]+") == false && bill.length () == 6)
      {
	int billnumber = Integer.parseInt (bill);
	int remainder, result = 0;

	while (billnumber != 0)
	  {
	    remainder = billnumber % 10;
	    result = result + remainder;
	    billnumber /= 10;
	  }
	if (result == 0)
	  {
	    System.out.println ("Invalid bill number");
	  }
	else
	  {
	    if (result % 2 == 0)
	      {
		float a = puram;
		System.out.println ("Total bill amount is " + a);
		System.out.println("Congratultions!! You are selected for lucky draw");
	      }
	    else
	      {
		float f=puram - puram*10/100;
		System.out.println ("Total bill amount is " + f);



	      }
	  }
      }
    else
      System.out.println ("Invalid bill number");


  }
}
