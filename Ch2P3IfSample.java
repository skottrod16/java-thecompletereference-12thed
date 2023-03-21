public class Ch2P3IfSample {
    public static void main(String[] args){
        int x = 10;
        int y = 20;

        if (x < y ) {
            System.out.println("x is less than y");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("x now equal to y");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("x now greater than y");
        }
        //this line won't display anything
        if (x == y) {
            System.out.println("You won't see this!");
        }
    }
}
