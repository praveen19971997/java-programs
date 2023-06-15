public class BinarySearch {
    public static int Binary(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else if(target==arr[mid]){
                return mid;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,6,7};
        int target=4;
        int ans=Binary(arr, target);
        System.out.println(ans);
    }
    
}
