
/**
 * Write a description of class FORLOOP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FORLOOP
{   public void run () {
        for (int i = 0; i < 15; i++) {
            System.out.println("i is equal to "+i);
        }
        for (int j = 10; j > 0; j = j + (-2)) {
            System.out.println("i is equal to "+j);
        }
        for (int k = 10; k == 0; k = k + (-3)) {
            System.out.println("i is equal to "+k);
        }
    }
}