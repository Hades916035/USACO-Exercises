Public class Main {
    class fact(x) {
        if(x==0) {
            return 1;
        } else {
            return x*fact(x-1)
        }
    }
    public static void main(String[] args) {
        int x=5
        System.out.println(fact(x))
    }
}