package Data_Types;

public class LabSession1 {
    public static void main(String[] args) {
        /*
         Qn 1
         Write a program to print college of ICT 7 times
        */
        String coict = "College of ICT";
        System.out.println(coict);
        System.out.println(coict);
        System.out.println(coict);
        System.out.println(coict);
        System.out.println(coict);
        System.out.println(coict);
        System.out.println(coict);
        
        /*
        Qn2 
        Write a java program to solve the area of triangle
        with base= 8cm and height=15cm
        */
        double height=15,base=8;
        System.out.println(0.5*base*height);

        /*
            Qn3
            Write a java program to solve for x
            x^2 - 3x - 10 = 0

            x = (-b + or - sqrt(b^2 - 4ac)) / 2a
            quadratic formula

            the roots are 5 and -2
        */
        double a = 1, b = -3, c = -10,x1=0,x2=0;
        x1 = (-b + Math.sqrt((b*b) - (4*a*c))) / (2 * a);
        x2 = (-b - Math.sqrt((b*b) - (4*a*c))) / (2 * a);
        System.out.println(x1);
        System.out.println(x2);
    }
}
