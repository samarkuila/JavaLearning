import java.util.Scanner;
class scanString{
public static void main(String[] args){
String[] s=new String[5];
int i=0;
Scanner scan=new Scanner(System.in);
System.out.println("Enter your name::");
for(i=0;i<5;i++)
s[i]=scan.nextLine();
for(i=0;i<5;i++)
System.out.println("Name:"+s[i]);
}
}