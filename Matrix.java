
public class Matrix
{
	private final int SIZE = 4;

    private int [][] squares = new int [SIZE][SIZE];


    public void addMatrix (Matrix a, Matrix b)
    {
        for (int x = 0; x < SIZE; x++)
        {
            for (int y = 0; y < SIZE; y++)
            {
                squares[x][y] = a.getCell(x, y) + b.getCell(x, y);
            }
        }
    }
    public void setCell (int x, int y, int value)
    {
        squares[x][y] = value;
    }
    public int getCell(int x, int y)
    {
        return squares[x][y];
    }
    public void displayMatrix()
    {
        for (int x = 0; x < SIZE; x++)
        {
            for (int y = 0; y < SIZE; y++)
            {
                System.out.print(this.getCell(x, y) + "\t");
            }
            System.out.println();
        }
    }
}
