
/**
 * Write a description of class RenameThisClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arrays
{
    public static void main(String[] args) {
        String[] strArray = {"Alpha", "Bravo", "Charlie", "Delta", "Echo"};
        for (String i: strArray) {
            System.out.println(i);
        }
        for (int i = 0; i < strArray.length; i++) {
                strArray[i] = strArray[i];
                System.out.print(strArray[i]);
        }
        for (int i = 0; i < strArray.length; i++) {
                strArray[i] = strArray [i];
                System.out.print("-" + strArray[i]);
                
        }
    }
        }
