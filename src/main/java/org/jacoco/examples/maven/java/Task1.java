public class Task_1 {
        
    private static String give_me_one() {
        return "1";
    }
    
    public static void Main(String[] args) {
        int one = give_me_one();
        int two = Integer.parseInt(one) * 2;
        System.out.println(two);
    }
}