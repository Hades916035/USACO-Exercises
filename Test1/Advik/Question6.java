Driver {
    int arr[] = {1, 1, 1, 2, 2, 3}; int curr=0; int num=arr.length
    for(int i=0; i<arr.length; i++) {
        for(int k=0; i<arr.length; k++) {
            if(arr[i] == arr[k]) {
                arr[k] = -1;
                num = num-1;
            }
        }
        int index = 0
        int[] arb = new int[num]
        for(int z=0; z<arr.length; z++) {
            if(arr[z]!=-1) {
                arb[index] = arr[z];
                index++;
            }
        }
        for(int x=0; x<arb.length; x++) {
            System.out.println(arb[x]);
        }
    }
}
