public class ContainsCat {
    public static boolean allCats(String[] arr) {
        for(String word : arr) {
            if(!(word.contains("cat"))) {
                return false;
            }
        }
        return true;
    }
}
