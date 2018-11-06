import java.util.Scanner;

public class SubClassOne {
// Using array to find maximum score with scanner input  
   public void arrayForLoop() {
	 Scanner keyboard = new Scanner(System.in);
	 int[] score = new int[4];
	 int index, max;
	 System.out.println("plz enter 4 scores:");
	 score[0] = keyboard.nextInt();
	 max = score[0];
	 for (index = 1; index < score.length; index++){  
	   score[index] = keyboard.nextInt();
	   if (score[index] > max)
	      max = score[index];   
	 }
//   keyboard.close(); //close the Scanner after input
	 System.out.println("The max score is " + max);
	 
	 System.out.println("Each score is ");
	 for (index = 0; index < score.length; index++){
		 System.out.println(score[index] + " differs from the max score by " + (max - score[index]));
	 }	   
   }

// Using For-Each Loop thru each element of the array   
   public void forEachLoop(){
	  String[] words = {"Austin","AsGood","King","Queen"};
	      //for each loop thru each element of string array
	  for(String w : words){       // w is declared as a reference variable for string array
	     if(w.startsWith("A")){     // reference variable accesses startsWith() method
	        System.out.println(w + " starts with A");
	    }	
	  }
   }
   
// a simple calculator using Switch-Case structure    
   public void calculator() {
	   int num1, num2, rslt; 
	   char operator;
	   Scanner scan = new Scanner(System.in);
	   System.out.println("input first number: ");
	   num1 = scan.nextInt();
	   System.out.println("input second number: ");
	   num2 = scan.nextInt();
	   System.out.println("input operator with(+,-,*,/): ");
	   operator = scan.next().charAt(0); // using next().charAt(0) method to return an operator
//	   scan.close();
	   // switch case to evaluate operator type
	   switch(operator) {
	   case '+':
		   rslt = num1 + num2;
		   break;
	   case '-':
		   rslt = num1 - num2;
	       break;
	   case '*':
		   rslt = num1 * num2;
	       break;
	   case '/':
		   rslt = num1 / num2;
	       break;
	   default:
		   System.out.printf("Enter wrong");
		   return;
	   }
	   System.out.println("You get: " + num1 + operator + num2 + " = " + rslt); 
   }
   
// program to find sum of natural integers using WHILE-Loop
   public void whileLoopForSum() {
	   int number = 5, count = 1, total = 0;
	   while (count <= number ) {
		     total += count;  
		     count++; 
	   }
	   System.out.println("The sum of natural numbers: " + total);
   }

// to find sum of natural integers using FOR-Loop 
   public void forLoopForSum() {
	   int numer = 3, ttl = 0;
	   for (int cnter = 1; cnter <= numer; cnter++) {
		   ttl += cnter;
	   }
	   System.out.println("The sum of natural numbers: " + ttl);
   }
   
// to find sum of random natural numbers using user input
   public void scanInForSum() {
	   Scanner userIn = new Scanner(System.in);
	   System.out.println("You set n: ");
	   int numIn = userIn.nextInt();
	   int increter, allInt = 0;
	   for (increter = 1; increter<= numIn; increter++) {
		   allInt += increter;
	   }
	   System.out.print("You get sum: " + allInt);
   }
   
}











