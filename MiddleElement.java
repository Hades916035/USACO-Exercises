public class MiddleElement {
    public String middleElement(String[] array) {
        if(array.length == 0) {
            return "";
        }
        return array[(int)(array.length / 2)];
    }
}
