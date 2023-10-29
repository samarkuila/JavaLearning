class A{
    int num=10,x,y;
    //default constructor
    A(){ 
        System.out.println("Default Constractors::"+x);

  }

    A(int a,int b){ 
        int x=12;
        this.x=a;           
        y=b;
        int sum=this.x+y;
        System.out.print("Parameterised Constructors ::Sum="+sum);

  }
}

class testConstructors{
       public static void main(String [] args){
        A obj=new A();
        A obj1=new A(5,6);
        
   

       }

}