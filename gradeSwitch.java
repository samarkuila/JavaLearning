import java.util.Scanner;
class student{
String name;
int ben,eng,geo,edn,coma,tot; //data member
float grade,avg;

public void grade(){
Scanner scan=new Scanner(System.in);
System.out.println("Enter your name::");
name=scan.nextLine();
System.out.println("Enter your Marks:");
System.out.println("Bengali:");
ben=scan.nextInt();
System.out.println("English:");
eng=scan.nextInt();
System.out.println("Geography:");
geo=scan.nextInt();
System.out.println("Education:");
edn=scan.nextInt();
System.out.println("Computer:");
coma=scan.nextInt();
tot=ben+eng+edn+geo+coma;
avg=tot/5;

int n=(int)(avg/10); //explicit declaration
switch(n){
case 9: System.out.println("Grade: A++");
          break;
case 8: System.out.println("Grade: A+");
          break;
case 7: System.out.println("Grade: A");
          break;
case 6: System.out.println("Grade: B+");
          break;
case 5: System.out.println("Grade: B");
          break;
case 4: System.out.println("Grade: PASS");
          break;
default: System.out.println("Fail");
          break; 
}	
}	
	
}




class gradeSwitch{
public static void main(String[] args){
student s=new student();
student n=new student();
s.grade();
n.grade();


}
}