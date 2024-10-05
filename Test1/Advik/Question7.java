driver code:
    int[] arr = {1, 2, 3, 0, 5};
    int min= arr[0];
    for(int i=0; i<arr.length; i++) {
        if(arr[i]<min) {
            min=arr[i];
            int pos = i;
        }
        int max = arr[pos];
        for(int k=pos, k<arr.length, k++) {
            if(arr[k] > max;) {
                max = arr[k];
        }
    }
    System.out.println(max-min);
}
}