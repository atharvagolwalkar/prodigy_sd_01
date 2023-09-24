import java.util.*;
public class temp_convert
{
static Scanner sc = new Scanner(System.in); 

static double c_f(double c){
 double f = (c * 9/5) + 32;
    return f;
}
static double c_k(double c){
 double k = c + 273.15;
    return k;
}
static double f_c(double f){
 double c = (f - 32) * 5/9;
    return c;
}
static double f_k(double f){
 double k = (f - 32) * 5/9 + 273.15;
    return k;
}
static double k_c(double k){
 double c =  k - 273.15;
    return c;
}
static double k_f(double k){
 double f =(k - 273.15) * 9/5 + 32;
    return f;
}
 static void output(double num){
    System.out.printf(" %.2f",num);
  }


public static void main(String []args)
   {
System.out.println("1.Celcius to Fahrenheit\n2.Celcius to Kelvin\n3.Fahrenheit to celcius\n4.Fahrenheit to kelvin\n5.Kelvin to celcius\n6.Kelvin to Fahrenheit\n7.Exit");
do      {
System.out.println("\nEnter choice: ");
int ch = sc.nextInt();
System.out.println("\nEnter temperature value: ");
double temp= sc.nextDouble();
double num =0;
switch(ch) {
case 1:
 num=c_f(temp);
output(num);
System.out.println("f");
break;
case 2:
 num=c_k(temp);
output(num);
System.out.println("k");
break;
case 3:
 num=f_c(temp);
output(num);
System.out.println("c");
break;
case 4:
 num=f_k(temp);
output(num);
System.out.println("k");
break;
case 5:
num=k_c(temp);
output(num);
System.out.println("c");
break;
case 6:
 num=k_f(temp);
output(num);
System.out.println("f");
break;
case 7: System.exit(0);
break;
default: System.out.println("Invalid input");
	   }
	}
while(true);
    }
}