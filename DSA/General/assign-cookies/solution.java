import java.util.Arrays;

class Solution {
    public int findMaximumCookieStudents(int[] Student, int[] Cookie) {
       mergeSort(Student,0,Student.length-1);
       mergeSort(Cookie,0,Cookie.length-1);
        int l=0;
        int r=0;
        while(l<Cookie.length && r<Student.length) {
            if(Cookie[l] >= Student[r]) {
                r+=1;
            }
            l+=1;
        }
        return r;
    }

    public void mergeSort(int[] nums, int low, int high) {
        if(low>=high) {
            return;
        }
        int mid=(low+high)/2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid+1,high);
        merge(nums,low,mid,high);
    }

    public void merge(int[] nums, int low, int mid, int high) {
        int[] arr= new int[high-low+1];
        int left=low;
        int i=0;
        int right=mid+1;
        while(left<=mid && right<=high) {
            if(nums[left]<=nums[right]) {
                arr[i]=nums[left];
                left++;
                i++;
            }
            else {
                arr[i]=nums[right];
                right++;
                i++;
            }
        }
        while(left<=mid) {
            arr[i]=nums[left];
            left++;
            i++;
        }

        while(right<=high) {
            arr[i]=nums[right];
            right++;
            i++;
        }

        for (int k = 0; k < arr.length; k++) {
            nums[low + k] = arr[k];
        }
    }
}