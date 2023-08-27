

public class MyClass{
    public static void main(String args[]){
        System.out.println("Welcome to Binary Search");
        
        int arr [] = {-34, 44, 56, 76, 87, 88, 99,278};
        int target = 87;
        int ans = binarySearch(arr, target);
        
        System.out.println(ans);
        
    }
    
   static int binarySearch(int arr[], int target) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
        //find the middle
        int middle = start + (end - start) / 2;

        if (target < arr[middle]) {
            end = middle - 1;  // Adjust the end pointer
        } else if (target > arr[middle]) {
            start = middle + 1;  // Adjust the start pointer
        } else {
            // answer found
            return middle;
        }
    }
    return -1;  // Return -1 to indicate that the target was not found
}

}
