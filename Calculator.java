import java.util.Scanner;
class Main {  
  public static void main(String args[]) { 
  
  //declaring  data types and variables names
  int num1,num2;
  String c;
 

 Scanner scan = new Scanner (System.in);
 
 //geting first number from the user
 System.out.println("Enter A First Digit: ");
 num1 = scan.nextInt();
 
 //geting the Symbol Or Operator (+,-,/,*) from The User
 System.out.println("Enter The Symbol : ");
 c = scan.next();
 
 //geting the Second Number From The User
 System.out.println("Enter A Second Digit: ");
 num2 = scan.nextInt();
 
 //Checking If Symbol or Opertor The User Input If Its (+,-,/,*) And Then Calculating Two Number With Thier Symbol or Operator
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
