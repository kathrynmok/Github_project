
/**
 * Write a description of class Workflow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HelloWorld
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;

    public void run() {
        if ( a == 5) {
            System.out.println("SUCESS");
        }    else {
            System.out.println("FALIURE");
        }
        if ( b == 2) {
            System.out.println("SUCESS");
        }   else {
            System.out.println("FALIURE");
        }   
        if (c != 1) {
            System.out.println("SUCCESS");
        }   else {
            System.out.println("FALIURE");
        }
        if (d == -8 && a == 4) {
            System.out.println("SUCCESS");
        }   else {
            System.out.println("FALIURE");
        }
    }
}           