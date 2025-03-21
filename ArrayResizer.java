public class ArrayResizer
{
  /** Returns true if and only if every value of row r in array2D is nonzero.
   * Precondition: r is a valid row of array2D.
   * Postcondition: array2D is unchanged.
   */
  public static boolean isNonZeroRow(int[][] array2D, int r)
  {
    /* to be implemented in part (a) */
    for (int col=0; col<array2D[r].length; col++){
      if (array2D[r][col]==0){
        return false;
      }
    }
    return true;
  }

  /** Returns the number of rows of array2D that contain all nonzero values.
   * Postcondition: array2D is unchanged.
   */
  public static int numNonZeroRow(int[][] array2D)
  {
    int count = 0;
    for (int row = 0; row < array2D.length; row++)
    {
       if (isNonZeroRow(array2D, row))
       {
          count++;
       }
    }
    return count;
  }

  /** Returns a new, possibly smaller, two-dimensional array that contains only rows
   * from array2D with no zeros, as described in part (b).
   */
  public static int[][] resize(int[][] array2D)
  {
    /* to be implemented in part (b) */
    int[][] resized = new int[numNonZeroRow(array2D)][array2D[0].length];
    int i=0;
    for (int row=0; row<array2D.length; row++){
      if (isNonZeroRow(array2D, row)){
        resized[i]=array2D[row];
        i++;
      }
    }
    return resized;
  }
}
