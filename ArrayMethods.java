public class ArrayMethods {
  //Part 1
  //returns the sum of elements in Row x of ary.
  public static int rowSum (int[][] ary, int x) {
    if (x < 0 || x >= ary.length) {
      return 0;
    }
    int count = 0;
    for (int i = 0; i < ary[x]length; i++) {
      count += [x][i]
    }
    return count;
  }

//returns the sum of the elements in Column x of ary (careful with rows of different lengths!
  public static int columnSum (int[][] ary, int x) {
    int count = 0;
    for (int i = 0; i < ary.length; i++) {
      count += ary[x][i];
      }
      return count;
    }







}
