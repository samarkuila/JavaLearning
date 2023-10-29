class human{   //Parent Class
    String a="I am owner";
    private void show(){

    System.out.println("Homo sapiens");
    }
   
}

class purba extends human{
public void showchild(){	
	
System.out.println("I am Purba");

}


}

class mul extends purba{
public void show(){
System.out.println(super.a);
System.out.println("I am 3rd Derived Class");

}


}

class singleLevel{
    public static void main(String[] args){
 
	human y=new mul();
	y.show();
	y.showchild();


    }

}