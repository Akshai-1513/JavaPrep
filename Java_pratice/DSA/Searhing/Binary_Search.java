package DSA.Searhing;

public class Binary_Search {

    public static void main(String[] args) {
        int nums[] = {-12,-1,0,2,3,4,5,6,34,43,76,88};
        int nums2[] = {88, 78, 65,43, 34,2,0, -1,-23,-52};
        int target = 43;
        System.out.println(Binary_Search_IfA(nums, target));
        System.out.println(Binary_Search_IfD(nums2, target));
    }
    static int Binary_Search_IfA(int nums[], int target){ //
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > nums[mid]) start = mid + 1;
            else if(target < nums[mid]) end = mid - 1;
            else return mid;// This returns the index of the middle element.
        }
        return -1; // This return if there is no middle value found.
    }

    static int Binary_Search_IfD(int nums[], int target){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < nums[mid]) start = mid + 1;
            else if(target > nums[mid]) end = mid - 1;
            else return mid;// This returns the index of the middle element.
        }
        return -1;
    }
}
