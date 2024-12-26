public class SwapFirstLast {
    public String[] swapFirstLast(String[] array) {
        if(array.length == 0) {
            return array;
        }
        String holder = array[array.length - 1];
        array[array.length - 1] = array[0];
        array[0] = holder;
        return array;
    }
}
