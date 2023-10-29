class methodOverloading {

  

    public static void main(String [] args){
        int x= add(5,8);
        System.out.println(x);
        double y=add(6.5,87);
        System.out.println("Double:"+y);
        char p=add('s','a');
        System.out.println("Double:"+p);
    }

    
    static int add(int a, int b){

        return a+b;
    }


    static double add(double a,double b){

        return (int) a+b;
    }  

    static char add(char a,char b){

        return (b); //implecit Declaration
    }

  
    
}
