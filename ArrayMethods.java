public class ArrayMethods {
  //Part 1
  //returns the sum of elements in Row x of ary.
  public static int rowSum (int[][] ary, int x) {
    if (x < 0 || x >= ary.length)
      return 0;
    int count = 0;
    for (int i = 0; i < ary[x].length; i++) {
      count += ary[x][i];
    }
    return count;
  }

//returns the sum of the elements in Column x of ary (careful with rows of different lengths!
  public static int columnSum (int[][] ary, int x) {
    int count = 0;
    for (int i = 0; i < ary.length; i++) {
      if (x >= ary[i].length) {
      count += 0;
    }
    else {
      count += ary[i][x];
    }
  }
      return count;
    }

    //Part 2
    //returns an array of the row sums for each row of ary.
   //Index i of the return array contains the sum of elements in row i.
    public static int[] allRowSums(int [][] ary) {
      int[] count = new int[ary.length];
        for (int i = 0; i < ary.length; i++) {
          count [i] = rowSum(ary, i);
      }
      return count;
    }

    //Returns an array with the column sum of each column of ary.
     //When a row is not long enough to reach the column count it as a zero. (NO indexOutOfBounds should ever occur)
     //Index i of the return array contains the sum of elements in column i, ignoring any rows that are too short.
    public static int[] allColSums(int[][] ary) {
      int len = 0;
      for (int i = 0; i < ary.length; i++) {
        if (ary[i].length > len) {
        len = ary[i].length;
    }
  }
    int[] count = new int[len];
    for (int i = 0; i < len; i++) {
      count[i] = columnSum(ary, i);
    }
    return count;
  }

  //Part 3
  //checks if the array is row-magic (this means that every row has the same row sum).
  public static boolean isRowMagic(int [][] ary) {
    int[] count = allRowSums(ary);
    for (int i = 0; i < count.length - 1; i++) {
      if (count[i] != count[i+1])
      return false;
    }
    return true;
  }

  //checks if the array is column-magic (this means that every column has the same column sum).
  public static boolean isColumnMagic(int[][] ary) {
    int[] count =  allColSums(ary);
    for(int i = 0; i < count.length - 1; i++) {
      if (count[i] != count[i+1])
      return false;
    }
    return true;
  }

}
