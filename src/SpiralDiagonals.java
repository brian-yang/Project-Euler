/**
 *
 * @author ABCD
 */
public class SpiralDiagonals {
    public static void main(String[] args) {
        
        int nums = 0;
        int rows = 3;
        int inc = 2;
        int sum = 1;
        int now = 1;
        
        while (rows <= 1001) {
            while (nums <= 3) {
                now += inc;
                sum += now;
                nums++;
            }
            inc += 2;
            nums = 0;
            rows += 2;
        }
        
        System.out.println(sum);
    }
}
