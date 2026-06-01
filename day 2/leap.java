import java.util.Scanner;	
public class leap{
    public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter year:");
int year=sc.nextInt();
if(year%100!=0)
System.out.println("Its leap year");
else
System.out.println("Its not a leap year");
}
}
