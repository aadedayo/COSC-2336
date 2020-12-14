/* Adedayo Adebanjo							`
 * COSC 2336
 * 11/05/2020
 * Purpose: Code implementation to convert an infix expression to a postfix expression using a stack to implement 
 * 			- I also tested my project with the main method.*/

package infixandPrefixexpression;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author aaded
 *
 */
public class InfixandPrefixexpression {
	
	/**This class was created to differentiate the operators
	 * @param ch The operators
	 * @return return 1 or 2 depending on the operator and return 0 if there's none
	 */
	public static int precedence(char ch)
    {
       if(ch=='+' && ch=='-')
            return 1;
       else if(ch=='*' && ch=='/')
            return 2;
        return 0;
    }
	
   /**This class converts infix to postfix
 * @param infix here is the infix that we want to convert
 * @return postfix
 */
	public static String infixtoPostfix(String infix)
    {
        String postfix = new String(""); // to store the postfix
        
        Stack<Character> stack = new Stack<>(); // Create a stack
         
        // Dijkstra's Shunting-yard Algorithm.
        for (int i=0;i<infix.length();++i)
        {
            char ch = infix.charAt(i);	
            if (Character.isLetterOrDigit(ch))
              {
                postfix += ch;
              }
            else if (ch == '(')
                stack.push(ch);
                
            else if (ch == ')')
            {
                while (!stack.isEmpty() && 
                        stack.peek() != '(')
                    postfix += stack.pop();
                 
                 if(!stack.isEmpty())
                    stack.pop();
            }
            else 
            {
           while (!stack.isEmpty() &&stack.peek() != ')' &&stack.peek() != '(' && precedence(ch) 
                         <= precedence(stack.peek()))
                         {
                    postfix += stack.pop();
                     }
                stack.push(ch);
            }
      
        }
      
        while (!stack.isEmpty()){
            postfix += stack.pop();
         }
        return postfix;
    }
   
     /** The calculation for the evaluation of the expression.
     * @param infix input
     * @return the result
     */
    static int ResultEvaluation(String infix) 
     { 
        Stack<Integer> stack=new Stack<>();  // Create a stack
      
        for(int i=0;i<infix.length();i++) 
        { 
            char ch=infix.charAt(i); 
            if(Character.isDigit(ch)) 
            stack.push(ch - '0'); 
            else
            { 
                int val1=stack.pop(); 
                int val2=stack.pop(); 
                if(ch=='+')
                {
                   stack.push(val2+val1);  
                }
                else if(ch=='-')
                {
                   stack.push(val2-val1);  
                }
                else if(ch=='*')
                {
                   stack.push(val2*val1);  
                }
                else if(ch=='/')
                {
                    stack.push(val2/val1);
                }
            } 
        } 
        return stack.pop();
    }

	/**This is the main method, and it tests the whole project
	 * @param args NOT USED
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter an Infix Expression: "); // Prompt user for the input
        String infix=input.next(); // Read the input
        String postfix=infixtoPostfix(infix); // Covert to postfix with the help of the method
        System.out.println("Here is the Postfix Expression: "+postfix); // Output the postfix
        int Evaluation = ResultEvaluation(postfix); // Calculate the evaluation of the expression
        System.out.println("Here is the Evaluation of this Expresion "+Evaluation); // Output the eveluation

	}

}
