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

/*
 -The Java If Statement determines the flow of execution based on whether some condition is true or false. Its simplest form is: 
    if(condition)statement
-Condition is a Boolean expression. (A boolean expression is one that evaluates to either true or false.) If condition is true, then the statement is executed. If the statement is false, then the statement is bypassed. 

>>>Basic Relational Operators<<<
Operator    Meaning
<           Less than
>           Greater than
==          Equal to
 */
