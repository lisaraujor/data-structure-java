package stack;

public class StackApp {
    
    public static void main(String[] args){
        
        Stack<Integer> stack = new Stack<>();

        System.out.println("Is empty? " + stack.isEmpty());
        
        stack.push(15);
        stack.push(34);
        stack.push(3);
        stack.push(9);

        System.out.println(stack);
        System.out.println();

        stack.pop();

        System.out.println(stack);
        System.out.println();

        System.out.println("Is empty? " + stack.isEmpty());

        stack.push(72);
        System.out.println();
        System.out.println(stack);
        System.out.println(stack.top);
    }
}
