public class SelectionSort {
  public static void main(String[] args){
    int[] a = {1, 3, 2, 6, 8, 9, 7};
    printList(a);
    selectionSort(a);
  }
  /*creating a sorting algorithm that saves the current value and < checks it
   against the rest of the list and swaps*/
  private static void selectionSort(int[] a){
    int pointer = 0;
    int temp = 0;
    for(int i = 0; i < a.length; i++){
      pointer = i;
      for(int j = i; j < a.length; j++){
        if(a[j] < a[pointer]){
          pointer = j;
        }
      }
      if(pointer != i){
        temp = a[pointer];
        a[pointer] = a[i];
        a[i] = temp;
      }
      printList(a);
    }
  }
  private static void printList(int[] a){
    for(int element: a){
      System.out.print(element + " ");
    }
    System.out.println();
  }
}
