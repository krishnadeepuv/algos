import java.util.Stack;

class QueueStack {

    private Stack<Integer> st = new Stack<Integer>();
    private Stack<Integer> st1 = new Stack<Integer>();

    public QueueStack() {
        st = new Stack<Integer>();
        st1 = new Stack<Integer>();
    }

    public void push(int x) {
        st.push(x);
    }

    public int pop() {
        if (!st1.empty())
            return st1.pop();
        else if (st.size() > 0) {
            int cnt = st.size();
            for (int i = 0; i < cnt; i++)
                st1.push(st.pop());
            return st1.pop();
        } else
            return -1;

    }

    public int peek() {
        if (!st1.empty())
            return st1.peek();
        else if (st.size() > 0) {
            int cnt = st.size();
            for (int i = 0; i < cnt; i++) {
                st1.push(st.pop());
            }
            return st1.peek();
        } else
            return -1;
    }

    public boolean empty() {
        if (st.size() > 0 || st1.size() > 0)
            return false;
        else
            return true;
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