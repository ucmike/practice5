import java.util.Random;

class Main {
  public static void main(String[] args) {
    int a =10;
    int b =13;
    int c =18;
    findMax(a, b);
    System.out.println("Should be 7: " + findMax2(a, b));
    System.out.println();
    
    System.out.println("Should be 9: " + findMax3(a, b, c));
    System.out.println("Should be 9: " + findMax3(c, a, b));
    System.out.println("Should be 9: " + findMax3(b, c, a));
    System.out.println("Should be 9: " + findMax3(a, b, c));
    System.out.println();
    
    System.out.println("min is: " + findMinArray());
    System.out.println();
    
    System.out.println("min is: " + findMinArray2D());
    System.out.println();    // just for formatting
    int numsArr[] = new int[7];
    Random r = new Random();
    for (int i = 0; i < numsArr.length; i++) {
      numsArr[i] = r.nextInt(51);
    }
    System.out.println("min is: " + findMinArray1D(numsArr));
  }

  // practice problem 1
  static void findMax(int x, int y) {
          if(x >= y)System.out.println(x);
          else System.out.println(y);
          }

  // practice problem 2
  static int findMax2(int x, int y) {
    if (x >= y)
      return x;
    else
      return y;
  }

  // practice problem 3
  static int findMax3(int x, int y, int z) {
    if (x >= y && x >= z)
      return x;
    else if (y >= x && y >= z)
      return y;
    else
      return z;
  }

  // practice problem 4
  static int findMinArray() {
    int nums[] = new int[7];
    Random r = new Random();
    for (int i = 0; i < nums.length; i++) {
      nums[i] = r.nextInt(101);
    }
    int min = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
    return min;
  }

  // practice problem 5
  static int findMinArray2D() {
    int nums[][] = new int[3][7];
    Random r = new Random();
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[0].length; j++) {
        nums[i][j] = r.nextInt(101);
      }
    }
    int min = nums[0][0];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[0].length; j++) {
        if (nums[i][j] < min) {
          min = nums[i][j];
        }
      }
    }
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[0].length; j++) {
        System.out.print(nums[i][j] + " ");
      }
      System.out.println();
    }
    return min;
  }

  // practice problem 6
  static int findMinArray1D(int nums[]) {
    int min = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
    return min;
  }
}