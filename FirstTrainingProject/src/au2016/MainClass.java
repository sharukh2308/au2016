package au2016;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args){
		NewClass obj=new NewClass();
		Scanner input=new Scanner(System.in);
		Boolean flag = true;
		while(flag){
			System.out.print("Enter First Number: ");
			Integer a=input.nextInt();
			System.out.print("Enter Second Number: ");
			Integer b=input.nextInt();
			System.out.println("Enter option");
			System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Modulus");
			Integer opt=input.nextInt();
			
			switch(opt){
				case 1:
					System.out.println("Result: "+(obj.add(a, b)).toString());
					break;
				case 2:
					System.out.println("Result: "+(obj.subtract(a, b)).toString());
					break;
				case 3:
					System.out.println("Result: "+(obj.multiply(a, b)).toString());
					break;
				case 4:
					try{
						System.out.println("Result: "+(obj.divide(a, b)).toString());
					}catch(ArithmeticException e){
						e.printStackTrace();
					}
					break;
				case 5:
					System.out.println("Result: "+(obj.mod(a, b)).toString());
					break;
				default:
					System.out.println("Enter valid option");
			}
			
			System.out.print("Continue? y/n: ");
			String c = input.next();
			if(c.equals("y"))
				flag = true;
			else
				flag = false;
		}
	}
}
