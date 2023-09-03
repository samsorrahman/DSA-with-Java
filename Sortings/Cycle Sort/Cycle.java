public class CycleSort{
  public static void main(string[] args){
    int[] arr = {3, 5, 2, 1, 4};
    sort(arr);

    System.out.println(Arrays.toString(arr));
    
  }
  static void sort(int[] arr){
    int i=0;
    while(i<arr.length){
      int current = arr[i]-1;
      if (arr[i] != arr[current]){
        swap(arr, i, current);
      }else{
        i++
      }
    }
  }
  static void swap(int[] arr, int first, int second){
    int tem= arr[first];
    arr[first]= arr[second]
    arr[second]= temp;
  }
}
