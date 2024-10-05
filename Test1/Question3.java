public class Question3{
    public static void main(String[] args){
        int arr[]={1,2,2,3,4,5,6,7,8,9};
        int target = 2; int start = -1; int end = -1;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == target && start==-1)
                start=i;
            else if(arr[i]!=target && start != -1 && end == -1)
                end=i-1;
        }
        System.out.println("(" + start + ", " + end + ")");
    }
}