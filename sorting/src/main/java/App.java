class App {
    public static void main(String[] args) {
        System.out.println("Hello Lambdas");

        Sorting sorting = new Sorting();

        System.out.println("Sorting with lambda");
        Long start = System.currentTimeMillis();
        sorting.sortByNameASCWithLambda();
        Long stop = System.currentTimeMillis();
        System.out.println(stop - start);

        System.out.println("Sorting with natural order");
        start = System.currentTimeMillis();
        sorting.sortByNameASCWithNaturalOrder();
        stop = System.currentTimeMillis();
        System.out.println(stop - start);
    }
}