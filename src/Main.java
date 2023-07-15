public class Main {
    public static void main(String[] args) {

        String test1 = "vinay";
        String test2 = "vinay";
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test1==test2);

        String name1 = new String("Vinay");
        String name2 = new String("Vinay");
        System.out.println(name1==name2);

        float a = 453.1234f;
        System.out.printf("Formatted number is %.2f", a);
        System.out.println();
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 3));
    }
}