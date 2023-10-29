import java.util.Scanner;
class DataStruct{
public static void main(String[] args){
int[] arr=new int[5];
int i;
Scanner ds=new Scanner(System.in);
System.out.println("Enter the value");
for(i=0;i<=4;i++)
	arr[i]=ds.nextInt();

System.out.println("The values are ");
for(i=0;i<=4;i++)
System.out.println(arr[i]);
}
}