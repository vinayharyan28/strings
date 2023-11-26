package stringprobleams;


public class InputString {
    public static boolean checkPalindrome(String s){
        int start=0, end=s.length()-1;
        while (start < end){
            if (s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(checkPalindrome("racecar"));

//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        String fullName = sc.nextLine();
//        System.out.println("Name: " + name);
//        System.out.println("Full Name: " + fullName);

    }
}
