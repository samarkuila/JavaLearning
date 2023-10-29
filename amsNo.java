import java.util.Scanner;



class amsNo{
public static void main(String [] args){

//Scanner sc=new Scanner(System.in);
//System.out.println("Enter the Range");
//int r=sc.nextInt();
for(int i=1;i<=1000;i++){
int s=0;
int temp=i;
while(temp != 0){
int rem = temp % 10;
s=s+(rem * rem * rem); 
temp=temp/10; 

}
if(s==i)
System.out.println(i);
}
}
}
