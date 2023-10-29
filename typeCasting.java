public class typeCasting {
  public static void main(String[] args) {
   
    double myDouble = 9.222541; // incompatible types: possible lossy conversion from double to int
     int myInt = myDouble;
    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
  }
}