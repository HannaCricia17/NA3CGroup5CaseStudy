package labexam;

import java.util.Scanner;

public class LabExam {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Math Formula's \n");
       
       System.out.println("1. Calculate Area of a Circle");
       System.out.println("2. Calculate Circumference of a Circle");
       System.out.println("3. Calculate Diameter of a Circle");
       System.out.println("4. Check number if its a Perfect Square");
       System.out.println("5. Calculate Area of Rectangle");
       System.out.println("6. Calculate Area of Square");
       System.out.println("7. Check if number is Odd number");
       System.out.println("8. Check if number is Even number");
       System.out.println("9. Calculate Area of Triangle");
       System.out.println("\n Other Functions: \n");
       System.out.println("10. Check age by birth year");
       System.out.println("11. Check if a person is underage or not");
       System.out.println("12. Check if number is negative or positive");
       
       System.out.print("\n Choose from 1-12: ");
       int choice = sc.nextInt();
       
       
       //Charmaine Cargullo
       if (choice == 1) {
           System.out.println("1. Calculate Area of a Circle");
           System.out.print("Enter radius of circle: ");
           int c = sc.nextInt();
           areaCircle(c);
       }
       
       if (choice == 2) {
           System.out.println("2. Calculate Circumference of a Circle");
           System.out.print("Enter radius of circle: ");
           int r = sc.nextInt();
           circumferenceCircle(r);
       }
       
       
       //Hanna Cricia Manuel
        if (choice == 3) {
          System.out.println("3. Calculate Diameter of a Circle");
           System.out.print("Enter radius of circle: ");
           int r = sc.nextInt();
           diameterCircle(r);
       }
        
        if (choice == 4) {
           System.out.println("4. Check number if its a Perfect Square");
           System.out.print("Enter any number:");
           double num = sc.nextDouble(); 
           checkPerfectSquare(num);
           if (checkPerfectSquare(num)) 
		System.out.print(num+ " is a perfect square number"); 
	   else
		System.out.print(num+ " is not a perfect square number"); 
       }
        
        

       //Jerry Soriano
       if (choice == 5) {
           System.out.println("5. Calculate Area of Rectangle");
           System.out.print("Enter the length of Rectangle: ");
	   double length = sc.nextDouble();
	   System.out.print("Enter the width of Rectangle: ");
	   double width = sc.nextDouble();
	   areaRectangle(length, width);
        }
       
        if (choice == 6) {
            System.out.println("6. Calculate Area of Square");
            System.out.println("Enter Side of Square:");
            double side = sc.nextDouble();
       }
        
        
        //Thaniel Ibay
         if (choice == 7) {
             
         }
         
          if (choice == 8) {
           
          }
          
          
          
          //Jonas Dela Cruz
          if (choice == 9) {
           
         }
           
          if (choice == 10) {
           
         }
          
          
          
          //Jeremiah Buan
          if (choice == 11) {
           System.out.println("11. Check if a person is underage or not");
           System.out.println("Enter your Age: ");
           int age = sc.nextInt();
           age(age);
           }
       
         if (choice == 12) {
           System.out.println("12. Check if number is negative or positive");
           System.out.print("Enter a number: ");
           int num = sc.nextInt();
           positiveNegative(num);
       }
    }
    
    
    
    //METHODS
    
    //1 Cargullo
    public static void areaCircle (int num) {
           double circle = 3.14 * num * num;
	   System.out.println("Area of Circle is:"+ circle);
    }
    //2 Cargullo
    public static void areaRectangle (double a, double b) {
           double area = a*b;
	   System.out.println("Area of Rectangle is:"+ area);
    }
    
    
    //3 Manuel
    public static void circumferenceCircle (int num) {
         double circum = 3.14 * 2 * num;
	   System.out.println("Circuference of circle is:" + circum);  
    }
    //4 Manuel
    public static void diameterCircle (int num) {
           double diameter = 2 * num;
	   System.out.println("Diameter of circle is:" + diameter);
    }
    
    
    //5 Soriano
    public static boolean checkPerfectSquare(double x)  
    { 
	double sq = Math.sqrt(x); 
	return ((sq - Math.floor(sq)) == 0); 
    } 
    //6 Soriano
    public static void areaSquare(double x)  
    { 
	double area = x * x;
	System.out.println("Area of Square is: "+ area);
    } 
    
    
    //7 Ibay
        public static void odd(int x)  
    { 
	
    }
     //8 Ibay
       public static void even(int x)  
    { 
	
    } 
       
       
       //9 Dela Cruz
       public static void areaTriangle(double x, double y)  
    { 
	
    } 
       //10 Dela Cruz
        public static void byear(int num)  { 
	
    } 
        
        
        
        //11 Buan
          public static void age(int num)  { 
	if (num < 18) {
            System.out.print("Access Denied! - Your not old enough");
        }  else {
            System.out.print("Access Permitted!");
        }  
    } 
          //12 Buan
         public static void positiveNegative(int num)  { 
	if(num> 0)
        {
            System.out.println(num+" is a positive number");
        }
        else 
            System.out.println(num+" is a negative number");
        }   
         }

         
         
         
    }    
    

