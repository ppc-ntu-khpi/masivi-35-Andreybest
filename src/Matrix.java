
import java.util.Arrays;

/**
 *
 * @author Andrii Kotliar
 */
public class Matrix {
    public static Object[][] sort(Object[][] matrix) {
        Object[] matrixElements = new Object[matrix.length * matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrixElements[i * matrix.length + j] = matrix[i][j];
            }
        }
        Arrays.sort(matrixElements);
        
        Object[][] sortedMatrix = new Object[matrix.length][matrix.length];
        for (int i = 0; i < sortedMatrix.length; i++) {
            for (int j = 0; j < sortedMatrix.length; j++) {
                sortedMatrix[i][j] = matrixElements[i * sortedMatrix.length + j];
            }
        }
        return sortedMatrix;
    }
    
    public static String toString(Object[][] matrix) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object[] row : matrix) {
            stringBuilder.append(Arrays.toString(row) + "\n");
        }
        return stringBuilder.toString();
    }
}
