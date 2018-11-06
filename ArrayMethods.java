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
      if (x < ary[x].length) {
      count += ary[x][i];
      }
    }
      return count;
    }

    //Part 2
    //returns an array of the row sums for each row of ary.
   //Index i of the return array contains the sum of elements in row i.
    public static int[] allRowSum(int [][] ary) {
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
        if (ary[i].length > len)
        len = ary.length;
    }
    int[] count = new int[len];
    for (int i = 0; i < count.length; i++) {
      count[i] = columnSum(ary, i);
    }
    return count;
  }









}
