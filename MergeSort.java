public class MergeSort {
  public static void main(String[] args){
    int[] arr = {3, 4, 1, 7, 6, 8, 2, 9};
    printList(arr);
    mergeSort(arr, 0, arr.length - 1);
    printList(arr);
  }

  private static void mergeSort(int[] arr, int start, int end){
    if(start < end){
      int midPoint = (end - start)/2 + start;
      mergeSort(arr, start, midPoint);
      mergeSort(arr, midPoint + 1, end);
      merge(arr, start, midPoint, end);

    }
  }

  private static void merge(int[] arr, int start, int midPoint, int end){
    int i = start;
    int j = midPoint + 1;
    int[] temp = new int[end - start + 1];
    for(int k = 0; k <= end - start; k++){
      if(i <= midPoint && (j > end || arr[i] < arr[j])){
        temp[k] = arr[i];
        i++;
      } else {
        temp[k] = arr[j];
        j++;
      }
    }
    //System.arraycopy(temp, 0, arr, start, end - start + 1);
    copyArray(temp, 0, arr, start, end - start + 1);
    printList(temp);
  }
  private static void printList(int[] a){
    for(int element: a){
      System.out.print(element + " ");
    }
    System.out.println();
  }

  private static void copyArray(int[] source, int sourceIndex, int[] destination, int destinationIndex, int amountOfSource){
    if(source.length >= sourceIndex + amountOfSource && destination.length >= destinationIndex + amountOfSource){
      for(int i = 0; i < amountOfSource; i++){
        destination[destinationIndex + i] = source[sourceIndex + i];
      }
    }

  }
}
