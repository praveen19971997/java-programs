public class floor {
    public static int floo(int arr[],int target){
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
            else if(target<=arr[mid]){
                return arr[mid];
            }
        }
        return arr[end];
    }
    public static void main(String args[]){
    int arr[]={2,3,5,9,14,16,18};
    int target=8;
    System.out.println(floo(arr, target));

    }
}
