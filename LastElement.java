public class LastElement {
    public String lastElement(String[] array) {
        if(array.length == 0) {
            return "";
        }
        return array[array.length - 1]; 
    }
}
