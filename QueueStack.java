import java.util.Stack;

class QueueStack {

    private Stack<Integer> st1 = null;
    private Stack<Integer> st2 = null;

    public QueueStack() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int x) {
        if (st1.size() <= 0)
            st1.add(x);
        else {
            st2.add(st1.pop());
            st1.add(x);
        }

    }

    public int pop() {
        if (empty())
            return -1;
        if (st1.size() > 0)
            return st1.pop();
        else
            return st2.pop();
    }

    public int peek() {
        if (empty())
            return -1;
        if (st1.size() > 0)
            return st1.peek();
        else
            return st2.peek();
    }

    public boolean empty() {
        if (st1.isEmpty() && st2.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        QueueStack qs = new QueueStack();

        System.out.println(qs.pop());
        System.out.println(qs.peek());
        qs.push(1);
        qs.push(2);
        qs.push(3);
        System.out.println(qs.pop());
        qs.push(4);
        System.out.println(qs.peek());
        System.out.println(qs.pop());
        System.out.println(qs.peek());
    }
}