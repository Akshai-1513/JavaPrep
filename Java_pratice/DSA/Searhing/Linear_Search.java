package DSA.Searhing;
/*
What is Linear Search ?
    Linear search, also known as sequential search, is a simple algorithm for finding a specific value (the "target")
    within a list or array. It works by examining each element of the list one by one, starting from the beginning,
    until the target is found or the end of the list is reached.

What is the best case in the linear Search?
    Getting the element at the first index of the array.
 */
public class Linear_Search {

    // The method is to get the index of the targetted value.
    static int linearSearch(int nums[] , int target){
        if(nums.length < 1) return  -1; // THe index value cant be the -1, that's why the -1.

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) return i;
        }
        return -1;
    }

    // This method is to find the target element if found return element.
    static int linearSearch2(int nums[] , int target){
        if(nums.length < 1) return  -1; // THe index value cant be the -1, that's why the -1.

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) return i;
        }
        return -1;
    }
    // This method can be return in boolean.


    //Searching in the 2D array.
    static int[] linearSearch3(int nums[][], int target){
        for(int row = 0; row < nums.length; row++){
            for(int col = 0; col < nums[row].length; col++){
                if(nums[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1 , -1};
    }
}
