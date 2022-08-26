import java.util.Stack;

public class _232_Implement_Queue_using_Stacks {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public _232_Implement_Queue_using_Stacks() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (s1.size() == 0)     return -1;

        int count = 1;
        int size = s1.size();

        while (count <= size-1) {
            int temp = s1.pop();
            s2.push(temp);
            count++;
        }
        int result = s1.pop();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return result;
    }

    public int peek() {
        int result =0;
        while(!s1.isEmpty())
        {
            if(s1.size()==1)
                result = s1.peek();
            s2.push(s1.pop());

        }
        while(!s2.isEmpty())
            s1.push(s2.pop());
        return result;
    }

    public boolean empty() {
        return s1.size() == 0;
    }

    public static void main(String[] args) {
        _232_Implement_Queue_using_Stacks queue = new _232_Implement_Queue_using_Stacks();
        queue.push(6);
        queue.push(3);
        queue.push(2);

        System.out.println(queue.empty());

        queue.s1.forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        queue.s2.forEach(i -> System.out.print(i + "\t"));
        System.out.println();

        System.out.println("Peek: " + queue.peek());
        queue.s1.forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        queue.s2.forEach(i -> System.out.print(i + "\t"));
        System.out.println();

        System.out.println("Pop: " +queue.pop());
        queue.s1.forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        queue.s2.forEach(i -> System.out.print(i + "\t"));
        System.out.println();

        System.out.println("Pop: " +queue.pop());
        queue.s1.forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        queue.s2.forEach(i -> System.out.print(i + "\t"));
        System.out.println();

        System.out.println("Pop: " +queue.pop());
        queue.s1.forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        queue.s2.forEach(i -> System.out.print(i + "\t"));
        System.out.println();
    }
}
