//Q6

class pranit {
  public static int SubArrayMax(int[] arr, int x) {
    int Minlength = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      int sum = 0;
      for (int j = i; j < arr.length; j++) {
        sum = sum + arr[j];
        if (sum > x) {
          Minlength = Integer.min(Minlength, j - i);
          return Minlength;
        }
      }
    }
    return Minlength;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 1, 10, 5, 2, 7 };
    int x = 9;
    System.out.print(SubArrayMax(arr, x));
  }
}

// optimise(self)
class pranit {
  public static int SubArrayMax(int[] arr, int x) {
    int i = 0;
    int j = 0;
    int sum = 0;
    int Minlength = Integer.MAX_VALUE;
    while (i < arr.length && j < arr.length) {
      if (j == arr.length - 1) {
        i++;
      }
      ;
      sum = sum + arr[j];
      if (sum > x) {
        Minlength = Integer.min(Minlength, j - i);
      }
      j++;
    }
    return Minlength;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 1, 10, 5, 2, 7 };
    int x = 9;
    System.out.print(SubArrayMax(arr, x));
  }
}