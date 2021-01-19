import java.util.Scanner;
class Main {  
  public static void main(String args[]) { 
  
  //declaring  data types and variables names
  int num1,num2;
  String c;
 

 Scanner scan = new Scanner (System.in);
 
 //getting first number from the User
 System.out.println("Enter A First Digit: ");
 num1 = scan.nextInt();
 
 //getting the Symbols Or Operators (+,-,/,*) from The User
 System.out.println("Enter The Symbol : ");
 c = scan.next();
 
 //getting the Second Number From The User
 System.out.println("Enter A Second Digit: ");
 num2 = scan.nextInt();
 
 //Checking If Symbols or Opertors That The  User Input If Its (+,-,/,*) And Then Calculating Two Number With Thier Symbols or Operators And Showing The Results
 if(c.equals("+")){
        int add = num1+num2;
        System.out.println("Result Is: "+ add);
    }
    
    else if(c.equals("-")){
        int sub = num1-num2;
        System.out.println("Result Is : "+ sub);
    }
    else if(c.equals("*")){
        int mul = num1*num2;
        System.out.println("Result Is : "+ mul);
    }
    
    else if(c.equals("/")){
        int div = num1/num2;
        System.out.println("Result Is : "+ div);
    }
    else{
        System.out.println("Valid Input");
    }
 
}

}
