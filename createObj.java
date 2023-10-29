import java.util.Scanner;

class student {
    String name;
    int beng, eng, math, geo, coma, total;
    float grade, avg;

    private void calculateGrade() { // Renamed the method to calculateGrade
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scan.nextLine();
        System.out.println("Enter your marks:");
        System.out.print("Bengali: ");
        beng = scan.nextInt();
        System.out.print("English: ");
        eng = scan.nextInt();
        System.out.print("Mathematics: ");
        math = scan.nextInt();
        System.out.print("Geography: ");
        geo = scan.nextInt();
        System.out.print("Computer application: ");
        coma = scan.nextInt();
        total = beng + eng + math + geo + coma;
        System.out.println("Total marks is: " + total);
        avg = total / 5.0f; // Used 5.0f to ensure floating-point division
        System.out.println("Average: " + avg);

        int n = (int) (avg / 10);
        switch (n) {
            case 9:
                System.out.println("Grade: A++");
                break;
            case 8:
                System.out.println("Grade: A+");
                break;
            case 7:
                System.out.println("Grade: B+");
                break;
            case 6:
                System.out.println("Grade: B");
                break;
            case 5:
                System.out.println("Grade: Pass");
                break;
            default:
                System.out.println("Fail");
        }
		System.out.println("************************");
    }
}

class createObj {

    public static void main(String[] args) {
      
	 
	  student s;
	  s=new student();	  
	  System.out.println(s);
      s.calculateGrade();
      
        
     
    }
}

