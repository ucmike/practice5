import java.util.Random;

class Main {
  public static void main(String[] args) {
    int a =14;
    int b =13;
    int c =18;
    findMax(a, b); //changed to variables
    System.out.println("Should be 14: " + findMax2(a, b));
    System.out.println();
    
    System.out.println("Should be 18: " + findMax3(a, b, c));
    System.out.println("Should be 9: " + findMax3(c, a, b));
    System.out.println("Should be 9: " + findMax3(b, c, a));
    System.out.println("Should be 9: " + findMax3(a, b, c));
    System.out.println();
    
    System.out.println("min is: " + findMinArray());
    System.out.println();
    
    System.out.println("min is: " + findMinArray2D());
    System.out.println();   
    int numsArr[] = new int[10];
    Random r = new Random();
    for (int i = 0; i < numsArr.length; i++) {
      numsArr[i] = r.nextInt(51);
    }
    System.out.println("min is: " + findMinArray1D(numsArr));
  }

  
  static void findMax(int x, int y) { //notice this doesn't return but rather prints the result
          if(x >= y)System.out.println(x);
          else System.out.println(y);
          }

 
  static int findMax2(int x, int y) { // notice that this option has a return that we have to call from main.
    if (x >= y)
      return x;
    else
      return y;
  }


  static int findMax3(int x, int y, int z) {
    if (x >= y && x >= z)
      return x;
    else if (y >= x && y >= z)
      return y;
    else
      return z;
  }

 
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
        System.out.print(nums[i][j] + " ");//puts a space after each number
      }
      System.out.println();
    }
    return min;
  }


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