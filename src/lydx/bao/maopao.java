package lydx.bao;

public class maopao<i> {
  public static void main(String[] args) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        int tmp;
        if (arr[j] < arr[j + 1]) {
          tmp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = tmp;
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

  }

  static int[] arr = {3, 4, 6, 1, 123, 344, 45, 12};

}
