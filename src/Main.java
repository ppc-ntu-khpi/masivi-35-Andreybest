/**
 * Main class for starting an app
 * @author Andrii Kotliar
 */
public class Main {

    public static void main(String[] args) {
        Integer[][] matrix = { {0, 2, 3}, {2, 5, 5}, {6, 3, 3} };
        System.out.println("Before:");
        System.out.println(Matrix.toString(matrix));
        
        System.out.println("After:");
        System.out.println(Matrix.toString(Matrix.sort(matrix)));
    }
}
