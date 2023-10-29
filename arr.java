import java.util.Scanner;

class arr{
public static void main(String[] args){
int[] arr=new int[5];
int i;
Scanner s=new Scanner(System.in);
 System.out.println("Enter the Value: ");
for(i=0;i<=4;i++){
    arr[i]=s.nextInt();
}

for(i=0;i<=4;i++){
    System.out.println("Value:"+arr[i]);
}


}

}