import java, hashmap.

Driver;

Hashmap <Integer, Integer> map = {}
int[] arr = {1, 2, 2, 3, 4, 4,}
for(int i=0; i<arr.length, i++) {
    if(map.contains(arr[i])) {
        int temp = map.get(arr[i]);
        map.put(arr[i], temp + 1);
    }
    else {
        map.put(arr[i], 1)
    }
}
for(int k=0; k<arr.length; k++) {
    System.out.println(arr[k]);
    System.out.println(";");
    System.out.println(map.get(k));
}
}
}

