import java.util.LinkedList;
import java.util.Queue;

public class _225_Implement_Stack_using_Queues {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public _225_Implement_Stack_using_Queues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        if(q1.size() == 0) return -1;

        int count = 1;
        int size = q1.size();
        while (count <= size - 1){
            int temp = q1.poll();
            //System.out.println("temp: " +temp);
            q2.add(temp);
            count++;
        }

        int result = q1.poll();

        while (!q2.isEmpty()){
            q1.add(q2.poll());
        }
        //q1.add(result);
        return result;
    }

    public int top() {
        if(q1.size() == 0) return -1;

//        for(int i = 1; i <= q1.size() - 1; i++){
//            int temp = q1.poll();
//            q2.add(temp);
//        }
        int count = 1;
        int size = q1.size();
        while (count <= size - 1){
            int temp = q1.poll();
            //System.out.println("temp: " +temp);
            q2.add(temp);
            count++;
        }

        int result = q1.poll();

        while (!q2.isEmpty()){
            q1.add(q2.poll());
        }
        q1.add(result);
        return result;
    }

    public boolean empty() {
        return q1.size() == 0;
    }

    public static void main(String[] args) {
        _225_Implement_Stack_using_Queues stack = new _225_Implement_Stack_using_Queues();
        stack.push(6);
        stack.push(3);
        stack.push(2);

        System.out.println(stack.empty());

        stack.q1.forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        stack.q2.forEach(i -> System.out.print(i + "\t"));
        System.out.println();

        System.out.println("Top: " +stack.top());

        stack.q1.forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        stack.q2.forEach(i -> System.out.print(i + "\t"));
        System.out.println();

        System.out.println("Pop: " + stack.pop());
        stack.q1.forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        stack.q2.forEach(i -> System.out.print(i + "\t"));
        System.out.println();

        System.out.println("Pop: " + stack.pop());
        stack.q1.forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        stack.q2.forEach(i -> System.out.print(i + "\t"));
        System.out.println();

        System.out.println("Pop: " + stack.pop());
        stack.q1.forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        stack.q2.forEach(i -> System.out.print(i + "\t"));
        System.out.println();

    }
}