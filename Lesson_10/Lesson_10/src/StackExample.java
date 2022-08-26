import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(5);
        stack.add(1);
        stack.add(6);
        stack.add(9);
        stack.add(2,3);
        stack.addElement(8);
        stack.push(20);

        stack.forEach(i -> System.out.print(i + "\t"));
        System.out.println();

        System.out.println("Phần tử đầu tiên: " + stack.peek());
        System.out.println("Phần tử đầu tiên: " + stack.pop());
        //Pop: hiển thị phần tử đầu tiên và xóa nó: 8

        stack.forEach(i -> System.out.print(i + "\t"));
        System.out.println();
    }
}
