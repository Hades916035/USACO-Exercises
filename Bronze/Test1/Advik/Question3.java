Driver {
    int[] arr = [1,2,2,2,3,4]
    int target =2
    for(int i=0; i<arr.length, i++) {
        if(arr[i] == target) {
            System.out.println(i)
            int pos = i;
            found = true;
        }
    }
    for(int k=arr.length, k>pos, k++) {
        if(arr[k]==target) {
            System.out.println(k)
        }
    }
    if(!foundf) {
        System.out.print(-1);
    }
