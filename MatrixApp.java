public class MatrixApp
{
    public static void main(String[] args)
    {
        Matrix SumMatrix = new Matrix();

        Matrix MatrixA = new Matrix();
        Matrix MatrixB = new Matrix();

        System.out.println("Matrix A");
        MatrixA.setCell(0,0,1);
        MatrixA.setCell(0,1,2);
        MatrixA.setCell(0,2,3);
        MatrixA.setCell(0,3,4);
        MatrixA.setCell(1,0,5);
        MatrixA.setCell(1,1,6);
        MatrixA.setCell(1,2,7);
        MatrixA.setCell(1,3,8);
        MatrixA.setCell(2,0,9);
        MatrixA.setCell(2,1,0);
        MatrixA.setCell(2,2,1);
        MatrixA.setCell(2,3,2);
        MatrixA.setCell(3,0,3);
        MatrixA.setCell(3,1,4);
        MatrixA.setCell(3,2,5);
        MatrixA.setCell(3,3,6);
        MatrixA.displayMatrix();

        System.out.println("________________________");

        System.out.println("Matrix B");
        MatrixB.setCell(0,0,1);
        MatrixB.setCell(0,1,2);
        MatrixB.setCell(0,2,3);
        MatrixB.setCell(0,3,4);
        MatrixB.setCell(1,0,5);
        MatrixB.setCell(1,1,6);
        MatrixB.setCell(1,2,7);
        MatrixB.setCell(1,3,8);
        MatrixB.setCell(2,0,9);
        MatrixB.setCell(2,1,0);
        MatrixB.setCell(2,2,1);
        MatrixB.setCell(2,3,2);
        MatrixB.setCell(3,0,3);
        MatrixB.setCell(3,1,4);
        MatrixB.setCell(3,2,5);
        MatrixB.setCell(3,3,6);
        MatrixB.displayMatrix();

        System.out.println("________________________");

        System.out.println("Display Sum of two Matrix");
        SumMatrix.addMatrix(MatrixA, MatrixB);
        SumMatrix.displayMatrix();
    }
}
