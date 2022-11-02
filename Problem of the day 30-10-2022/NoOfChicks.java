class NoOfChicks {

    public static long noOfChicks(int N) {
        // Code here
        long parent = 1;
        long count = 1;
        int dec = 1;
        for (int i = 1; i <= N - 1; i++) {
            parent = parent * 2 + parent;
            if (i >= 6) {
                parent -= dec;
                dec *= 3;
            }
        }
        return parent;
    }
    
    public static void main(String[] args) {
        System.out.println(noOfChicks(8));
    }
}